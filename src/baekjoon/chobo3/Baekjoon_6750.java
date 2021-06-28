package baekjoon.chobo3;

import java.util.Scanner;

public class Baekjoon_6750 {
    /*
        Rotating letters

        문자가 I, O, S, H, Z, X, N 으로 되어있어서
        180도 회전이 가능한지 확인하기

        최대 30일기 문자 입력 (모두 대문자) 최소 1문자 이상
        가능하면 YES 아니면 NO
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();

        boolean isRotate = true;

        String rotateWord = "IOSHZXN";

        for (char ch : word.toCharArray()) {
            isRotate = false;
            for (char roCh : rotateWord.toCharArray()) {
                if (ch == roCh) {
                    isRotate = true;
                    break;
                }
            }
            if (!isRotate) {
                break;
            }
        }

        System.out.println(isRotate ? "YES" : "NO");
    }
}
