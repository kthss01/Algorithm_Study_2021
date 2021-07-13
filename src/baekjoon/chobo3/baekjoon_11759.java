package baekjoon.chobo3;

import java.util.Scanner;

public class baekjoon_11759 {
    /*
        Bottled-Up Feelings

        병과 병을 채울 박스 2개가 주어질 때
        최대한 큰 박스에 병을 채우고 나머지 작은 박스에 채울때
        박스가 몇개 필요한지 출력하기

        입력
        s v1 v2 s <= 10^6 v1,v2 <= 10^6 v1 > v2

        출력
        딱 박스에 안채워지면 Impossible 출력
        아닌 경우 각 박스의 개수 출력
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int v1 = sc.nextInt();
        int v2 = sc.nextInt();

        int b1 = 0;
        int b2 = 0;

        b1 = s / v1;

        int t = s - (b1 * v1);

        while (b1 > 0) {
            if (t % v2 == 0) {
                b2 = t / v2;
                break;
            } else {
                b1--;
                t += v1;
            }
        }

        if (b1 == 0 && t % v2 == 0) {
            b2 = t / v2;
        }

        if (b1 == 0 && b2 == 0) {
            System.out.println("Impossible");
        } else {
            System.out.println(b1 + " " + b2);
        }
    }
}
