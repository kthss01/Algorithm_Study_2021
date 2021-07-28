package baekjoon.chobo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_14547 {
    /*
        X X glued

        VY ABCD RB or Y ABCD RB (ABCD 숫자) 형태로 주어질 때

        abcd만 보았을 때
        6006 과 같이 00이 붙어있으면 glued임
        2000 이처럼 000도 glued
        4444 4444도 glued
        2233 이러면 2 2 glued and 3 3 glued
        이런식으로 glued 찾아내기

        입력
        VY ABCD RB or Y ABCD RB 형태
        # 입력 받으면 종료

        출력
        0 0 glued 와 같은 형태
        2 2 glued and 3 3 glude 와 같이 두 개면 이런식으로 출력
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        while (true) {
            String str = br.readLine();

            if (str.equals("#"))
                break;

            String numStr = str.split(" ")[1];

            for (int i = 0; i < numStr.length() - 1; i++) {
                if (numStr.charAt(i) == numStr.charAt(i + 1)) {
                    char c1 = numStr.charAt(i);
                    sb.append(String.format("%c %c glued", c1, c1));

                    if (i == 0 && numStr.charAt(i + 2) == numStr.charAt(i + 3)
                            && c1 != numStr.charAt(i + 2)) {
                        char c2 = numStr.charAt(i + 2);
                        sb.append(String.format(" and %c %c glued\n", c2, c2));
                    } else {
                        sb.append("\n");
                    }

                    break;
                }
            }
        }

        System.out.println(sb);
    }
}
