package baekjoon.chobo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_17263 {
    /*
        Sort 마스터 배지훈
        정렬된 배열 A의 마지막 원소 출력하기

        N 1 ~ 500,000
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer token = new StringTokenizer(br.readLine());

        int ans = 0;
        while (token.hasMoreTokens()) {
            int num = Integer.parseInt(token.nextToken());
            ans = Math.max(ans, num);
        }

        System.out.println(ans);
    }
}
