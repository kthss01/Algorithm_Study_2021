package baekjoon.chobo2;

import java.util.Scanner;

public class Baekjoon_18238 {
    /*
        ZOAC 2

        원판에 문자들이 순서대로 적혀있음
        처음 순간 'A' 가리키고 있음
        왼쪽 또는 오른쪽으로 돌릴 수 있음 한 칸 돌리는데 1 소요
        화살표가 가리키고 있는 문자 출력, 출력하는데 시간 소요 X

        최대한 빠르게 문자 출력하고자 할 때 걸리는 시간 최솟값 출력

        알파벳 대문자 출력 길이 최대 100자, 빈 문자열 X
        시간의 최솟값 출력
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int count = 0;
//        char curCh = 'A';
//
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//
//            if (curCh < ch) {
//                count += Math.min(ch - curCh, curCh + 26 - ch);
//            } else {
//                count += Math.min(curCh - ch, ch + 26 - curCh);
//            }
//
//            curCh = ch;
//        }

        System.out.println(count);
    }
}
