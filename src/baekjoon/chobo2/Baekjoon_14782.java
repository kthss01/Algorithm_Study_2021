package baekjoon.chobo2;

import java.util.Scanner;

public class Baekjoon_14782 {
    /*
        Bedtime Reading, 1

        숫자가 주어지면
        소인수분해해서
        약수를 모두 구하고 더하기
        ex) 12
        1,2,3,4,6, 12

        1 <= I <= 1,000,000

        moan 신음하다 (=groan), 투덜[칭얼]거리다
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        int result = 0;

        for (int j = 1; j * j <= i; j++) {
            if (i % j == 0) {
                result += j + i / j;
            }
        }

        System.out.println(result);
    }
}
