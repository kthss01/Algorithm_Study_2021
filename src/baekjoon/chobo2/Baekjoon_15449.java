package baekjoon.chobo2;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon_15449 {
    /*
        Art

        5개 막대기 중 3개를 뽑을 때
        삼각형이 될 수 있는 경우는 몇가지인가?

        l1, l2, l3, l4, 5l (1 <= li <= 1000)

        가능한 삼각형의 수 출력
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] lArr = new int[5];
        for (int i = 0; i < lArr.length; i++) {
            lArr[i] = sc.nextInt();
        }

        Arrays.sort(lArr);

        int count = 0;

        for (int i = 0; i < lArr.length; i++) {
            for (int j = i + 1; j < lArr.length; j++) {
                for (int k = j + 1; k < lArr.length; k++) {
                    int a = lArr[i];
                    int b = lArr[j];
                    int c = lArr[k];

//                    System.out.println(i + "," + j + "," + k);
//                    System.out.println(a + "," + b + "," + c);

                    if (a + b > c) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}
