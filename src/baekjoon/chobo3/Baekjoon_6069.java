package baekjoon.chobo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon_6069 {
    /*
        Switching Lights

        intellectual - 지적인
        barn - 헛간
        stalls - 외양간

        두 가지 명령이 있음
        0 일 때 범위가 주어지면 범위에 라이트를 키거나 끔
        1 일 때 범위가 주어지면 켜져있는 라이트 확인 (시작 끝 포함)

        N, M
        N 길이
        M 명령 갯수
        1 <= S_i ~ E_i <= N
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer token = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(token.nextToken());
        int m = Integer.parseInt(token.nextToken());

        boolean[] lightsOn = new boolean[n + 1];

        for (int i = 0; i < m; i++) {
            token = new StringTokenizer(br.readLine());
            String command = token.nextToken();
            int s = Integer.parseInt(token.nextToken());
            int e = Integer.parseInt(token.nextToken());
            if (command.equals("0")) {
                for (int j = s; j <= e; j++) {
                    lightsOn[j] = !lightsOn[j];
                }
            } else if (command.equals("1")) {
                int cnt = 0;
                for (int j = s; j <= e; j++) {
                    if (lightsOn[j])
                        cnt++;
                }
                System.out.println(cnt);
            }
        }
    }
}
