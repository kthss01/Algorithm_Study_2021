package baekjoon.chobo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon_9723 {
    /*
        Right Triangle

        세 변이 주어질 때 직각 삼각형인지 아닌지 판별하기

        T, T <= 100000, test cases

        a, b, c 1 ~ 100 순서는 any order

        출력
        Case #x: M (starting from 1)
            YES 직각삼각형 NO 아니면
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= t; i++) {
            boolean isRight = false;

            StringTokenizer token = new StringTokenizer(br.readLine());

            int[] arr = new int[3];
            arr[0] = Integer.parseInt(token.nextToken());
            arr[1] = Integer.parseInt(token.nextToken());
            arr[2] = Integer.parseInt(token.nextToken());

            Arrays.sort(arr);
            if (arr[2] * arr[2] == arr[1] * arr[1] + arr[0] * arr[0]) {
                isRight = true;
            }

            sb.append("Case #").append(i).append(": ");
            if(isRight)
                sb.append("YES");
            else
                sb.append("NO");
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
