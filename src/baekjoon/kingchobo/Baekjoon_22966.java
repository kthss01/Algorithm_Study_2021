package baekjoon.kingchobo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_22966 {
    /*
        가장 쉬운 문제를 찾는 문제

        문제 제목과 문제의 난이도가 주어지면 가장 쉬운 문제의 제목 출력하기
        문제의 난이도 자연수로 표현되며, 수가 클수록 어려운 문제

        입력
        문제의 개수 N
        문제의 제목과 난이도 공백 구분

        출력
        가장 쉬운 문제의 제목 출력

        제한
        1 <= N <= 4
        문제 제목은 알파벳 대문자로만 구성
        문제 제목은 최대 10글자, 모든 문제의 제목은 서로 다름
        문제의 난이도 1 ~ 4 자연수로 표현 모든 문제의 난이도는 서로 다름
        문제는 문제 제목에 대해 사전순으로 주어짐
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String easyProb = "";
        int easyLevel = 5;

        for (int i = 0; i < n; i++) {
            StringTokenizer token = new StringTokenizer(br.readLine());
            String name = token.nextToken();
            int level = Integer.parseInt(token.nextToken());

            if (easyLevel > level) {
                easyLevel = level;
                easyProb = name;
            }
        }

        System.out.println(easyProb);
    }
}
