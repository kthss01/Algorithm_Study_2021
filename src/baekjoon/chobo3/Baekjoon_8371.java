package baekjoon.chobo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_8371 {
    /*
        Dyslexia - 난독증

        orthography - 철자법, 맞춤법
        pupil - (특히 어린) 학생
        certificate - 증서, 증명서
        ministry - 부처
        counteract - 대응하다

        두 문자열이 주어질 때
        잘못 작성된 문자 갯수 출력하기기

        입력
        n (1 <= n <= 100000) 문자열 길이
        기본 문자열
        비교 문자열

        출력
        다른 문자 갯수 출력
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String origin = br.readLine();
        String rewrite = br.readLine();

        int cnt = 0;

        for (int i = 0; i < n; i++) {
            if (origin.charAt(i) != rewrite.charAt(i)) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
