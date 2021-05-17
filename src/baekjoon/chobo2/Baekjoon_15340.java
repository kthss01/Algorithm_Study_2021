package baekjoon.chobo2;

import java.util.Scanner;

public class Baekjoon_15340 {
    /*
        Sim Card

        3 mobile operators 가 있는데
        이 중 가장 비용이 적은 곳을 출력하기

        c d (1 <= c, d <= 1000) call data
        0 0 종료
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int c = sc.nextInt();
            int d = sc.nextInt();

            if (c == 0 && d == 0) {
                break;
            }

            int pt = 30 * c + 40 * d;
            int pc = 35 * c + 30 * d;
            int pp = 40 * c + 20 * d;

            int cost = Math.min(pt, Math.min(pc, pp));

            System.out.println(cost);
        }
    }
}
