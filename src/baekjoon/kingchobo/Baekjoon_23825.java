package baekjoon.kingchobo;

import java.util.Scanner;

/**
 * SASA 모형을 만들어보자 - 브론즈 4
 * 
 * S 모양 블록 A 모양 블록이 주어질 때
 * SASA 모형을 만들 수 있는 개수 최대값 구하기
 * 
 * 입력
 *  S 모양의 블록 개수 N, A 모양의 블록 개수 M 공백 구분
 * 
 * 출력
 *  최대값 출력
 */
public class Baekjoon_23825 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int ans = Math.min(n / 2, m / 2);
        
        System.out.println(ans);

        sc.close();
    }
}
