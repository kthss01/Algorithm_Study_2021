package baekjoon.chobo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_14182 {
    /*
        Tax

        1,000,000 Oshloobs 이하는 세금 x
        1,000,000 < x <= 5,000,000 10%
        5,000,000 < x 20%

        세금 계산해주기

        입력 줄마다 소득 입력
        소득은 1000 배수, 양의 정수, 10,000,000 넘지 많음
        0이면 종료

        imposed 겹쳐진
        deducted 공제하다
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int income = Integer.parseInt(br.readLine());

            if (income == 0) {
                break;
            }

            if (income > 5000000) {
                System.out.println((int) (income * 0.8));
            } else if (income > 1000000) {
                System.out.println((int) (income * 0.9));
            } else {
                System.out.println((int) (income * 1.0));
            }
        }
    }
}
