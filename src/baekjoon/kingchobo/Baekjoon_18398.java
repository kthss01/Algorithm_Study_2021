package baekjoon.kingchobo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_18398 {
    /*
        HOMWRK

        두 값을 입력 받았을 때
        합과 곱 출력

        1 줄 T (test cases 1 <= T <= 1000)
        2 줄 N (문제 수 1 <= N <= 50)
        3 줄 two number (0 <= number <= 20000)
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            for (int j = 0; j < n; j++) {
                StringTokenizer token = new StringTokenizer(br.readLine());
                int n1 = Integer.parseInt(token.nextToken());
                int n2 = Integer.parseInt(token.nextToken());

                System.out.printf("%d %d\n", (n1 + n2), (n1 * n2));
            }
        }
    }
}
