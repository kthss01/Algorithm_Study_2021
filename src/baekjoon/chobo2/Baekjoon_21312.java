package baekjoon.chobo2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Baekjoon_21312 {
    /*
        홀짝 칵테일

       음료 정수로 표현되는 고유 번호
       홀짝 칵테일 : 칵테일에 들어가는 음료들의 고유 번호의 곱

       맛이 홀수인 칵테일이 짝수보다 맛있음
       똑같은 홀수이거나 짝수인 맛을 가진 칵테일끼리는
       맛이 더 큰 칵테일이 맛있음

       음료 셋의 고유번호가 주어졌을 때
       이 음료들을 좋바해서 만들 수 있는 칵테일 중 가장 맛있다고 느끼는 칵테일 찾기

       칵테일을 만들 때는, 반드시 모든 음료를 사용할 필요는 없음
       적어도 하나의 음료는 사용해야 함
       단 하나의 음료만 사용하는 경우 칵테일의 맛은 사용한 음료의 고유 번호와 같다
       주어진 세 음료는 서로 다른 고유 번호 가지고 있다.

       A, B, C (공백 구분) 입력 (1 <= A,B,C <= 100)
       가장 맛잇는 칵테일 맛 출력
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result;

        ArrayList<Integer> oddList = new ArrayList<>();
        ArrayList<Integer> evenList = new ArrayList<>();

        // 각각 확인
        if (a % 2 == 0) {
            evenList.add(a);
        } else {
            oddList.add(a);
        }

        if (b % 2 == 0){
            evenList.add(b);
        } else {
            oddList.add(b);
        }

        if (c % 2 == 0) {
            evenList.add(c);
        } else {
            oddList.add(c);
        }

        // 두 개 곱
        int d = a * b;
        if (d % 2 == 0) {
            evenList.add(d);
        } else {
            oddList.add(d);
        }

        d = b * c;
        if (d % 2 == 0) {
            evenList.add(d);
        } else {
            oddList.add(d);
        }

        d = c * a;
        if (d % 2 == 0) {
            evenList.add(d);
        } else {
            oddList.add(d);
        }

        d = a * b * c;
        if (d % 2 == 0) {
            evenList.add(d);
        } else {
            oddList.add(d);
        }

        Collections.sort(evenList);
        Collections.sort(oddList);

        if (oddList.size() > 0) {
            result = oddList.get(oddList.size() - 1);
        } else {
            result = evenList.get(evenList.size() - 1);
        }

        System.out.println(result);
    }
}
