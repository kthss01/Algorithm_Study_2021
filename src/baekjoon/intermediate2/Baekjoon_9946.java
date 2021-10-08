package baekjoon.intermediate2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_9946 {
    /*
        단어 퍼즐

        주어진 알파벳들을 섞어서 단어를 만드는 게임

        처음에 완성한 단어와 나중에 회수한 알파벳들이 주어질 때
        알파벳을 제대로 회수했는지 안했는지 판단하기

        입력
        첫째 줄 완성한 단어 둘째 줄 떨어뜨린 다음 회수한 알파벳들
        각 줄 알파벳 소문자로 이루어져있고 길이 1000 넘지 않음
        마지막에 END 단어 두 줄 주어지며 끝

        출력
        케이스마다 번호를 붙여서 예제출력과 같은 형식으로 출력
        제대로 회수했다면 same 아니면 different 출력
        Case 1: same
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int cnt = 1;

        while (true) {
            String word1 = br.readLine();
            String word2 = br.readLine();

            if (word1.equals("END") && word2.equals("END")) {
                break;
            }

            int[] arr1 = new int[26];
            int[] arr2 = new int[26];

            for (char c : word1.toCharArray()) {
                arr1[c - 'a']++;
            }
            for (char c : word2.toCharArray()) {
                arr2[c - 'a']++;
            }

            boolean isSame = true;
            for (int i = 0; i < 26; i++) {
                if (arr1[i] != arr2[i]) {
                    isSame = false;
                    break;
                }
            }

//            sb.append(String.format("Case %d: %s",
//                    cnt++, isSame ? "same" : "different")).append("\n");
            sb.append("Case ").append(cnt++).append(": ");
            if (isSame)
                sb.append("same");
            else
                sb.append("different");
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
