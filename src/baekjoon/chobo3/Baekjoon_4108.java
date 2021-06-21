package baekjoon.chobo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_4108 {
    /*
        지뢰찾기
        지뢰밭 R X C 개 칸
        모든 칸 최대 8개의 인접한 칸을 갖고 있음
        모든 비어있는 칸마다 인접해 있는 지뢰의 개수 세서 적어야함

        입력
        여러 개의 테스트 케이스
        각 테스트 케이스의 첫 번째 줄에 행, 열의 수 R, C (1 <= R,C <= 100)
        지뢰 *, 빈 공간 .
        0 0 입력 종료

        출력
        C개의 문자들이 포함된 R개의 줄을 출력
        . 대신 인접한 칸에 위치한 지뢰의 수로 변경해 출력
        *은 그대로 출력
        문자 사이에 공백이나 줄 사이에 공백 줄이 있어선 안 된다.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] my = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] mx = {-1, 0, 1, -1, 1, -1, 0, 1};

        while (true) {
            StringTokenizer token = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(token.nextToken());
            int c = Integer.parseInt(token.nextToken());

            if (r == 0 && c == 0)
                break;

            char[][] board = new char[r][c];

            for (int i = 0; i < r; i++) {
                board[i] = br.readLine().toCharArray().clone();
            }

//            for (int i = 0; i < r; i++) {
//                for (int j = 0; j < c; j++) {
//                    if (board[i][j] == '.') {
//                        board[i][j] = findMine(i, j, board);
//                    }
//                }
//            }

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if (board[i][j] == '*')
                        continue;
                    int cnt = 0;
                    for (int k = 0; k < 8; k++) {
                        int ny = i + my[k];
                        int nx = j + mx[k];
                        if (ny < 0 || nx < 0 || ny >= r || nx >= c)
                            continue;
                        if (board[ny][nx] == '*')
                            cnt++;
                    }
                    board[i][j] = (char) (cnt + '0');
                }
            }

            for (int i = 0; i < r; i++) {
                System.out.println(String.valueOf(board[i]));
            }
        }
    }

    private static char findMine(int r, int c, char[][] board) {
        int sum = 0;

        // left
        if (r - 1 >= 0 && board[r - 1][c] == '*') sum++;
        // top
        if (c - 1 >= 0 && board[r][c - 1] == '*') sum++;
        // right
        if (c + 1 <= board[r].length - 1 && board[r][c + 1] == '*') sum++;
        // bottom
        if (r + 1 <= board.length - 1 && board[r + 1][c] == '*') sum++;
        // left-top
        if (r - 1 >= 0 && c - 1 >= 0 && board[r - 1][c - 1] == '*') sum++;
        // right-top
        if (r - 1 >= 0 && c + 1 <= board[r].length - 1 && board[r - 1][c + 1] == '*') sum++;
        // left-bottom
        if (r + 1 <= board.length - 1 && c - 1 >= 0 && board[r + 1][c - 1] == '*') sum++;
        // right-bottom
        if (r + 1 <= board.length - 1 && c + 1 <= board[r].length - 1 && board[r + 1][c + 1] == '*') sum++;

        return (char) (sum + '0');
    }
}
