package programmers.dev_matching;

public class MatrixBorderRotate {
    /*
        행렬 테두리 회전하기

        rows x columns 크기 행렬
        행렬 1부터 rows x columns 까지 의 숫자가 한 줄씩 순서대로 적혀있음
        이 행렬에서 직사각형 모양의 범위를 여러 번 선택해
        테두리 부분에 있는 숫자들을 시계방향으로 회전시키려 함
        각 회전은 (x1, y1, x2, y2) 정수 4개로 표현
            x1 행 y1 열부터 x2 행 y2 열까지의 영역에 해당하는 직사각형에서
            테두리에 있는 숫자들을 한 칸씩 시계방향으로 회전

        행렬의 세로 길이 (행 개수) rows, 가로 길이 (열 개수) columns
        그리고 회전들의 목록 queries가 주어질 때
        각 회전들을 배열에 적용한 뒤
        그 회전에 의해 위치가 바뀐 숫자들 중
        가장 작은 숫자들을 순서대로 배열에 담아 return

        제한 사항
        rows는 2 이상 100 이하인 자연수
        columns 2 ~ 100
        처음에 행렬에는 가로 방향으로 숫자가 1부터 하나씩 증가하면서 적혀있음
        queries의 행의 개수(회전의 개수) 1 ~ 10,000
        queries의 각 행은 4개의 정수 [x1, y, x2, y2]
            x1행 y1열부터 x2행 y2열까지 영역의 테두리를 시계방향으로 회전한다는 뜻
            1 <= x1 < x2 <= rows, 1 <= y1 < y2 <= columns
            모든 회전은 순서대로 이루어짐
            예를 들어 두 번째 회전에 대한 답은 첫 번째 회전을 실행한 다음,
            그 상태에서 두 번째 회전을 실행했을 때 이동한 숫자 중 최솟값
     */
    public static void main(String[] args) {
        int rows = 6;
        int columns = 6;
        int[][] queries = { {2,2,5,4}, {3,3,6,6}, {5,1,6,3} };

        int[] answer = new Solution().solution(rows, columns, queries);
        for (int a : answer) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    static class Solution {
        public int myRotateMatrix(int[][] matrix, int x1, int y1, int x2, int y2) {
            int min = 10001;

            int cur = matrix[x1][y1];
            int next = matrix[x1][y1];
            int i = x1;
            int j = y1;

            // right
            while (j <= y2) {
                cur = next;
                min = Math.min(cur, min);
                if (j == y2) {
                    next = matrix[i + 1][j];
                    matrix[i + 1][j] = cur;
                    i++;
                    break;
                } else {
                    next = matrix[i][j + 1];
                    matrix[i][j + 1] = cur;
                    j++;
                }
            }

            // down
            while (i <= x2) {
                cur = next;
                min = Math.min(cur, min);
                if (i == x2) {
                    next = matrix[i][j - 1];
                    matrix[i][j - 1] = cur;
                    j--;
                    break;
                } else {
                    next = matrix[i + 1][j];
                    matrix[i + 1][j] = cur;
                    i++;
                }
            }

            // left
            while (j >= y1) {
                cur = next;
                min = Math.min(cur, min);
                if (j == y1) {
                    next = matrix[i - 1][j];
                    matrix[i - 1][j] = cur;
                    i--;
                    break;
                } else {
                    next = matrix[i][j - 1];
                    matrix[i][j - 1] = cur;
                    j--;
                }
            }

            // up
            while (i >= x1) {
                cur = next;
                min = Math.min(cur, min);
                if (i != x1) {
                    next = matrix[i - 1][j];
                    matrix[i - 1][j] = cur;
                    i--;
                } else {
                    break;
                }
            }

            return min;
        }

        public int rotateMatrix(int[][] m, int x1, int y1, int x2, int y2) {
            // 회전 방법을 현재 값을 다음 값에 넣으려고해서 어려웠던거
            // 현재 값에 이전 값을 넣는게 편함

            int x = x1;
            int y = y1;
            int[] dx = { 0, -1, 0, 1 };
            int[] dy = { 1, 0, -1, 0 };
            int dir = 3;
            int temp = m[x][y];
            int min = temp;

            while (true) {
                if (x == x2 && y == y1) {
                    dir = 0;
                }
                if (x == x2 && y == y2) {
                    dir = 1;
                }
                if (x == x1 && y == y2) {
                    dir = 2;
                }

                m[x][y] = m[x + dx[dir]][y + dy[dir]];
                x += dx[dir];
                y += dy[dir];
                min = Math.min(m[x][y], min);

                if (x == x1 && y == y1) {
                    m[x1][y1+1] = temp;
                    break;
                }
            }

            return min;
        }

        public int[] solution(int rows, int columns, int[][] queries) {
            int[] answer = new int[queries.length];

            int[][] matrix = new int[rows][columns];
            int num = 1;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    matrix[i][j] = num++;
                }
            }

            for (int i = 0; i < queries.length; i++) {
                int x1 = queries[i][0] - 1;
                int y1 = queries[i][1] - 1;
                int x2 = queries[i][2] - 1;
                int y2 = queries[i][3] - 1;

                answer[i] = rotateMatrix(matrix, x1, y1, x2, y2);
//            printMatrix(matrix, rows, columns);
            }

            return answer;
        }

        private void printMatrix(int[][] matrix, int rows, int columns) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.printf("%2d ", matrix[i][j]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

