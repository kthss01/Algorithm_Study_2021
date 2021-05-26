package baekjoon.chobo2;

import java.util.Scanner;

public class Bakejoon_16693 {
    /*
        Pizza Deal

        두 종류 형태의 피자가 있음
        slice, circular

        slice area A1 price P1
        circular radius R1, price p2

        1달러 당 최대의 피자를 먹고 싶음
        어떤 피자를 골라야하는지 선택하기기

        a1, p1
        r1, p2
        공백 구분하여 입력 (모두 값 1000 넘지 않는 양의 정수, 두 종류의 가격 같지 않음)

        Whole pizza or Slice of pizza 출력
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt();
        int p1 = sc.nextInt();
        int r1 = sc.nextInt();
        int p2 = sc.nextInt();

        double slice = a1 / (double) p1;
        double circular = Math.PI * r1 * r1 / p2;

        String sliceStr = "Slice of pizza";
        String circularStr = "Whole pizza";

        System.out.println(slice > circular ? sliceStr : circularStr);
    }
}
