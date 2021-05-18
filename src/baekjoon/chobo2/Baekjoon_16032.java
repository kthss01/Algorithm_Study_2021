package baekjoon.chobo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_16032 {
    /*
        Income Inequality

        데이터가 주어질 때 평균 보다 낮은 데이터의 갯수 출력하기

        n (2 <= n <= 10000)
        ai (1 <= i <= n) value 1 ~ 100000

        0면 종료

        hinder - 방해하다
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int n = Integer.parseInt(br.readLine());

            if (n == 0) {
                break;
            }

            StringTokenizer token = new StringTokenizer(br.readLine());

            int[] arr = new int[n];
            int sum = 0;

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(token.nextToken());
                sum += arr[i];
            }

            int avg = sum / n;
            int count = 0;

            for (int i = 0; i < n; i++) {
                if (arr[i] <= avg) {
                    count++;
                }
            }

            sb.append(count).append("\n");
        }

        System.out.println(sb);
    }
}
