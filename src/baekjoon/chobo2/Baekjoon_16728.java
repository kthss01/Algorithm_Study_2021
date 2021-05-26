package baekjoon.chobo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_16728 {
    /*
        Chaarshanbegaan at Cafebazaar

        Chaarshanbegaan 차르산베가안안 - 사람이름 추정
        bazaar 상점가 (바자르)

        좌표가 주어지는에
        0,0 (가운데)로 부터 거리를 구해서
        표에 맞게 점수 계산하기

        표       d
        10      <= 10
        9       <= 30
        8       <= 50
        7       <= 70
        6       <= 90
        5       <= 110
        4       <= 130
        3       <= 150
        2       <= 170
        1       <= 190
        0       else

        두 점간의 거리
        루트( (x1-x2)^2 + (y1-y2)^2) )

        입력
        n (1 <= n <= 100)
        공백 구분 x, y
        절대값 (300 넘지 않음)
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer token = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(token.nextToken());

        int score = 0;

        for (int i = 0; i < n; i++) {
            token = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(token.nextToken());
            int y = Integer.parseInt(token.nextToken());

            double dist = Math.sqrt(x * x + y * y);
//            System.out.println(dist);

//            System.out.println(10 - (int)(dist - 10) / 20);

            score += Math.max(0, 10 - (int) Math.ceil((dist - 10) / 20));
        }
        System.out.println(score);
    }
}
