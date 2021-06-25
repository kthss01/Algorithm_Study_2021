package baekjoon.chobo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_6124 {
    /*
        Good Grass

        patch - 부분
        rectilinear 직선적

        row column이 주어지고 각 값들이 주어질 때
        3x3 의 합이 가장 큰 row column 구하기
        값이 같으면 lowest row
        row 같으면 lowest column
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        int nr = Integer.parseInt(token.nextToken());
        int nc = Integer.parseInt(token.nextToken());

        int[][] arr = new int[nr][nc];
        for (int i = 0; i < nr; i++) {
            token = new StringTokenizer(br.readLine());
            for (int j = 0; j < nc; j++) {
                arr[i][j] = Integer.parseInt(token.nextToken());
            }
        }

        int sum = 0;
        int r = 0;
        int c = 0;
        for (int i = 0; i < nr - 2; i++) {
            for (int j = 0; j < nc - 2; j++) {
                int temp = 0;
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        temp += arr[i + k][j + l];
                    }
                }
                if(temp > sum) {
                    sum = temp;
                    r = i;
                    c = j;
                }
            }
        }

        // 0부터 시작해서
        r++;
        c++;

        System.out.println(sum);
        System.out.println(r + " " + c);
    }
}
