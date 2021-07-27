package baekjoon.chobo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_14013 {
    /*
        Unit Conversion

        단위 변환 하기

        입력
        A B 이렇게 변환 값이 주어짐 (strictly positive numbers)
        N (1 <= N <= 100000) 갯수
        z q (non negative number) q는 A or B 이거에 맞게 값 출력
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer token = new StringTokenizer(br.readLine());

        float a = Float.parseFloat(token.nextToken());
        float b = Float.parseFloat(token.nextToken());
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            token = new StringTokenizer(br.readLine());
            float z = Float.parseFloat(token.nextToken());
            char q = token.nextToken().charAt(0);

            if (q == 'A') {
                sb.append(z * (b / a)).append("\n");
            } else {
                sb.append(z * (a / b)).append("\n");
            }
        }

        System.out.println(sb);
    }
}
