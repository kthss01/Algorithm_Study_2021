package baekjoon.chobo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_17363 {
    /*
        우유가 넘어지면?

        문자열 기울이기 문제 (왼쪽으로 넘어뜨렸을 때)

        . .
        O O
        - |
        | -
        / \
        ^ <
        < v
        v >
        > ^
        이런식으로 바꿈

        입력
        N, M 가로 세로 (1 ~ 100)
        M 글자의 문자열 공백 포함x 표에 주어진 문자로만 이루어져있음
        출력
        왼쪽으로 넘어뜨렸을 때 결과 출력
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(token.nextToken());
        int m = Integer.parseInt(token.nextToken());

        char[][] board = new char[n][m];
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                board[i][j] = str.charAt(j);
            }
        }

        char[][] board2 = new char[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                char ch = '.';
                switch (board[j][m - i - 1]) {
                    case 'O': ch = 'O'; break;
                    case '-': ch = '|'; break;
                    case '|': ch = '-'; break;
                    case '/': ch = '\\'; break;
                    case '\\': ch = '/'; break;
                    case '^': ch = '<'; break;
                    case '<': ch = 'v'; break;
                    case 'v': ch = '>'; break;
                    case '>': ch = '^'; break;
                }

                board2[i][j] = ch;
            }
        }

        for (int i = 0; i < m; i++) {
            sb.append(board2[i]).append("\n");
        }
        System.out.println(sb);
    }
}
