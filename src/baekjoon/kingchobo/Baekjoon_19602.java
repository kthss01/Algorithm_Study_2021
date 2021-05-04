package baekjoon.kingchobo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_19602 {
    /*
        Dog Treats

        treat - 대접 dog treat : 사료

        small medium large treat이 있을 때
        계산 방법이
            1 x S + 2 x M + 3 x L
        일 때

        10보다 크거나 같으면 happy
        아니면 sad
        happy인지 sad인지 파악

        3 줄 입력
        각 줄의 값 10보다 작음
        s
        m
        l
        순
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int s = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int l = Integer.parseInt(br.readLine());

        int result = s + m * 2 + l * 3;

        if (result >= 10)
            System.out.println("happy");
        else
            System.out.println("sad");
    }
}
