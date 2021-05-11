package baekjoon.chobo2;

import java.util.Scanner;

public class Baekjoon_14219 {
    /*
        막대과자 포장

        3x1 직사각형 모양 과자와 2x2 ㄴ자 모양 과자가 있음
        이 과자를 포장 박스에 차곡차곡 넣으려고함

        박스의 크기 n x m
        상자를 빈틈없이 꽉 채우려고 함
        빈틈없이 넣을 수 있는지 확인

        n, m (1 <= n,m <= 500)

        빈트없이 채울 수 있다면 YES 없다면 NO 출력

        L자는 결국 두개 합치면 3x2랑 똑같음
        n or m이 3의 배수면 YES 같음
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        if (n % 3 == 0 || m % 3 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
