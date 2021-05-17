package baekjoon.chobo2;

import java.util.Scanner;

public class Baekjoon_16017 {
    /*
        Telemarketer or not?

        telemarketer number인지 확인하기

        특징
        last four digits 3가지 특징이 있음
        첫 번호 8 or 9
        마지막 번호 8 or 9
        2,3번째 번호 둘이 같음

        마지막 4 번호르 입력 받아
        telemarketer number인지 확인하기

        맞으면 ignore 출력 아니면 answer 출력
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] digits = new int[4];

        for (int i = 0; i < digits.length; i++) {
            digits[i] = sc.nextInt();
        }

        boolean isTelemarketer;

//        if ((digits[0] == 8 || digits[0] == 9) &&
//                (digits[1] == digits[2]) && (digits[3] == 8 || digits[3] == 9))
//            isTelemarketer = true;
//        else {
//            isTelemarketer = false;
//        }

        isTelemarketer = digits[0] == 8 || digits[0] == 9;
        isTelemarketer &= digits[1] == digits[2];
        isTelemarketer &= digits[3] == 8 || digits[3] == 9;

        System.out.println(isTelemarketer ? "ignore" : "answer");
    }
}
