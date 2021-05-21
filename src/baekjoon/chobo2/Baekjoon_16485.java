package baekjoon.chobo2;

import java.util.Scanner;

public class Baekjoon_16485 {
    /*
        작도하자! - 2

        삼각형 ABC
        각 BAC의 이등분선과 변 BC의 교점을 M

        변 AB의 길이 c 와 AC의 길이 b가 주어질 때
        (선분 BM의 길이) / (선분 CM의 길이)의 값 구하기

        c b 공백 두고 입력 (c, b 1,000,000,000 이하의 양수)

        절대/상대 오차 10^-6까지 허용

        c : b = bm : cm
        b * bm = c * cm
        bm / cm = c / b
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double c = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.printf("%.6f\n", c / b);
    }
}
