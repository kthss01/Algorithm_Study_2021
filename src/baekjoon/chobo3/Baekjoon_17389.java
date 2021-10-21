package baekjoon.chobo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_17389 {
    /*
        보너스 점수

        OX표 점수 계산
        N개 문제 1 ~ N번 문제순 채점
        문제 뒤로 갈수록 어려워지기 때문 i번 문제 i점
            맞히면 획득 틀리면 못얻음
        보너스 점수 존재
            처음 0점
            맞히면 보너스점수 획득 점수 1점 증가
            틀리면 얻지 못함 0점으로 초기화

        점수 계산하기
        OX표 길이 자연수 N 1 ~ 10,000
        문자열 S O X로만 구성

        점수 출력
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String prob = br.readLine();
        int score = 0;
        int bonus = 0;

        for (int i = 0; i < prob.length(); i++) {
            char p = prob.charAt(i);
            if (p == 'O') {
                score += i + 1;
                score += bonus;
                bonus++;
            } else {
                bonus = 0;
            }
        }

        System.out.println(score);
    }
}
