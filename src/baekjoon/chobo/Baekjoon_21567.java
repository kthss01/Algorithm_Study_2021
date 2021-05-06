package baekjoon.chobo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Baekjoon_21567 {
    /*
        숫자의 개수 2

        세 개의 자연수 A, B, c가 주어질 때
        A x B x C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇번씩 쓰였는지를 구하기

        ex)
        A = 150, B = 266, C = 427
            a x b x c = 17037300
            0 : 3
            1 : 1
            3 : 2
            7 : 2

        1줄 A
        2줄 B
        3줄 C
        A, B, C 모두 1,000,000보다 작은 자연수이다.

        출력
        1줄 0 몇번
        2~10줄 1~9 몇번 썼는지 출력
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        BigInteger bi = new BigInteger(String.valueOf(a));
        bi = bi.multiply(new BigInteger(String.valueOf(b)));
        bi = bi.multiply(new BigInteger(String.valueOf(c)));

        int[] arr = new int[10];

        String str = bi.toString();
//        System.out.println(str);

        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - '0']++;
        }

        for (int num : arr) {
            System.out.println(num);
        }
    }
}
