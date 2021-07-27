package baekjoon.chobo3;

import java.util.Scanner;

public class Baekjoon_14039 {
    /*
        Magic Squares

        마방진인지 아닌지 확인하기

        열, 행 대각선 양쪽 합 같으면 마방진 Magi Squares

        입력
        4x4 빈칸 구분 마방진 입력

        출력
        마방진이면 magic
        아니면 not magic
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(isMagic(arr) ? "magic" : "not magic");
    }

    private static boolean isMagic(int[][] arr) {
        int sum = 0;
        int sum2 = 0;

//        // 오른 아래 대각 합
//        for (int i = 0; i < 4; i++) {
//            sum += arr[i][3 - i];
//        }
//
//        // 왼 아래 대각 합
//        for (int i = 0; i < 4; i++) {
//            sum2 += arr[i][i];
//        }
//
//        if (sum != sum2)
//            return false;

        for (int i = 0; i < 4; i++) {
            sum += arr[0][i];
        }

        // 행 합
        for (int i = 0; i < 4; i++) {
            sum2 = 0;
            for (int j = 0; j < 4; j++) {
                sum2 += arr[j][i];
            }
            if (sum != sum2)
                return false;
        }

        // 열 합
        for (int i = 0; i < 4; i++) {
            sum2 = 0;
            for (int j = 0; j < 4; j++) {
                sum2 += arr[i][j];
            }
            if (sum != sum2)
                return false;
        }

        return true;
    }
}
