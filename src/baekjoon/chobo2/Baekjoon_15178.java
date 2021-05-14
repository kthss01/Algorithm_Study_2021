package baekjoon.chobo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_15178 {
    /*
        Angles

        pupil - (특히 어린) 학생
        protractor - 각도기
        add up - 말이 되다, 앞뒤가 맞다

        3 각이 주어질 때 180도가 되면
        3각과 함께 빈칸으로 구분하여 Seems OK 아니면 Check 출력

        N (0 <= N <= 30) 갯수
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer token;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            token = new StringTokenizer(br.readLine());

            int sum = 0;
            while (token.hasMoreTokens()) {
                int angle = Integer.parseInt(token.nextToken());
                sb.append(angle).append(" ");
                sum += angle;
            }

            if (sum == 180) {
                sb.append("Seems OK\n");
            } else {
                sb.append("Check\n");
            }
        }

        System.out.println(sb);
    }
}
