package baekjoon.chobo2;

import java.util.Scanner;

public class Baekjoon_15272 {
    /*
        Hissing Microphone

        hissing - 쉿쉿 하기
        pronounced - 확연한, 단호한
        stand out - 튀어나오다, 눈에 띄다
        annoyance - 짜증, 약이 오름, 골칫거리

        s가 반복되면 hiss 출력
        아니면 no hiss 출력

        입력 문자열 1 ~ 30 문자
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();

        boolean isHiss = false;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 's') {
                if (i != word.length() - 1 && word.charAt(i + 1) == 's') {
                    isHiss = true;
                    break;
                }
            }
        }

        if (isHiss) {
            System.out.println("hiss");
        } else {
            System.out.println("no hiss");
        }
    }
}
