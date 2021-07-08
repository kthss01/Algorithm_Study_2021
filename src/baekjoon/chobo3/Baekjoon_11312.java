package baekjoon.chobo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_11312 {
    /*
        삼각 무늬 - 2

        한변의 길이 A인 정삼각형
        B인 정삼각형으로 A를 완전히 덮어버리고자 함
        두 개의 정수 A, B가 주어지고, B <= A이고, A를 B로 나눌 수 있을 때,
        한 변의 길이가 A인 정삼각형을 완전하게 덮기 위한,
        한 변의 길이가 B인 정삼각형의 개수를 구하라.

        테스트 케이스 T (T <= 1000)
        A, B (1 <= B <= A <= 1,000,000 B | A)

        1 : 1 - 1
        2 : 1 - 11 1 1 - 4
        3 : 1 - 111 11 11 1 1 - 9
        4 : 1 - 1111 111 111 11 11 1 1 - 16
        5 : 1 -> 25 == 제곱
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (t != 0) {
            StringTokenizer token = new StringTokenizer(br.readLine());
            long a = Integer.parseInt(token.nextToken());
            long b = Integer.parseInt(token.nextToken());

            sb.append(a / b * a / b).append("\n");

            t--;
        }
        System.out.println(sb);
    }
}
