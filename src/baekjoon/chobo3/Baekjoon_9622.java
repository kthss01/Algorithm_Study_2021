package baekjoon.chobo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_9622 {
    /*
        Cabin Baggage

        규격이 제한되어 있을 때
        그 규격에 맞는지 확인하기

        56, 45, 25 (총합 125 초과 x) 무게 7kg 초과 x

        입력
        t (1 <= t <= 300)
        각 줄 length, width, depth, weight 4 values
            positive number 2 decimal points

        출력
        1 allowed 0 otherwise
        마지막 줄에 총 allowed 갯수 출력
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        int totalAllowed = 0;

        double[] standards = new double[]{56, 45, 25, 7};

        while (t > 0) {
            StringTokenizer token = new StringTokenizer(br.readLine());

            double length = Double.parseDouble(token.nextToken());
            double width = Double.parseDouble(token.nextToken());
            double depth = Double.parseDouble(token.nextToken());
            double weight = Double.parseDouble(token.nextToken());

            if (((standards[0] >= length && standards[1] >= width
                && standards[2] >= depth) || (length + width + depth <= 125))
                    && standards[3] >= weight) {
                sb.append(1).append("\n");
                totalAllowed++;
            } else {
                sb.append(0).append("\n");
            }

            t--;
        }

        sb.append(totalAllowed).append("\n");

        System.out.println(sb);
    }
}
