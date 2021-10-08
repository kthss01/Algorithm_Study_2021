package baekjoon.intermediate;

import java.util.Scanner;

public class Baekjoon_2991 {
    /*
        사나운 개
        개 한 마리는 A분 동안 공격적이고 B분 동안 조용히 쉰다
        또 다른 개는 C분 동안 공격적이고 D분 동안 조용히 쉰다
        두 개는 이 행동을 계속해서 연속적으로 반복한다.

        우체부, 신문배달원, 우유배달원의 도착 시간이 주어졌을 때,
        개 몇 마리에게 공격을 받는지 알아내기

        입력
        첫 줄 A, B, C, D
        둘째 줄 P, M, N
        P 우체부, M 우유배달원 N 신문배달원 의 도착 시간
        매일 아침 시작 시간 0
        도착 시간은 아침이 시작한 후 지난 시간
        ex) P 3 우체부 아침 시작 하고 3분에 도착
        모든 수는 1보다 크거나 같고, 999보다 작거나 같은 정수

        출력
        우체부, 우유배달원, 신문배달원이 몇 마리에게 공격 받는지 출력


        0 2
            2 4
        4 6
            6 8
        8 10

        0 3
            3 6
        6 9
            9 12
        12 15
        (a + b)(x - 1) ax+b(x-1)

        0 2
            2 5
        5 7
            7 10
        10 12

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int p = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[] time = new int[1000];
        int index = 1;

        while (index < 1000 - a) {
            for (int i = 0; i < a; i++) {
                time[index++]++;
            }
            index += b;
        }

        index = 1;
        while (index < 1000 - c) {
            for (int i = 0; i < c; i++) {
                time[index++]++;
            }
            index += d;
        }

        System.out.println(time[p] + " " + time[m] + " " + time[n]);
    }
}
