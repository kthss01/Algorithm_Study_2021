package baekjoon.kingchobo;

import java.util.Scanner;

public class Baekjoon_20492 {
    /*
        세금

        대회 상금의 금액이 주어질 때,
        실제 수령 금액 확인
        1. 전체 상금의 22%를 제세공과금으로 납부하는 경우
        2. 상금의 80%를 필요 경비로 인정받고, 나머지 금액 중 22%만을 제세공과금을 납부하는 경우

        N (1000 <= N <= 10000000, N은 1000의 배수)
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print(n - (int)(n * 0.22) + " ");
        System.out.print(n - (int)(n * 0.2 * 0.22) + "\n");
    }
}
