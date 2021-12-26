package baekjoon.kingchobo;

import java.util.Scanner;

/**
 * ISBN - 브론즈 4 (영어문제)
 * 
 * ISBN (International Standard Book Number)
 *  13-digit code for identifying books
 * 규칙이 있음
 * 13자리 숫자 
 *  각 자릿수마다 1, 3 곱해서 합하게 됨
 * 그 값이 항상 10의 배수여야함
 * 
 * 앞의 10자리를
 *  9780921418 이라고 가정할 떄
 * 남은 3자리를 추가로 주어졌을 때 합을 구하기
 * 
 * ex)
 *  9 4 8 이렇게 주어지면 (한줄 씩)
 *  The 1-3-sum is 120 이라고 출렭
 */
public class Baekjoon_6810 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String digits = "9780921418";

        int sum = 0;

        for (int i = 0; i < digits.length(); i++) {
            int digit = digits.charAt(i) - '0';
            sum += i % 2 == 0 ? digit :  digit * 3;
        }

        for (int i = 0; i < 3; i++) {
            int num = sc.nextInt();
            sum += i % 2 == 0 ? num : num * 3;
        }

        System.out.printf("The 1-3-sum is %d\n", sum);

        sc.close();
    }
}
