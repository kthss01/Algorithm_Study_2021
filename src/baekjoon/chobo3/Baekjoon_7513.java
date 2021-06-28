package baekjoon.chobo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Baekjoon_7513 {
    /*
        준살 프로그래밍 대회

        사전에 N개의 단어를 넣어두고
        입력해야 하는 단어 순서를 알려주어 비밀번호 만들려고함

        단어의 목록과 각 참가자의 순서가 주어졌을 때
        모든 사람의 비밀번호 구하기

        입력
        여러 개의 테스트 케이스
        첫 줄 단어의 개수 1 <= m <= 50
        다음 m개 줄 단어가 하나 씩
            각 단어의 길이는 최대 5글자 공백 포함 x
        다음 줄 참가자의 수 1 <= n <= 200
        다음 n개 줄에 각 참가자의 비밀번호
            비밀번호 정보 정수 1 <= k <= 10 k 비밀번호를 이루고 있는 단어의 개수
                다음 k개 숫자는 단어의 인덱스
                순서대로 해당하는 언어를 연결한 문자열이 비밀번호
        출력
        각 테스트 케이스마다 첫째 줄에 "Scenario #i:" 출력
        다음 줄부터 순서대로 각 참가자의 비밀번호 출력
        테스트 케이스 사이에 빈 줄 출력
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        for (int i = 1; i <= t; i++) {
            sb.append("Scenario #").append(i).append(":\n");

            ArrayList<String> list = new ArrayList<>();
            int cnt = Integer.parseInt(br.readLine());
            for (int j = 0; j < cnt; j++) {
                list.add(br.readLine());
            }

            int num = Integer.parseInt(br.readLine());
            for (int j = 0; j < num; j++) {
                StringTokenizer token = new StringTokenizer(br.readLine());
                token.nextToken(); // 첫 token 버림
                while (token.hasMoreTokens()) {
                    sb.append(list.get(Integer.parseInt(token.nextToken())));
                }
                sb.append("\n");
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }
}
