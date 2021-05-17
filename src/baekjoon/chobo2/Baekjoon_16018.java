package baekjoon.chobo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_16018 {
    /*
        Occupy parking

        주차 정보를 어제와 오늘을 입력받았을 때
        어제 오늘 둘다 주차 된 자리수 출력하기

        N (1 <= N <= 100) 주차 공간
        C 주차 . 빈곳

        어제 한줄
        오늘 한줄

        둘다 주차된 곳 갯수 출력
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String yesterday = br.readLine();
        String today = br.readLine();

        int count = 0;

        for (int i = 0; i < yesterday.length(); i++) {
            if (yesterday.charAt(i) == 'C' && yesterday.charAt(i) == today.charAt(i)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
