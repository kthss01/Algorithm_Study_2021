package baekjoon.chobo3;

import java.util.Scanner;

public class Baekjoon_6751 {
    /*
        From 1987 to 2013

        년도를 입력 받았을 때
        해당 년도부터 시작해서
        2013과 같이 숫자들이 중복되지 않는 다음 해를 출력하기

        ex)
        1987
        2013

        입력
        Y (0 <= Y <= 10000)
        출력
        D
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();

        y++; // 해당 년도 이후므로
        
        while (true) {
            if (isDistinct(y)) {
                break;
            }
            y++;
        }

        System.out.println(y);
    }

    private static boolean isDistinct(int year) {
        String str = String.valueOf(year);

        int[] arr = new int[10];
        for (char ch : str.toCharArray()) {
            arr[ch - '0']++;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 1) {
                return false;
            }
        }
        return true;
    }
}
