package baekjoon.kingchobo;

import java.util.Scanner;

public class Baekjoon_6778 {
    /*
        Which Alien?

        come forward (도움 등을 주겠다고) 나서다

        외계인을 찾으려고 함
        아래 3개의 외모를 가진 외계인이 있음

        TroyMartian
            antenna 최소 3개
            eyes 최대 4개
        VladSaturnian
            antenna 최대 6개
            eyes 최소 2개
        GraemeMercurian
            antenna 최대 2개
            eyes 최대 3개

        목격자 증언을 보고 외계인 찾기

        첫 줄 antenna 갯수
        2 줄 eyes 갯수

        외계인 이름 출력
        조건이 맞는 외계인이 여러명이면 여러명 출력
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int antenna = sc.nextInt();
        int eyes = sc.nextInt();

        if (antenna >= 3 && eyes <= 4)
            System.out.println("TroyMartian");
        if (antenna <= 6 && eyes >= 2)
            System.out.println("VladSaturnian");
        if (antenna <= 2 && eyes <= 3)
            System.out.println("GraemeMercurian");

    }
}
