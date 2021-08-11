package baekjoon.kingchobo;

import java.util.Scanner;

public class Baekjoon_19532 {
    /*
        수학은 비대면강의입니다

        ax + by = c
        dx + ey = f

        y  = (c - ax) / b
        dx + e * (c - ax) / b = f
        bdx + ec - aex = bf
        (bd - ae) x = (bf - ec)
        x = (bf - ed) / (bd - ae)
        x = (ed - bf) / (ae - bd)

        x = (c - by) / a
        d(c - by) / a + ey = f
        cd - bdy + aey = af
        y = (af - cd) / (ae - bd)


        a, b, c, d, e,f 가 공백으로 구분되어 차례대로 주어짐 (-999 ~ 999)
        문제에서 언급한 방정식을 만족하는 x,y 유일하게 존재
        x,y -999 ~ 999 정수인 경우만 입력으로 주어짐 보장

        x,y 공백 구분해 출력
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();

        int x = 0;
        int y = 0;
//        boolean isFind = false;
//        for (int i = -999; i <= 999; i++) {
//            for (int j = -999; j <= 999; j++) {
//                if (a * i + b * j == c && d * i + e * j == f) {
//                    x = i;
//                    y = j;
//                    isFind = true;
//                    break;
//                }
//            }
//            if (isFind)
//                break;
//        }
        int g = a * e - b * d;
        x = (c * e - b * f) / g;
        y = (a * f - c * d) / g;

        System.out.println(x + " " + y);
    }
}
