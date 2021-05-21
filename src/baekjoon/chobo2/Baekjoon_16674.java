package baekjoon.chobo2;

import java.util.Scanner;

public class Baekjoon_16674 {
    /*
        2018년을 되돌아보며

        양의 정수를 입력 받았을 때
        2, 0, 1, 8로만 이루어져 있다면 2018과 관련 있는 수
        2018과 관련 있는 수 중
            2, 0, 1, 8을 모두 포함하는 수들은 밀접한 수
        2018과 밀접한 수 중
            2, 0, 1, 8의 개수가 모두 똑같은 수들은 묶여있는 수
        2018과 관련 있는 수가 아닌 양의 정수는
            관련 없는 수

        N 입력 (양의 정수 , 1 <= N < 1,000,000,000)
        N은 0으로 시작하지 않음

        관련 없는 수이면 0
        관련 있는 수이나 밀접한 수가 아니면 1
        밀접한 수이나 묶여있는 수가 아니면 2
        묶여있는 수이면 8을 출력
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num = sc.nextLine();

        int[] arr = new int[10];

        boolean isRelated = true;

        for (int i = 0; i < num.length(); i++) {
            int n = num.charAt(i) - '0';

            if (n != 2 && n != 0 && n != 1 && n != 8)
                isRelated = false;

            arr[n]++;
        }

        boolean isHad = arr[0] >= 1 && (arr[2] ==  arr[0] && arr[0] == arr[1] && arr[1] == arr[8]);

        boolean isNeared = arr[2] >= 1 && arr[0] >= 1 && arr[1] >= 1 && arr[8] >= 1;

        if (!isRelated) {
            System.out.println(0);
        } else if (!isNeared) {
            System.out.println(1);
        } else if (!isHad) {
            System.out.println(2);
        } else {
            System.out.println(8);
        }

    }
}
