package baekjoon.chobo2;

import java.util.Scanner;

public class Baekjoon_16478 {
    /*
        원의 분할

        원을 분할 할 때
        a b c d 영역으로 나뉘고

        각 영역을 분할하는 선을 pab pbc pcd pda라 할 때
        pab pbc pcd 의 값이 주어질 때 pda값 구하기

        공백으로 구분하여 주어지고 10,000이하의 양의 정수

        pda 값 구하기 절대/상대 오차 10^-6까지 허용

        비율로 구하는 문제 같음
        pab : pcd = pbc : pda

        1 : 2 = 2 : x
        x = 2 * (2 / 1)
        pda = pbc * (pcd / pab)

        1 : 2 = x : 4
        x = 4 * (1 / 2)
        pda = pbc * (pab / pcd)

        이 둘다 아닌거 같음

        -> 해결 중3 수학 수준이라고 함
        방멱 정리
        두 현에 대한 방멱
        ->
        pa * pb = pc * pd 란 얘기 이것 때문에 헷갈림
        삼각형이 닮은꼴이기 때문에 비율이 같단 얘기였음
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double pab = sc.nextDouble();
        double pbc = sc.nextDouble();
        double pcd = sc.nextDouble();

//        double pda = pbc * ((double) pcd / (double) pab);
//        double pda = pbc * ((double) pab / (double) pcd);
        double pda = pab * pcd / pbc;

        System.out.printf("%.6f\n", pda);

    }
}
