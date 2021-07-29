package baekjoon.chobo3;

import java.util.*;

public class Bakejoon_14709 {
    /*
        여우 사인

        여우 사인은 엄지, 중지, 약지 세 손가락을 서로 끝이 맞닿도록 모으고,
        검지와 새끼손가락은 다른 손가락과 닿지 않도록 곧게 펴서 여우의 얼굴과 두 귀를 표현한 손 모양

        손 모양이 주어질 때, 여우 사인이라고 할 수 있는지 판별하기
        손 모양은 서로 닿아 있는 손가락 쌍의 나열로 표현
        손가락들이 서로 닿아 있는 관계가 올바른 여우 사인과 같으면 여우 사인으로 인정

        1,3,4 가 닿아있어야 함
        -> 정확히는 (1,3)(1,4)(3,4) 가 입력받아지면 됨

        입력
        손가락 쌍의 개수 N (1 <= N <= 10)
        1 ~ 5 숫자 두 개 공백 구분 (1 엄지, 2 검지, 3 중지, 4 약지, 5 새끼)
        출력
        여우 사인이면 Wa-pa-pa-pa-pa-pa-pow!
        아니면 Woof-meow-tweet-squeek
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] signArr = { "Wa-pa-pa-pa-pa-pa-pow!", "Woof-meow-tweet-squeek" };

        int[][] arr = new int[6][6];

        for (int i = 0; i < n; i++) {
            int f1 = sc.nextInt();
            int f2 = sc.nextInt();

            if (f1 > f2) {
                int temp = f1;
                f1 = f2;
                f2 = temp;
            }

            arr[f1][f2] = 1;
        }

        int sum1 = 0;
        for (int i = 1; i <= 5; i++) {
            sum1 += arr[1][i];
        }
        int sum2 = 0;
        for (int i = 1; i <= 5; i++) {
            sum2 += arr[3][i];
        }

        if (sum1 == 2 && arr[1][3] == 1 && arr[1][4] == 1
                && sum2 == 1 && arr[3][4] == 1) {
            System.out.println(signArr[0]);
        } else {
            System.out.println(signArr[1]);
        }
    }
}
