package baekjoon.chobo2;

import java.util.Scanner;

public class Baekjoon_16239 {
    /*
        Nadan

        금액 K 와 N이 주어질 때
        N만큼 금액을 나눠서 출력하기 (랜덤하게)

        K (100 <= K <= 1000000)
        N (1 <= N <= 100)

        alongside - 옆에, 나란히, ~와 함께
        크로아티아 통화 : 쿠나 1쿠나 182.95 원
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int n = sc.nextInt();

        int c = 0;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
//            int t = i != n - 1 ? (int) (Math.random() * c) + 1 : c;
            int t = i != n - 1 ? i + 1  : k - c;
            sb.append(t).append("\n");
            c += t;
        }

        System.out.println(sb);
    }
}
