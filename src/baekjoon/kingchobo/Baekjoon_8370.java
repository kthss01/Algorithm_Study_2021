package baekjoon.kingchobo;

import java.util.Scanner;

public class Baekjoon_8370 {
    /*
        Plane

        acquisition 습득, 구입, 인수, 매입

        비즈니스석 좌석 수와 이코노미석 좌석 수가 주어질 때
        이용가능한 모든 좌석 수 구하기

        n1,k1,n2,k2 (1 <= n,k1,n2,k3 <= 1000) 빈 칸 띄어서
        한 줄여 결과 출력
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int k1 = sc.nextInt();
        int n2 = sc.nextInt();
        int k2 = sc.nextInt();

        int result = n1 * k1 + n2 * k2;

        System.out.println(result);
    }
}
