package baekjoon.kingchobo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_22938 {
    /*
        백발백준하는 명사수

        두 원이 겹치는지 확인하기

        입력
        중심 x1, y1, 반지름 r1
        중심 x2, y2, 반지름 r2

        출력
        겹치면 YES 아니면 NO
        두 과녁이 한 점에서 만나는 경우 겹치지 않는 것으로 생각
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer token = new StringTokenizer(br.readLine());
        int x1 = Integer.parseInt(token.nextToken());
        int y1 = Integer.parseInt(token.nextToken());
        int r1 = Integer.parseInt(token.nextToken());

        token = new StringTokenizer(br.readLine());
        int x2 = Integer.parseInt(token.nextToken());
        int y2 = Integer.parseInt(token.nextToken());
        int r2 = Integer.parseInt(token.nextToken());

        double dist = Math.sqrt(Math.pow(Math.abs(x1 - x2), 2) + Math.pow(Math.abs(y1 - y2), 2));
        System.out.println(dist < r1 + r2 ? "YES" : "NO");
    }
}
