package baekjoon.kingchobo;

import java.math.BigInteger;
import java.util.Scanner;

public class Baekjoon_15372 {
    /*
        A Simple Problem.

        양수 N이 주어질 때
        N = b * k 에서
        최소 양의 값 K을 구하기

        N이 주어질 때
        N의 제곱이 배수가 되는 최소의 K값 구하기
        -> 문제가 헷갈렷는데 그냥 N제곱 구하는거였음
        근데 N값이 크니까 처리를 어떻게 하냐는 문제였음

        테스트 케이스 T (1 <= T <= 200000)
        N (1 <= N <= 200000)
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            BigInteger bi = new BigInteger(String.valueOf(n));
            System.out.println(bi.multiply(bi));
        }
    }
}
