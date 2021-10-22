package baekjoon.chobo3;

import java.util.Scanner;

public class Baekjoon_17536 {
    /*
        Hour for a Run

        트랙 바퀴 수와 간판이 있을 때 몇 퍼센트를 운동할지에 맞게
        사인 수를 셀지 구하기

        입력
            V N 1 ~ 10^4
        출력
            매 10%마다 출력하기 10 ~ 90까지

        ex) 3 17
        6   11  16  21  26  31  36  41  46
        10% 20% 30% 40% 50% 60% 70% 80% 90%
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int n = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < 10; i++) {
            sb.append((int) Math.ceil((v * n * i) / 10.0));
            if (i != 9)
                sb.append(" ");
        }
        sb.append("\n");
        System.out.println(sb);
    }
}
