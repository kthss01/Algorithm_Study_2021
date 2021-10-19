package baekjoon.chobo3;

import java.util.Scanner;

public class Baekjoon_17294 {
    /*
        귀여운 수
        각 자릿수 등차수열이면 귀여운 수
        귀여운 수인지 판단
        k 1 ~ 10^18 입력 0으로 시작 x
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String k = sc.nextLine();

        boolean isCute = true;

        if (k.length() > 2) {
            int d = (k.charAt(0) - '0') - (k.charAt(1) - '0');
            for (int i = 1; i < k.length()-1; i++) {
                int d2 = (k.charAt(i) - '0') - (k.charAt(i + 1) - '0');
                if (d != d2) {
                    isCute = false;
                    break;
                }
            }
        }

        if (isCute) {
            System.out.println("◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!");
        } else {
            System.out.println("흥칫뿡!! <(￣ ﹌ ￣)>");
        }
    }
}
