package baekjoon.chobo3;

import java.util.Scanner;

public class Baekjoon_6794 {
    /*
        What is n, Daddy?

        숫자가 주어지면
        손으로 숫자를 표현한다고 할 때
        두 손인 경우 첫 손은 큰 숫자로 표현 하면
        총 몇가지의 경우가 나오는지 구하기

        ex)
        4 -> 3
        4 = 4
        4 = 3 + 1
        4 = 2 + 2

        입력
            1 ~ 10
        출력
            가능한 경우 출력
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num < 6) {
            System.out.println(num / 2 + 1); // 1, 2, 3, 4, 5
        } else if (num == 6) {
            System.out.println(3); // 6
        } else if (num < 9) {
            System.out.println(2); // 7, 8
        } else {
            System.out.println(1); // 9, 10
        }
    }
}
