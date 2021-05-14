package baekjoon.chobo2;

import java.util.Scanner;

public class Baekjoon_15238 {
    /*
        Pirates

        word가 들어올 때
        가장 많이 반복되는 단어를 숫자와 함께 출력

        size (word 길이)
        워드 최대 1000자 소문자만 no space
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String word = sc.nextLine();

        // 알파벳 갯수 26 a:97, z:122
        int[] alphabet = new int['z' - 'a' + 1];

        for (int i = 0; i < n; i++) {
            alphabet[word.charAt(i) - 'a']++;
        }

        int max = 0;
        char c = 'a';
        for (int i = 0; i < alphabet.length; i++) {
            if (max < alphabet[i]) {
                max = alphabet[i];
                c = (char) ('a' + i);
            }
        }

        System.out.println(c + " " + max);
    }
}
