package baekjoon.chobo3;

import java.util.Scanner;

public class Baekjoon_4299 {
    /*
        AFC 윔블던
        두 팀의 점수 합과 차가 주어졌을 때
        최종 점수 구하기

        공백 구분하여 합과 차 입력
        항상 음이 아닌 정수, 합과 차는 1000보다 작거나 같은 음이 아닌 정수

        두 팀의 경기 결과 출력
        득점을 많이 한 쪽을 먼저 출력
        만약, 그러한 합과 차를 갖는 경기 결과가 없다면 -1을 출력
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int add = sc.nextInt();
        int sub = sc.nextInt();

        int x = add + sub;
        int y = add - sub;
        if (x < 0 || y < 0 || x % 2 != 0 || y % 2 != 0) {
            System.out.println(-1);
        } else {
            System.out.println(x / 2 + " " + y / 2);
        }
    }
}
