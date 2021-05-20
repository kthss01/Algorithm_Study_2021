package baekjoon.chobo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon_16408 {
    /*
        Poker Hand

        5개의 카드를 뽑아서 랭크가 몇인지 확인하기
        랭크는 같은 값이 몇개인지로 판별

        첫문자 A23456789TJQK
        두번째문자   CDHS
        첫문자 기준으로 판별

        5개 카드 공백으로 구분하여 입력
        랭크 숫자로 출력
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer token = new StringTokenizer(br.readLine());

        int[] values = new int[14];

        while (token.hasMoreTokens()) {
            String card = token.nextToken();

            char value = card.charAt(0);

            switch (value) {
                case 'A':
                    values[value - 'A']++;
                    break;
                case 'T':
                    values[10]++;
                    break;
                case 'J':
                    values[11]++;
                    break;
                case 'Q':
                    values[12]++;
                    break;
                case 'K':
                    values[13]++;
                    break;
                default:
                    values[value - '0']++;
                    break;
            }
        }

        Arrays.sort(values);
        System.out.println(values[13]);

    }
}
