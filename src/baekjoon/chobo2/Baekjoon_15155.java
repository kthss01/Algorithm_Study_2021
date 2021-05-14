package baekjoon.chobo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_15155 {
    /*
        Analysis of Advanced Analytics

        한 학기에 사용하는 페이지가 주어지고
        한 노트북에 사용가능한 페이지가 주어질 때
        몇개의 노트북이 필요한지 구하기

        n k
            (1 <= n <= 1000, 학기에 사용하는 페이지 수)
            (1 <= k <= 1000, 각 노트북에 페이지)
        a1, a2, ... ,an (1 <= ai <= k) space으로 구분
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer token = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(token.nextToken());
        int k = Integer.parseInt(token.nextToken());

        int count = 1;

        token = new StringTokenizer(br.readLine());

        int cur = 0;

        while (token.hasMoreTokens()) {
            int a = Integer.parseInt(token.nextToken());

            if (cur + a <= k) {
                cur += a;
            } else {
                cur = a;
                count++;
            }
        }


        System.out.println(count);
    }

}
