package baekjoon.kingchobo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_7891 {
    /*
        Can you add this?

        두 개의 정수가 주어질 때 그 둘의 합 출력하기

        입력은 여러개의 테스트 케이스

        1 줄 t (t <= 100) number of test cases
        이후부터 t만큼 x y (스페이스로 구분) (-10^9 <= x, y <= 10^9)
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer token = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(token.nextToken());
            int y = Integer.parseInt(token.nextToken());

            System.out.println(x + y);
        }
    }
}
