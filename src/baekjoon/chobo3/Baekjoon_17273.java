package baekjoon.chobo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_17273 {
    /*
        카드 공장 (Small)

        K 수 말하면 N개의 카드 중 보이고 있는 면이 K 이하인 카드 모두 뒤집기

        처음 앞면 시작

        N M N = 1, M 100 이하 자연수
        Ai BI 10,000 이하 자연수
        K 10,000 이하 자연수

        명령이 끝났을 때 보이고 있는 카드들의 합 구하기
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(token.nextToken());
        int m = Integer.parseInt(token.nextToken());

        token = new StringTokenizer(br.readLine());
        int front = Integer.parseInt(token.nextToken());
        int back = Integer.parseInt(token.nextToken());

        int cur = front;

        for (int i = 0; i < m; i++) {
            int k = Integer.parseInt(br.readLine());

            if (k >= cur) {
                if (cur == front) {
                    cur = back;
                } else {
                    cur = front;
                }
            }
        }

        System.out.println(cur);
    }
}
