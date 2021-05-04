package baekjoon.kingchobo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_20332 {
    /*
        Divvying Up

        상금을 모두 받았을 때 3명이서 정확하게 나눠질 수 있는지 확인하기

        n (1 <= n < 10^4)
        w1, w2, ... (1 <= w <= 10^5)
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int sum = 0;

        StringTokenizer token = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            int amount = Integer.parseInt(token.nextToken());
            sum += amount;
        }

        System.out.println(sum % 3 == 0 ? "yes" : "no");
    }
}
