package baekjoon.chobo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_17203 {
    /*
        ∑|ΔEasyMAX|

        자기가 쓴 곡의 초당 박자 변화량의 합이 얼마나 되는지 알고 싶어짐
        이 곡의 특정 부분들의 구간별 초당 박자 변화량의 합을 구해야함

        단, i초와 j초 구간 사이의 초당 박자 변화량의 합은
        k=i ~ j-1 ak+1 - ak의 절대값의 합이라 정의
        j - 1 < i 인 경우는 0으로 함

        입력
        1줄
            노래의 길이 N 1 ~ 1000
            초당 박자 변화량의 합을 구해야하는 구간의 수 Q 1 ~ 1000
        2줄
            노래의 박자 빠르기를 나타내는 수열 a...
            ai -10^4 ~ 10^4 i초일 때 박자의 빠르기
        3줄
            변화량의 합을 구해야하는 구간의 시작점과 끝점 Q 1 ~ N

        출력
            초당 박자 변화량의 합을 입력 순서대로 Q줄에 걸쳐 출력
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(token.nextToken());
        int q = Integer.parseInt(token.nextToken());

        int[] arr = new int[n];
        int[] change = new int[n];

        token = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(token.nextToken());
        }

        for (int i = 0; i < n - 1; i++) {
            change[i] = Math.abs(arr[i] - arr[i+1]);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < q; i++) {
            token = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(token.nextToken()) - 1;
            int end = Integer.parseInt(token.nextToken()) - 1;

            if (start == end) {
                sb.append(0);
            } else {
                int sum = 0;
                for (int j = start; j < end; j++) {
                    sum += change[j];
                }
                sb.append(sum);
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
