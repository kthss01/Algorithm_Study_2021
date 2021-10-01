package baekjoon.kingchobo;

import java.util.Scanner;

public class Baekjoon_23037 {
    /*
        5의 수난

        다섯자리 수를 입력받아, 각 자릿수의 다섯제곱의 합을 출력하기

        입력
        다섯자리 양의 정수 n (n 10^4 <= n < 10^5)

        출력
        각 자릿우의 다섯제곱의 합 출력
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num = sc.nextLine();

        int result = 0;

        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';
            result += (int) (Math.pow(digit, 5));
        }

        System.out.println(result);
    }
}
