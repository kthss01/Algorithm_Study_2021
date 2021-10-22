package baekjoon.chobo3;

import java.util.Scanner;

public class Baekjoon_17496 {
    /*
        스타후르츠

        씨앗을 심으면 자라는데 T일 걸림
        i일에 씨앗 심으면 i+T일 수확
        수확한 날에도 같은 칸에 씨앗을 또 심을 수 있음
        심을 수 있는 빈 칸 C개 한 칸에 한 개의 심을 수 있음
        1 ~ N일까지 열므 지속
        여름이 아닌 날 바로 시들어버리므로 N일 지나면 더 이상 수확 X
        한 개 판매하면 P원을 벌 수 있음
        얼마나 벌 수 있는지 꼐산하기
        일을 원하는 만큼 할 수 있고 씨앗도 충분하다 가정

        여름 일수 N 2 ~ 90
        스타후르츠 자라는데 걸리는 일 수 T 1 ~ N-1
        심을 수 잇는 칸 C 1 ~ 300
        개당 가격 P 1 ~ 1000
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int c = sc.nextInt();
        int p = sc.nextInt();

        int plant = n % t == 0 ? (n / t) - 1 : n / t;
        int ans = plant * c * p;
        System.out.println(ans);
    }
}
