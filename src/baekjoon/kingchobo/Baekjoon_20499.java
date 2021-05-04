package baekjoon.kingchobo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_20499 {
    /*
        Darius님 한타 안 함?

        K/D/A 보고 판별하기
        K + A < D || D == 0 gosu 아니면 hasu 출력
        0 <= K,D,A <= 20

        한줄 입력 /로 구분
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer token = new StringTokenizer(br.readLine(), "/");

        int k = Integer.parseInt(token.nextToken());
        int d = Integer.parseInt(token.nextToken());
        int a = Integer.parseInt(token.nextToken());

        if (k + a < d || d == 0)
            System.out.println("hasu");
        else
            System.out.println("gosu");
    }
}
