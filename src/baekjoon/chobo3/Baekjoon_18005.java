package baekjoon.chobo3;

import java.util.Scanner;

/**
 * Even or Odd? - 브론즈 4
 * 
 * 연속된 숫자의 합이 홀수인지 짝수인지 확인해서
 * 짝수면 2 홀수면 1 둘 중 하나면 0
 * 
 * ex)
 *  3
 *  홀짝홀 or 짝홀짝
 *  -> even or odd
 * 
 * => 입력이 홀수면 0
 * 입력이 짝수면
 *  입력 / 2 = 홀수의 개수
 *  홀수의 개수가 짝수면 => 짝수
 *  홀수의 개수가 홀수면 => 홀수 
 */
public class Baekjoon_18005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans = 0;
        if (n % 2 == 0) {
            if ((n / 2) % 2 == 0) {
                ans = 2;
            } else {
                ans = 1;
            }
        }
        System.out.println(ans);

        sc.close();
    }
}
