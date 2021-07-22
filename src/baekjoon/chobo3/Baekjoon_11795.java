package baekjoon.chobo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_11795 {
    /*
        Donation Packaging

        30개이상씩 모두 패키징하면 보낼 수 있음
        일짜별로 donation을 받았을 때 보낼 수 있는 양 출력하기

        입력
        T (1 <= T <= 365)
        setA, setB, setC

        출력
        각각이 30이 넘으면 그 값 출력 하나라도 안되면 NO 출력
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        int a = 0;
        int b = 0;
        int c = 0;

        while (t-- > 0) {
            StringTokenizer token = new StringTokenizer(br.readLine());
            a += Integer.parseInt(token.nextToken());
            b += Integer.parseInt(token.nextToken());
            c += Integer.parseInt(token.nextToken());

            int minD = Math.min(a, Math.min(b,c));

            if (minD >= 30) {
                a -= minD;
                b -= minD;
                c -= minD;
                System.out.println(minD);
            } else {
                System.out.println("NO");
            }
        }
    }

}
