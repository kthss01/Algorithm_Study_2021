package baekjoon.chobo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Bakejoon_14732 {
    /*
        행사장 대여 (Small)

        장소를 완전히 포갤 수 있는 N개의 직사각형
        직사각형의 개수 N과 직사각형들의 좌측 하단과 우측 상단의 좌표 알려줌
        N개의 직사각형들은 일부분 혹은 전체가 겹칠 수도 있음

        장소의 넓이 구하기

        입력
        직사각형의 개수 N (2 <= N <= 100)
        N개의 줄에 x1,y1,x2,y2 (0 <= x1 < x2 <= 500, 0 <= y1 < y2 <= 500)
        좌측 하단 (x1, y1) 우측 상단 (x2, y2)

        출력
        행사장의 넓이 출력
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int area = 0;

        int[][] graph = new int[501][501];

        for (int i = 0; i < n; i++) {
            StringTokenizer token = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(token.nextToken());
            int y1 = Integer.parseInt(token.nextToken());
            int x2 = Integer.parseInt(token.nextToken());
            int y2 = Integer.parseInt(token.nextToken());

            for (int j = x1; j < x2; j++) {
                for (int k = y1; k < y2; k++) {
                    if (graph[j][k] == 1) continue;
                    graph[j][k] = 1;
                }
            }
        }

        for (int i = 0; i < 501; i++) {
            for (int j = 0; j < 501; j++) {
                if (graph[i][j] == 1)
                    area++;
            }
        }

        System.out.println(area);
    }
}
