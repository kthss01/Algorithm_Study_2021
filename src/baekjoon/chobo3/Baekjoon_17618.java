package baekjoon.chobo3;

import java.util.Scanner;

/**
 * 신기한 수 - 브론즈 3
 * 
 * 18을 이루는 각 자릿수인 1과 8을 합한 9는 18의 약수
 * -> 신기한 수
 * 
 * 주어진 자연수 N에 대해 N이하인 신기한 수는 총 몇개인지 
 * 구하기
 * 
 * 입력으로 1 이상인 자연수 N이 주어짐
 * N 이하인 신기한 수의 개수 출력
 * 
 * N 1 ~ N ~ 10,,000,000
 */

public class Baekjoon_17618 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int ans = 0;
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            int temp = i;
            while (temp != 0) {
                sum += temp % 10;
                temp /= 10;
            }
            if (i % sum == 0) {
                ans++;
            }
        }

        System.out.println(ans);

        sc.close();
    }
}
