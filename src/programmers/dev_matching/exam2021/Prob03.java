package programmers.dev_matching.exam2021;

public class Prob03 {
    /*
        벽돌깨기 문제
        상 하 좌 우 방향으로 3개 이상 연결되면 터지는 게임
        빈칸 없이 가장 아래부터 쌓임
        연쇄적으로 터짐
        다 터져야 다음꺼 떨어짐
        연결 여러개면 한번에 터짐

        2차원 배열 주어질 때
        게임 모두 진행 후 보드 상태 리턴

        떨어뜨린 위치 색으로 구성
        떨어드린 위치 1 ~ 6
        색 1 ~ 9
     */
    public static void main(String[] args) {
        int[][] macaron = { {1,1}, {2,1}, {1,2}, {3,3}, {6,4}, {3,1}, {3,3}, {3,3}, {3,4}, {2,1} };

        String[] answer = new Solution().solution(macaron);

        for (String ans : answer) {
            System.out.print(ans + " ");
        }
        System.out.println();
    }

    static class Solution {
        public int[] addBoard(int[][] board, int pos, int color) {
            int[] p = new int[2];
            for (int i = 5; i >= 0; i--) {
                if (board[i][pos - 1] == 0) {
                    board[i][pos - 1] = color;
                    p[0] = i;
                    p[1] = pos-1;
                    break;
                }
            }
            return p;
        }

        public boolean checkBoard(int[][] board, int[] pos) {

            int color = board[pos[0]][pos[1]];


            return false;
        }

        public String[] solution(int[][] macaron) {
            String[] answer = new String[6];

            int[][] board = new int[6][6];

            for (int[] m : macaron) {
                int pos = m[0];
                int color = m[1];

                int[] p = addBoard(board, pos, color);
                checkBoard(board, p);
            }

            return answer;
        }
    }
}
