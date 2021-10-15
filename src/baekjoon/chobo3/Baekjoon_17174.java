package baekjoon.chobo3;

import java.util.Scanner;

public class Baekjoon_17174 {
    /*
        지폐를 세려고함
        1달러 지폐를 한 장씩 세면서 M개의 지폐를 한 묶음 만듬
        그 다음에 새로 만들어진 묶음을 하나씩 세면서 M개의 묶음으로 다시 하나로 묶음
        더 이상 묶음이 만들어지지 않을 때까지 이 과정 반복
        지페 센 횟수 구하기

        ex)
            N 13 M 13
            13 달러 세기 위해
                1달러씩 13번
                10장 한 묶음 1번
                -> 14번

        N M (2 <= N <= 100,000, 2 <= M <= N)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int ans = n;

        while (n != 0) {
            ans += n / m;
            n /= m;
        }

        System.out.println(ans);
    }
}
