package baekjoon.chobo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_17013 {
    /*
        Flipper

        optometrist - 검안사, 시력 측정 의사

        2차원 배열을 입력 받고

        1 2
        3 4

        고정된 2차원 배열

        H 수평 뒤집기
        V 수직 뒤집기 를 하여 결과 출력

        1000000 문자 문자열 입력 H or V
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String flip = br.readLine();

        int vCnt = 0;
        int hCnt = 0;

        for (int i = 0; i < flip.length(); i++) {
            if (flip.charAt(i) == 'V') {
                vCnt++;
            } else {
                hCnt++;
            }
        }

        int[][] arr = new int[][]{{1, 2}, {3, 4}};
        
        if (hCnt % 2 == 1) {
            // horizontal flip
            for (int i = 0; i < arr.length / 2; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    int x = arr.length - i - 1;
                    int temp = arr[i][j];
                    arr[i][j] = arr[x][j];
                    arr[x][j] = temp;
                }
            }
        }

        if (vCnt % 2 == 1) {
            // vertical flip
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length / 2; j++) {
                    int y = arr[i].length - j - 1;
                    int temp = arr[i][j];
                    arr[i][j] = arr[i][y];
                    arr[i][y] = temp;
                }
            }
        }

        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
