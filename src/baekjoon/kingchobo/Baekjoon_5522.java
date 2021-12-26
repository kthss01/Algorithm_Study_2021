package baekjoon.kingchobo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 카드 게임 - 브론즈 5
 * 
 * 카드 게임 5회 게임 진행
 * 총점으로 승부
 * 각 게임의 득점을 나타내는 정수가 주어졌을 때,
 * 총점 구하기
 * 
 * 입력
 *  i번째 줄 1 ~ i ~ 5 Ai - 점수
 * 출력
 *  총점 출력
 */
public class Baekjoon_5522 {
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int score = 0;
        for (int i = 0; i < 5; i++) {
            score += Integer.parseInt(br.readLine());
        }
        System.out.println(score);
    }
}
