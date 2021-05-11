package baekjoon.chobo2;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon_14467 {
    /*
        소가 길을 건너간 이유 1

        소의 번호와 위치가 주어질 때
        길을 건넌 (위치가 변한) 횟수 출력

        N (100 이하의 양의 정수, 관찰 횟수)
        하나의 관찰 결과 소의 번호(1 이상 10 이하 정수), 위치 (0 또는 1)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] cows = new int[10];
        Arrays.fill(cows, -1);

        int count = 0;
        for (int i = 0; i < n; i++) {
            int c = sc.nextInt();
            int p = sc.nextInt();
            c -= 1; // index 0부터 시작

            if (cows[c] != -1 && cows[c] != p) {
                count++;
            }
            cows[c] = p;
        }
        System.out.println(count);
    }
}
