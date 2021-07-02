package baekjoon.chobo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_9492 {
    /*
        Perfect Shuffle

        카드를 중간으로 나눠서 사이사이로 섞는게 Perfect Shuffle
        카드가 주어질 때 Perfect Shuffle 하기
        홀수 개의 카드면
        처음이 다음보다 하나 더 많게 해서 섞기

        입력
        test case 여러개
        카드 수 n (1 <= n <= 1000) 0이면 종료
        각 카드 1 ~ 80 문자열 대문자 혹은 - 로 구성

        출력
        Perfect Shuffle 해서 출력하기
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        while (true) {
            int n = Integer.parseInt(br.readLine());

            if (n == 0)
                break;

            String[] cards = new String[n];
            for (int i = 0; i < n; i++) {
                cards[i] = br.readLine();
            }

            int offset = n % 2 == 0 ? n / 2 : n / 2 + 1;

            for (int i = 0; i < n / 2; i++) {
                sb.append(cards[i]).append("\n");
                sb.append(cards[i + offset]).append("\n");
            }

            // 홀수인 경우 하나 더 남아서
            if (n % 2 != 0) {
                sb.append(cards[n/2]).append("\n");
            }
        }

        System.out.println(sb);
    }
}
