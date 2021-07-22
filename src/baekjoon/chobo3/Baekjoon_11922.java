package baekjoon.chobo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Baekjoon_11922 {
    /*
        BELA

        mischievous 짖궂은, 말썽꾸러기의

        카드 규칙에 의해서
        카드를 뽑을 때
        점수가 몇 점인지 구하기

        A	11	11
        K	4	4
        Q	3	3
        J	20	2
        T	10	10
        9	14	0
        8	0	0
        7	0	0

        S H D C 특정 값이 dominant suit가 됨

        입력
        N (1 <= N <= 100)
        B (S H D C)

       출력
       총 점수
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer token = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(token.nextToken());
        char ds = token.nextToken().charAt(0);

        Map<String, Integer> card = new HashMap<>();
        card.put("A", 11);
        card.put("K", 4);
        card.put("Q", 3);
        card.put("J", 2);
        card.put("T", 10);
        card.put("9", 0);
        card.put("8", 0);
        card.put("7", 0);

        int point = 0;

        for (int i = 0; i < n * 4; i++) {
            String temp = br.readLine();
            String c = temp.substring(0,1);

            point += card.get(c);

            if (temp.charAt(1) == ds) {
                switch (c) {
                    case "J":
                        point += 18;
                        break;
                    case "9":
                        point += 14;
                        break;
                }
            }
        }

        System.out.println(point);
    }
}
