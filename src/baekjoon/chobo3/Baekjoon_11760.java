package baekjoon.chobo3;

import java.util.Scanner;

public class Baekjoon_11760 {
    /*
        Mastering Mastermind

        mastermind
        (뛰어난 두뇌로 흔히 범죄와 관련된 복잡한 일을 계획하) 지휘[조종]하는 사람
        peg 못
        code 암호, 부호

        야구 게임이라 생각
        하나 입력 받고 다음 하나 입력 받앗을 때
        위치랑 값 맞으면 스트라이크 값은 맞는데 위치 틀리면 볼 이런 식의 문제

        입력
        n (n <= 5) code 길이 두 문자열 모두 대문자 알파벳
        출력
        r s r은 위치랑 문자 맞음 s 문자만 맞음
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s1 = sc.next();
        String s2 = sc.next();

        int r = 0;
        int s = 0;

        int[] a1 = new int[26];
        int[] a2 = new int[26];

        for (int i = 0; i < n; i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            a1[c1 - 'A']++;
            a2[c2 - 'A']++;

            if (c1 == c2) {
                r++;
            }
        }

        int sameCnt = 0;
        for (int i = 0; i < 26; i++) {
            if (a1[i] == 0 && a2[i] == 0)
                continue;
            sameCnt += Math.min(a1[i], a2[i]);
        }

        s = sameCnt - r;

        System.out.println(r + " " + s);
    }
}
