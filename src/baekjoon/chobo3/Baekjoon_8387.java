package baekjoon.chobo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_8387 {
    /*
        Dyslexia

        두 문자열이 주어질 때
        맞게 쓴 글자 찾기

        입력
        n 문자열 길이
        두 문자열

        출력
        맞은 수 출력
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String origin = br.readLine();
        String rewrite = br.readLine();

        int cnt = 0;

        for (int i = 0; i < n; i++) {
            if (origin.charAt(i) == rewrite.charAt(i))
                cnt++;
        }

        System.out.println(cnt);
    }
}
