package baekjoon.kingchobo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_21591 {
    /*
        Laptop Sticker

        랩탑에 스티커가 붙을 수 있는지 판별

        wc, hc, ws, hs (1 <= wc,hc,ws,hs <= 1000)

        모든 사이드로 1cm 이상 여유 필요

        붙일 수 있으면 1
        아니면 0
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer token = new StringTokenizer(br.readLine());

        int wc = Integer.parseInt(token.nextToken());
        int hc = Integer.parseInt(token.nextToken());
        int ws = Integer.parseInt(token.nextToken());
        int hs = Integer.parseInt(token.nextToken());

        System.out.println(ws + 2 <= wc && hs + 2 <= hc ? 1 : 0);
    }
}
