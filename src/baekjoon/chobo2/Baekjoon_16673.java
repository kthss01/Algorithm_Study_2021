package baekjoon.chobo2;

import java.util.Scanner;

public class Baekjoon_16673 {
    /*
        고려대학교에는 공식 와인이 있다

        와인을 사기로 시작한 해 0년차
        n년 차
        Kn + Pn^2

        C년 (마지막 해에 산 와인의 수는 KC + PC^2)

        와인을 얼마나 수집했는지 계산

        C, K, P (0 <= C <= 100, 0 <= K <= 1000, 0 <= P <= 100)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();
        int k = sc.nextInt();
        int p = sc.nextInt();

        int count = 0;

        for (int i = 1; i <= c; i++) {
            count += k * i + p * i * i;
        }

        System.out.println(count);
    }
}
