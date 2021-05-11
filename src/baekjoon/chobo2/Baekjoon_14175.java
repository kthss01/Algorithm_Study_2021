package baekjoon.chobo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_14175 {
    /*
        The Cow-Signal

        self-respecting 자존심이 있는
        amplify 증폭시키다

        보드 입력받아서 k배만큼 증폭시키기

        M, N, K
        KM line 보드 입력 (. X만 입력)
        K배 증폭시켜서 출력 (가로 세로 모두 증폭)
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer token = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(token.nextToken());
        int n = Integer.parseInt(token.nextToken());
        int k = Integer.parseInt(token.nextToken());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            String row = br.readLine();

            StringBuilder sb2 = new StringBuilder();

            for (int j = 0; j < n; j++) {
                for (int l = 0; l < k; l++) {
                    sb2.append(row.charAt(j));
                }
            }
            sb2.append("\n");

//            System.out.println(sb2);

            for (int j = 0; j < k; j++) {
                sb.append(sb2);
            }
        }

        System.out.println(sb);
    }
}
