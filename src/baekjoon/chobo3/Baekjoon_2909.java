package baekjoon.chobo3;

import java.util.Scanner;

public class Baekjoon_2909 {
    /*
        캔디 구매

        특정 액면가의 지폐만 가지고 있고 거스름돈을 받지 않음
        지폐의 액면가에 따라 가장 가까운 금액으로 사탕의 가격이 반올림됨

        ex)
        액면가 100원
        사탕 가격
            150원 -> 200원
            149원 -> 100원

        액면가는 항상 1, 10, 100, 1000, ..., 1000000000 중 하나
        지폐는 무한개 가지고 있음

        사탕 가격, 액면가가 주어졌을 때 가격이 얼마로 바뀔지 구하기

        사탕의 가격 C, 액면가에 적혀있는 0의 개수 K
        (0 <= C <= 1000000000, 0 <= K <= 9)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();
        int k = sc.nextInt();

        System.out.println((int)(Math.round(c / Math.pow(10,k)) * Math.pow(10, k)));
    }
}
