package baekjoon.chobo2;

import java.util.ArrayList;
import java.util.Scanner;

public class Bakejoon_16968 {
    /*
        차량 번호판 1

        번호판 형식이 주어졌을 때, 가능한 차량 번호판의 개수 구하기

        번호판에 사용할 수 있는 수자 0, 1, 2, ..., 8, 9
        사용할 수 있는 문자 a, b, c, d, ..., y, z
        차량 번호판의 형식 최대 4글자, c와 d로 이루어진 문자열로 나타낼 수 있음
        c는 문자가 위치하는 자리, d는 숫자가 위치하는 자리
        같은 문자 또는 숫자가 연속해서 2번 나타나면 안된다.
        ex) cd : a1, d4, h5, k4 등 가능
        dd : 01, 10, 34, 69는 가능, 00, 11, 55, 66 은 불가

        입력
        차량 번호판의 형식 주어짐, 형식은 길이가 4보다 작거나 같으며, c와 d로만 이루어져 있다.
        출력
        가능한 차량 번호판의 개수 출력
     */

    public static boolean isPossible(String num) {
        for (int i = 0; i < num.length() - 1; i++) {
            if (num.charAt(i) == num.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String delimiter = sc.nextLine();

        ArrayList<String> arr = new ArrayList<>();

        for (int i = 0; i < delimiter.length(); i++) {
            char c = delimiter.charAt(i);

            switch (c) {
                case 'c':
                    if (i == 0) {
                        for (int j = 0; j < 26; j++) {
                            arr.add(String.valueOf((char)('a' + j)));
                        }
                    } else {
                        ArrayList<String> temp = new ArrayList<>();
                        for (String str : arr) {
                            for (int j = 0; j < 26; j++) {
                                temp.add(str + ((char)('a' + j)));
                            }
                        }
                        arr = temp;
                    }
                    break;
                case 'd':
                    if (i == 0) {
                        for (int j = 0; j < 10; j++) {
                            arr.add(String.valueOf(i));
                        }
                    } else {
                        ArrayList<String> temp = new ArrayList<>();
                        for (String str : arr) {
                            for (int j = 0; j < 10; j++) {
                                temp.add(str + j);
                            }
                        }
                        arr = temp;
                    }
                    break;
            }
        }

        int count = arr.size();
        for (String num : arr) {
//            System.out.println(num);
            if (!isPossible(num)) {
                count--;
            }
        }

        System.out.println(count);
    }
}
