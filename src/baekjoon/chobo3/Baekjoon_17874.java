package baekjoon.chobo3;

import java.util.Scanner;

/**
 * Piece of Cake! - 브론즈 4 (영어 문제)
 * 
 * 사각형을 가로 x, 세로 y를 기준으로 잘랐을 때
 * 가장 큰 조각의 부피 구하기
 * 
 * 입력
 *  n 사각형 길이 (2 ~ n ~ 10000)
 *  h 가로 (0 < h < n)
 *  v 세로 (0 < v < n)
 *  두께는 4
 * 
 * 출력
 *  가장 큰 조각의 부피 구하기
 */
public class Baekjoon_17874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int h = sc.nextInt();
        int v = sc.nextInt();

        int x = Math.max(h, n - h);
        int y = Math.max(v, n - v);

        int ans = x * y * 4;

        System.out.println(ans);

        sc.close();
    }
}
