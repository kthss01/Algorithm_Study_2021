package baekjoon.chobo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_9046 {
    /*
        복호화

        암호문 알바펫의 빈도수 체크 후
        가장 빈번하게 나타나는 문자 출력
        빈번하게 나타나는 문자 여러개이면 ? 출력

        T (1 <= T <= 20) 테스트 케이스
        줄마다 소문자와 공백으로 이루어진 영어문장 길이 1 ~ 255

        가장 빈번하게 나타나는 문자 출력
        빈번하게 나타나는 문자 여러개이면 ? 출력
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String password = br.readLine();

            int[] arr = new int[26];

            for (char ch : password.toCharArray()) {
                if (ch == ' ')
                    continue;
                arr[ch - 'a']++;
            }

            int mean = 0;
            char ch = ' ';
            for (int j = 0; j < 26; j++) {
                if (arr[j] == 0)
                    continue;

                if (arr[j] > mean) {
                    mean = arr[j];
                    ch = (char)(j + 'a');
                } else if (arr[j] == mean) {
                    ch = '?';
                }
            }

            System.out.println(ch);
        }
    }
}
