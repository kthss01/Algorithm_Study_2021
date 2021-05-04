package baekjoon.kingchobo;

import java.util.Scanner;

public class Baekjoon_20673 {
    /*
        Covid-19

        신규 환자수 최대 50명
        신규 입원건수 최대 10명 white

        신규입원 건수 30건이상 red

        나머지 yellow

        두 줄 입력
        p (0 <= p <= 1000) 신규 환자 수
        q (0 <= q <= 500) 신규 입원 수
        q <= p

        color 출력
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p = sc.nextInt();
        int q = sc.nextInt();

        if (p <= 50 && q <= 10)
            System.out.println("White");
        else if (q >= 30)
            System.out.println("Red");
        else
            System.out.println("Yellow");
    }
}
