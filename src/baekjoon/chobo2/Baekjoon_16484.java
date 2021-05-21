package baekjoon.chobo2;

import java.util.Scanner;

public class Baekjoon_16484 {
    /*
        작도하자! - 1

        원의 임의의 현 XY를 그리고
        현 XY의 중점을 M이라고 한 뒤,
        M을 지나는 현 AB, CD를 그렷다.
        그리고 선분 AD와 현 XY가 만나는 점을 P,
        선분 CB와 현 XY가 만나는 점을 Q라고 한다.
        (단, 점 A와 D는 현 XY를 기준으로 서로 반대편의 위치에 있는 점이며,
        여섯 개의 점 X, Y, A, B, C, D는 모두 서로 다른 점이다)

        현 XY의 길이 n과 선분 PM의 길이 d가 주어지면
        선분 QY의 길이를 구하기

        자연수 n, d (n, d 1000이하의 양의 정수, dx2의 값은 n의 값보다 작다)
        QY의 길이를 소수점 아래의 둘째 자리에서 반올림하여 출력
        ex) 8 -> 8.0

        나비 정리
        PM = MQ
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int d = sc.nextInt();

        System.out.printf("%.1f\n", n / 2.0 - d);
    }
}
