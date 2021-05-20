package baekjoon.chobo2;

import java.util.Scanner;

public class Baekjoon_16479 {
    /*
        컵라면 측정하기

        컵라면은 두 개의 밑면이 서로 평행하며, 원 모양인 원뿔대
        컵라면 옆모습은 등변사다리꼴

        컵라면
            윗면 지름 D1
            아랫면 지름 D2
            아직 측정하지 않은 변의 길이 K (빗변 의미)

        컵라면의 높이 제곱의 값 알아내기
        (단, 컵라면의 높이는 등변사다리꼴에서 평행한 두 변 사이의 거리로 정의)

        k, d1, d2 양의 정수
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int d1 = sc.nextInt();
        int d2 = sc.nextInt();

        double d = (d1 - d2) / 2.0;

        System.out.printf("%.6f\n", (double)k * k - d * d);
    }
}
