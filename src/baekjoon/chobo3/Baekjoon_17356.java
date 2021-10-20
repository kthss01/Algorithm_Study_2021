package baekjoon.chobo3;

import java.util.Scanner;

public class Baekjoon_17356 {
    /*
        욱 제

        욱제력 구하기
        B - A / 400 = M

        욱제력 = 1 / (1 + 10^M)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double m = (b - a) / 400.0;

        double ans = 1 / (1 + Math.pow(10, m));

        System.out.println(ans);
    }
}
