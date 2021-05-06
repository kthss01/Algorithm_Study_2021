package baekjoon.chobo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_20361 {
    /*
        일우는 야바위꾼

        Shell Game
            1. 진행자가 N개의 컵을 일렬로 놓고, 그 중 X번째 컵에 공을 숨겨둔다.
            2. 임의의 서로 다른 두 컵의 위치를 맞바꾼다. 이 항목을 K번 수행한다.
            만약, 공을 숨겨둔 컵을 움직인다면 공도 그 컵을 따라서 움직인다.
            3. 참가자는 몇 번째 컵에 공이 숨겨져 있는지 추측한다.
            4. 그 컵에 공이 숨겨져 있다면 참가자가, 그렇지 않다면 진행자가 이긴다.

           공이 몇 번째 컵에 있는지 알려주는 프로그램 작성하기

        N (3 <= N <= 200,000), X (1 <= X <= N), K (1 <= K <= 100,000)
        K개 줄에 순서대로 바꾼 두 컵의 위치 Ai Bi (1 <= Ai, Bi <= N, Ai != Bi)
        가 공백으로 주어짐
        주어진 모든 입력은 정수

        공이 몇 번째 위치의 커벵 있어야 하는지 정수로 출력
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer token = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(token.nextToken());
        int x = Integer.parseInt(token.nextToken());
        int k = Integer.parseInt(token.nextToken());

        for (int i = 0; i < k; i++) {
            token = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(token.nextToken());
            int b = Integer.parseInt(token.nextToken());

            if (a == x)
                x = b;
            else if (b == x)
                x = a;
        }

        System.out.println(x);
    }
}
