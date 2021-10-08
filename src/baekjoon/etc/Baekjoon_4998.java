package baekjoon.etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_4998 {
    /*
        저금

        N원 저금
        1년 지난때마다 B%만큼 이자 적립
        몇 년이 지나면 M원을 넘을지 궁금

        N, M, B 주어질 때 몇 년이 지나야 하는지 구하기

        입력
        N, B, M 한 줄
        M 은 항상 N보다 큼
        N과 M은 백만보다 작거나 같은 수 음수 또는 0 아님
        B는 50보다 작거나 같으며 양수
        모든 수는 소수점 둘째자리까지 주어짐

        출력
        각 테스트 케이스에 대해서 M원을 넘게 만들려면 몇 년이 걸리는지 출력
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str;
        while ((str = br.readLine()) != null) {
            StringTokenizer token = new StringTokenizer(str);
            double n = Double.parseDouble(token.nextToken());
            double b = Double.parseDouble(token.nextToken());
            double m = Double.parseDouble(token.nextToken());

            double c = n * (1 + b / 100);
            int cnt = 1;

            while (c < m) {
                c = c * (1 + b / 100);
                cnt++;
            }

//            System.out.println(cnt);
            sb.append(cnt).append("\n");
        }

        System.out.println(sb);
    }
}
