package baekjoon.chobo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_17202 {
    /*
        핸드폰 번호 궁합
        010 -(하이픈) 모두 제외 A B 두 사람 중 A 부터 한 숫자씩 번갈아가면서 적음
        인접한 두 숫자끼리 더한 값의 일의 자리를
        두 숫자의 아래에 적어나가면서 마지막에 남는 숫자 2개로 궁합률 구함

        A, B 핸드폰의 번호는 다르고 가정

        입력
        1줄 A 핸드폰 번호
        2줄 B 핸드폰 번호
        010 - 제외 숫자 8개로 주어짐
        A B 다름

        출력
        궁합률 두자리 정수로 출력
        십의 자리 0이어도 0을 붙여 두자리 출력
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        String b = br.readLine();

        StringBuilder some = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            some.append(a.charAt(i)).append(b.charAt(i));
        }

        StringBuilder result;
        while (true) {
            result = new StringBuilder();
//            System.out.println(some);

            for (int i = 0; i < some.length() - 1; i++) {
                int n1 = some.charAt(i) - '0';
                int n2 = some.charAt(i + 1) - '0';
                result.append((n1 + n2) % 10);
            }

            if (result.length() == 2) {
                break;
            }
            some = new StringBuilder(result.toString());
        }

        System.out.println(result);
    }
}
