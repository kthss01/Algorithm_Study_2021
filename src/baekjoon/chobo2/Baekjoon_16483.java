package baekjoon.chobo2;

import java.util.Scanner;

public class Baekjoon_16483 {
    /*
        접시 안의 원

        접시 - 중심이 같은 두 원이 겹쳐져 있는 형태

        작은 원의 접선이 큰 원과 만나는 두 점 사이의 거리를 T
        작은 원의 반지름 b
        큰 원의 반지름 a
        T의 값이 주어지면 a^2 - b^2 구하기



        T (10,000 이하)
        a^2 - b^2 소수점 아래 첫째 자리에서 반올림하여 정수 출력
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        System.out.println((int)(t / 2.0 * t / 2.0));
    }
}
