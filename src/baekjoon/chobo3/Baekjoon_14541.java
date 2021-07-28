package baekjoon.chobo3;

import java.util.Scanner;

public class Baekjoon_14541 {
    /*
        Speed Limit

        속도와 각 속도마다 누적 이동시간이 주어질 때
        총 이동거리 구하기
        ex
        20  2 - 20 * 2 = 40
        30  6 - 30 * 4 = 120
        10  7 - 10 * 1 = 10
        -> 170

        입력
        n (1 <= n <= 10) data sets 갯수
        s t (1 <= s <= 90, 1 <= t <= 12)
        n == -1 종료

        출력
        170 miles 형태로 출력
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();

        while (true) {
            int n = sc.nextInt();

            if (n == -1)
                break;

            int speed, time;
            int prevTime = 0;
            int curTime;
            int distance = 0;
            for (int i = 0; i < n; i++) {
                speed = sc.nextInt();
                time = sc.nextInt();

                curTime = time - prevTime;
                distance += curTime * speed;
                prevTime = time;
            }

            sb.append(distance).append(" miles").append("\n");
        }

        System.out.println(sb);
    }
}
