package baekjoon.chobo2;

import java.util.Scanner;

public class Baekjoon_16944 {
    /*
        강력한 비밀번호

        문자열 S가 주어지고
        아래 규칙에 맞게 비밀번호가 적용되었는지 확인하여
        규칙을 지키기위해 S의 뒤에 추가해야하는 글자의 최소 개수 구하기

        규칙
        비밀번호는 알파벳 소문자, 대문자, 숫자, 특수문자로만 이루어져 있다.
        비밀번호는 6글자 이상이어야 한다.
        숫자는 하나 이상 포함되어야 한다.
        알파벳 소문자는 하나 이상 포함되어야 한다.
        알파벳 대문자는 하나 이상 포함되어야 한다.
        특수 문자는 하나 이상 포함되어야 한다. 사용할 수 있는 특수 문자는
        !@#$%^&*()-+ 이다.

        문자열 길이 N (1 <= N <= 100)
        문자열 S

        추가해야하는 문자의 최소 개수 출력

        코드가 조금 아쉬움 잘한 사람꺼 참고하자
        너무 길음
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();

//        int count = 0;
//
//        boolean hasNum = false;
//        boolean hasLowCh = false;
//        boolean hasUpCh = false;
//        boolean hasSpecCh = false;
//
//        String spec = "!@#$%^&*()-+";
//
//        for (int i = 0; i < n; i++) {
//            char ch = s.charAt(i);
//            if (!hasNum && ch >= '0' && ch <= '9') {
//                hasNum = true;
//            }
//            if (!hasLowCh && ch >= 'a' && ch <= 'z') {
//                hasLowCh = true;
//            }
//            if (!hasUpCh && ch >= 'A' && ch <= 'Z') {
//                hasUpCh = true;
//            }
//            if (!hasSpecCh) {
//                for (int j = 0; j < spec.length(); j++) {
//                    if (ch == spec.charAt(j)) {
//                        hasSpecCh = true;
//                        break;
//                    }
//                }
//            }
//        }
//
//        if (!hasNum)
//            count++;
//        if (!hasLowCh)
//            count++;
//        if (!hasUpCh)
//            count++;
//        if (!hasSpecCh)
//            count++;
//
//        if (s.length() + count < 6) {
//            count += 6 - (s.length() + count);
//        }
//
//        System.out.println(count);

        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        int count = s.length();

        for (int i = 0; i < count; i++) {
            char ch = s.charAt(i);

            if (ch >= 'A' && ch <= 'Z') a = 1;
            else if (ch >= 'a' && ch <= 'z') b = 1;
            else if (ch >= '0' && ch <= '9') c = 1;
            else d = 1;
        }

//        System.out.printf("%d %d %d %d\n", a, b, c, d);

        int add = 4 - a - b - c - d;
//        System.out.println(add);
        count = Math.max((6 - count), 0);
//        System.out.println(count);
        System.out.println(Math.max(add, count));
    }
}
