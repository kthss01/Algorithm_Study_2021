package baekjoon.chobo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 369 - 브론즈 3
 * 
 * 369게임 N까지 규칙 지키며 진행시 박수횟수 구하기
 * 
 * 3, 6, 9 수가 포함되어있으면 그 개수만큼 박수
 * 
 * 입력 
 *  1 ~ N ~ 10^6
 */
public class Baekjoon_17614 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());

        int ans = 0;
        for (int i = 1; i <=  n; i++) {
            int temp = i;
            while (temp != 0) {
                int d = temp % 10;
                temp /= 10;
                if (d == 3 || d == 6 || d == 9) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
