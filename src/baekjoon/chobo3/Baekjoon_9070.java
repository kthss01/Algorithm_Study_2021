package baekjoon.chobo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_9070 {
    /*
        장보기

        맛살에 써진 중량(g)와 가격(원)을 다 조사해서
        같은 가격으로 최대한 많은 중량을 사고자 함

        입력
        테스트 케이스 T (1 <= T <= 20)
        맛살의 종류 N
        중량(g) W, 가격(원) C 공백을 두고 한 줄에 하나 씩
        (1 <= N <= 100, 1 <= W <= 5000, 1 <= C <= 100000, W, C 정수)

        출력
        맛살의 가격 한 줄에 하나씩 출력
        같은 가격으로 살 수 있는 최대 중량이 같은 맛살이 두 개 이상인 경우는
        낮은 가격의 것을 사기로 함
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t > 0) {
            int n = Integer.parseInt(br.readLine());

            double min = Double.MAX_VALUE;
            int minPrice = 0;

            for (int i = 0; i < n; i++) {
                StringTokenizer token = new StringTokenizer(br.readLine());

                double w = Double.parseDouble(token.nextToken());
                double c = Double.parseDouble(token.nextToken());

                if (c / w < min) {
                    min = c / w;
                    minPrice = (int) c;
                } else if (c / w == min) {
                    minPrice = (int) Math.min(minPrice, c);
                }
            }

            System.out.println(minPrice);

            t--;
        }
    }
}
