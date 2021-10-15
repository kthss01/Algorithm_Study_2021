package baekjoon.chobo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_17173 {
    /*
        배수들의 합

        자연수 N과 M개의 자연수 Ki가 주어진다
        Ki 중 적어도 하나의 배수이면서 1 이상 N 이하인 수의 합 구하기

        N, M (2 <= N <= 1000, 1 <= M < N)
        M개의 정수 Ki (2 <= Ki <= 1000)
        동일한 Ki 주어지지 않으며 오름차순 정렬

        배술의 합 출력
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(token.nextToken());
        int m = Integer.parseInt(token.nextToken());

        token = new StringTokenizer(br.readLine());

        int[] arr = new int[m];

        for (int i = 0; i < m; i++) {
            arr[i] = Integer.parseInt(token.nextToken());
        }

        int ans = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < m; j++) {
                if (i % arr[j] == 0) {
                    ans += i;
                    break;
                }
            }
        }

        System.out.println(ans);
    }
}
