package baekjoon.chobo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_14173 {
    /*
        Square Pasture

        grazed - 풀을 먹인
        pastures - 목초지

        두 사각형이 있는데
        두 사각형을 덮을 수 있는 정사각형을 구하기
        두 사각형은 겹치지는 않음

        x1, y1, x2, y2 2줄로 입력 (left-bottom / right-top) 순

        최소 면적 출력
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer token = new StringTokenizer(br.readLine());

        int x1 = Integer.parseInt(token.nextToken());
        int y1 = Integer.parseInt(token.nextToken());
        int x2 = Integer.parseInt(token.nextToken());
        int y2 = Integer.parseInt(token.nextToken());

        token = new StringTokenizer(br.readLine());

        int x3 = Integer.parseInt(token.nextToken());
        int y3 = Integer.parseInt(token.nextToken());
        int x4 = Integer.parseInt(token.nextToken());
        int y4 = Integer.parseInt(token.nextToken());

        int minX = Math.min(x1, Math.min(x2, Math.min(x3, x4)));
        int maxX = Math.max(x1, Math.max(x2, Math.max(x3, x4)));

        int minY = Math.min(y1, Math.min(y2, Math.min(y3, y4)));
        int maxY = Math.max(y1, Math.max(y2, Math.max(y3, y4)));

        int x = maxX - minX;
        int y = maxY - minY;

        System.out.println(x < y ? y * y : x * x);

    }
}
