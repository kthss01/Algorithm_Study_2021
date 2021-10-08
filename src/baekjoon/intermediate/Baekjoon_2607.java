package baekjoon.intermediate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2607 {
    /*
        비슷한 단어
        영문 알파벳 대문자로 이루어진 두 단어가
        다음의 두 가지 조건을 만족하면 같은 구성을 갖는다고 말함
            1. 두 개의 단어가 같은 종류의 문자로 이루어져 있다.
            2. 같은 문자는 같은 개수만큼 있다.

        ex)
            DOG GOD -> 같음
            GOD, GOOD
                다른 구성

        두 단어가 같은 구성을 갖는 경우, 또는 한 단어에서 한 문자를 더하거나,
        빼거나, 하나의 문자를 다른 문자로 바꾸어 나머지 한 단어와 같은 구성을 갖게 되는 경우를
        이들 두 단어를 서로 비슷한 단어라고 함

        GOD GOOD 비슷한 단어
        DOG DOLL 비슷하지 않은 단어

        입력으로 여러 개의 서로 다른 단어가 주어질 때, 첫 번째 단어와 비슷한 단어가
        모두 몇 개인지 찾아 출력하는 프로그램 작성

        입력
        첫째 줄에는 단어의 개수가 주어지고 둘째 줄부터는 한 줄에 하나씩 단어가 주어짐
        모든 단어는 영문 알파벳 대문자로 이루어짐
        단어의 개수 100개 이하이며, 각 단어의 길이는 10이하

        입력으로 주어진 첫 번째 단어와 비슷한 단어가 몇 개인지 첫째 줄에 출력
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String word = br.readLine();
        int[] wordArr = new int[26];

        for (char c : word.toCharArray()) {
            wordArr[c - 'A']++;
        }

        int answer = 0;

        for (int i = 1; i < n; i++) {
            int change = 0;
            String temp = br.readLine();

            int[] tempArr = new int[26];
            for (char c : temp.toCharArray()) {
                tempArr[c - 'A']++;
            }

            for (int j = 0; j < 26; j++) {
                if (wordArr[j] != tempArr[j]) {
                    change += Math.abs(wordArr[j] - tempArr[j]);
                }
            }

            if (change <= 2 && Math.abs(word.length() - temp.length()) <= 1) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}
