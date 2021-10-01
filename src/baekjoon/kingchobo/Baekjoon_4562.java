package baekjoon.kingchobo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_4562 {
    /*
        No Brainer
        두 수 입력받아서
        x >= y 인 경우 MMM BRAINS
        아닌 경우 NO BRAINS 출력
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer token = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(token.nextToken());
            int y = Integer.parseInt(token.nextToken());

            sb.append(x < y ? "NO BRAINS" : "MMM BRAINS").append("\n");
        }

        System.out.println(sb);
    }
}
