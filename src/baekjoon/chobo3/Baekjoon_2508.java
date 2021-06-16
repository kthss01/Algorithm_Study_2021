package baekjoon.chobo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Baekjoon_2508 {
    /*
        사탕 박사 고창영

        r행 c열의 사탕 박스가 있는데

        "." 빈 곳
        "o" 사탕의 먹을 수 있는 부분
        "<>v^" 캔디 껍질

        사탕 종류
        >o<
        v
        o
        ^

        위와 같은 연속된 3개의 문자만 사탕
        사탕은 >o.와 같이 사탕의 일부만 존재할 수 있지만, 이 것은 사탕으로 세지 않음
        r행 c열이 주어졌을 때, 사탕의 개수를 출력하기

        테스트 케이스의 개수 t
        각 테스트 케이스는 빈 줄로 구분

        r, c (1 <= r, c <= 400)
        r개의 줄 행렬의 각 행 순서대로 주어짐
        (행렬의 각 행은 c개의 문자, ".o<>v^"만 포함하고 있다)
        각각의 아스키 값은 46, 111, 60, 62, 118, 94
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            // 빈 줄 처리
            br.readLine();

            StringTokenizer token = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(token.nextToken());
            int c = Integer.parseInt(token.nextToken());

            ArrayList<String> arr = new ArrayList<>();
            for (int j = 0; j < r; j++) {
                arr.add(br.readLine());
            }

            int ans = 0;

            // 가로 사탕 찾기
            for (int j = 0; j < r; j++) {
                for (int k = 0; k < c; k++) {
                    String str = arr.get(j);
                    if (str.charAt(k) == '>' && k + 2 < c) {
                        if (str.charAt(k + 1) == 'o' && str.charAt(k + 2) == '<')
                            ans++;
                    }
                }
            }

            // 세로 사탕 찾기
            for (int j = 0; j < c; j++) {
                for (int k = 0; k < r; k++) {
                    if (arr.get(k).charAt(j) == 'v' && k + 2 < r) {
                        if (arr.get(k + 1).charAt(j) == 'o' && arr.get(k + 2).charAt(j) == '^')
                            ans++;
                    }
                }
            }

            sb.append(ans).append("\n");
        }

        System.out.println(sb);
    }
}
