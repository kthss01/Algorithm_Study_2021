package baekjoon.chobo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_17284 {
    /*
        Vending Machine

        5000원

        1 500원
        2 800원
        3 1000원

        누른 버튼 값이 순서대로 주어질 때
        거스름돈 구하기
        주어진 돈 초과하도록 버튼 누르는 일 없음

        번호 공백 구분 버튼 한 번 이상
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        int money = 5000;

        int[] cost = {500, 800, 1000};

        while (token.hasMoreTokens()) {
            int select = Integer.parseInt(token.nextToken());
            money -= cost[select-1];
        }

        System.out.println(money);
    }
}
