package baekjoon.kingchobo;

import java.util.Scanner;

public class Baekjoon_21612 {
    /*
        Boiling Water

        P = 5 x B - 400

        B 가 주어질 때 식에 의해 P를 구하고
        100 보다 낮으면 1
        같은면 0
        높으면 -1 출력
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int b = sc.nextInt();

        int p = 5 * b - 400;

        System.out.println(p);
        System.out.println(Integer.compare(100, p));
//        System.out.println(p == 100 ? 0 : (p < 100 ? 1 : -1));
    }
}
