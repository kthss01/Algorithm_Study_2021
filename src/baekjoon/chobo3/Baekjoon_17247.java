package baekjoon.chobo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class Baekjoon_17247 {
    /*
        택시 거리

        택시 거리는 바둑판 모양의 도로망을 가진 도시에서
        점 A에서 점 B까지의 최단 거리르 구할 경우
        도로를 따라서만 가는 가장 짧은 거리를 뜻함

        x1,y1 x2,y2 거리
        D = |x2-x1| + |y2-y1|

        0, 1 로 구분된 보드에서 두 1 사이의 거리 구하기

        N M 2 ~ 1000
        0 or 1 입력
        1 항상 두 개만 입력
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(token.nextToken());
        int m = Integer.parseInt(token.nextToken());

        int x1, y1, x2, y2;
        x1 = y1 = x2 = y2 = -1;

        for (int i = 0; i < n; i++) {
            token = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                int p = Integer.parseInt(token.nextToken());
                if (p == 1) {
                    if (x1 == -1) {
                        x1 = i;
                        y1 = j;
                    } else {
                        x2 = i;
                        y2 = j;
                    }
                }
            }
        }

        int d = Math.abs(x1 - x2) + Math.abs(y1 - y2);

        System.out.println(d);
    }
}
