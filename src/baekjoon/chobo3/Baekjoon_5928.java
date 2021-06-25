package baekjoon.chobo3;

import java.util.Scanner;

public class Baekjoon_5928 {
    /*
        Contest Timing

        날짜와 시간이 주어졌을 때
        11.11 11:11 부터 해서 얼마나 지난건지 계산하기

        D H M
        D 11 ~ 14
        H M hour minutes 24-hour (0 <= H <= 23, 0 <= M <= 59)

        남은 전체시간 분으로 출력
        시작 시간보다 앞이면 -1 출력
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();

        int result = 0;

        if (d < 11) {
            result = -1;
        } else if (d == 11 && h < 11) {
            result = -1;
        } else if (d == 11 && h == 11 && m < 11) {
            result = -1;
        } else {
            result = (d - 11) * 24 * 60 + (h - 11) * 60 + (m - 11);
        }

        System.out.println(result);
    }
}
