package baekjoon.chobo2;

import java.util.Scanner;

public class Baekjoon_16486 {
    /*
        운동장 한 바퀴

        운동장 한 바퀴 값 구하기

        A, B 반원, C 직사각형
        C의 가로길이 d1, A의 반지르 d2 값이 주어질 때
        운동장의 한 바퀴 둘레 구하기
        원주율(파이)는 3.141592

        d1
        d2
        (d1, d2 100,000 이하의 양의 정수)
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int d1 = sc.nextInt();
        int d2 = sc.nextInt();

        final double PI = 3.141592;

        System.out.printf("%.6f\n", d1 * 2 + 2 * PI * d2);
    }
}
