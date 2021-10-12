package baekjoon.chobo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Baekjoon_17011 {
    /*
        Cold Compress

        문자열 압축하기
        +++===!!!!
        있으면
        3 + 3 = 4 ! 이런식으로 하기

        입력
        첫 줄 4 테스트 케이스
        문자열 최대 80자 공백 없음

        출력
        공백 구분 압축해서 출력력
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String str = br.readLine();

//            for (int j = 0; j < str.length();) {
//                char ch = str.charAt(j);
//                int cnt = 1;
//                j++;
//
//                while (j < str.length()) {
//                    char ch2 = str.charAt(j);
//                    if (ch != ch2) {
//                        break;
//                    }
//                    cnt++;
//                    j++;
//                }
//
//                sb.append(cnt).append(" ");
//                sb.append(ch).append(" ");
//            }

            char[] chars = str.toCharArray();

            char ch = chars[0];
            int cnt = 0;

            for (int j = 0; j < chars.length; j++) {
                if (ch == chars[j]) {
                    cnt++;
                } else {
                    sb.append(cnt).append(" ").append(ch).append(" ");
                    cnt = 1;
                    ch = chars[j];
                }
            }

            sb.append(cnt).append(" ").append(ch).append(" ").append("\n");
        }

        System.out.println(sb);
    }
}
