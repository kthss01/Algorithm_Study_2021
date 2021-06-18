package baekjoon.chobo3;

import java.util.Scanner;

public class Baekjoon_2875 {
    /*
        대회 or 인턴

        대회 나갈 때 2명 여학생, 1명 남학생 팀 결성나가는게 원칙
        N명 여학생, M명 남학생
        대회에 참여하려는 학생들 중 K명은 반드시 인턴쉽 프로그램에 참여해야함
        인턴쉽에 참여하는 학생은 대회에 참여하지 못함
        최대한 많은 팀을 만드는 것이 최선
        N, M, K가 주어질 때 최대 팀 구하기

        입력
        N, M, K (0 <= M <= 100, 0 <= N <= 100, 0 <= K <= M+N)
        출력
        만들 수 있는 팀의 최대 개수 출력력
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int team = 0;

        while (n - 2 >= 0 && m - 1 >= 0 && n - 2 + m - 1 - k >= 0) {
            n -= 2;
            m -= 1;
            team++;
        }

        System.out.println(team);
    }
}
