package baekjoon.chobo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_15279 {
    /*
        Heart Rate

        b 와 p가 주어질 때 최소 ABPM BPM 최대 ABPM 구하기

        N (1 <= N <= 1000)
        b p (2 <= b <= 1000) (0 < p < 1000)

        출력은
        min ABPM BPM max ABPM
        소수점 4자리로 출력

        windpipe - (호흡) 기관
        beat - 리듬
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer token;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            token = new StringTokenizer(br.readLine());

            int b = Integer.parseInt(token.nextToken());
            double p = Double.parseDouble(token.nextToken());

            double bpm = b / p * 60;
            double minAbpm = (b - 1) / p * 60;
            double maxAbpm = (b + 1) / p * 60;

            sb.append(String.format("%.4f %.4f %.4f\n", minAbpm, bpm, maxAbpm));
        }

        System.out.println(sb);
    }
}
