package baekjoon.chobo3;

import java.util.Scanner;

public class Baekjoon_17256 {
    /*
        달달함이 넘쳐흘러

        케이크 수
            3개의 자연수 x, y, z 순서쌍 (자연수 1 이상 정수 의미)
            a (a.x, a.y, a.z)로 나타낼 수 있음
        a, b 에서 a = b
        a.x = b.x, a.y = b.y, a.z = b.z 의미

        a 케이크 b
            (a.z + b.x, a.y * b.y, a.x + b.z) 의미

        케이크 수 a, c가 주어졌을 때
        만족하는 b 구하기
            a 케이크 b = c
        a, c는 b가 항상 유일하게 존재하도록 주어짐

        입력
        a
        c
            1 ~ 100
        출력
        b.x b.y b.z 공백 구분
        b 1 ~ 100 반드시 유일하게 존재
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ax = sc.nextInt();
        int ay = sc.nextInt();
        int az = sc.nextInt();
        int cx = sc.nextInt();
        int cy = sc.nextInt();
        int cz = sc.nextInt();

        /*
            a.z + b.x = c.x
            a.y * b.y = c.y
            a.x + b.z = c.z
         */

        int bx = cx - az;
        int by = cy / ay;
        int bz = cz - ax;

        System.out.println(bx + " " + by + " " + bz);
    }
}
