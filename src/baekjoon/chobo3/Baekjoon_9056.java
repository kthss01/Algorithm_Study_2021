package baekjoon.chobo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_9056 {
    /*
        Letter Bank

        단어 은행에 들어간 단어로만 구성된 문자열인지 파악하기

        대문자로만 되어있음

        입력
        T (1 <= T <= 20) Test Cases
        공백으로 구분 각 문자 최대 80자

        맞으면 YES 아니면 NO
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t != 0) {

            StringTokenizer token = new StringTokenizer(br.readLine());
            String bank = token.nextToken();
            String str = token.nextToken();

            boolean[] alpha = new boolean[26];
            for (char ch : bank.toCharArray()) {
                alpha[ch - 'A'] = true;
            }

            boolean[] alpha2 = new boolean[26];
            for (char ch : str.toCharArray()) {
                alpha2[ch - 'A'] = true;
            }

            boolean isBank = true;
            for (int i = 0; i < 26; i++) {
                if (alpha[i] != alpha2[i]) {
                    isBank = false;
                    break;
                }
            }

            System.out.println(isBank ? "YES" : "NO");

            t--;
        }
    }
}
