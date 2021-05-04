package baekjoon.kingchobo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Baekjoon_20254 {
    /*
        Site Score

        preliminary 예비의

        site score를 구하는데
            Ur Tr Uo To 값을 받고 계산을함
            56Ur + 24Tr + 14Uo + 6To
            이 값 출력하기

        0 < Ur < Tr <= 120
        0 < Uo <= To <= 1000
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer token = new StringTokenizer(br.readLine());

        int ur = Integer.parseInt(token.nextToken());
        int tr = Integer.parseInt(token.nextToken());
        int uo = Integer.parseInt(token.nextToken());
        int to = Integer.parseInt(token.nextToken());

        int score = 56 * ur + 24 * tr  + 14 * uo + 6 * to;
        System.out.println(score);
    }
}
