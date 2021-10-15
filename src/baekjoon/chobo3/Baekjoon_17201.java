package baekjoon.chobo3;

import java.util.Scanner;

public class Baekjoon_17201 {
    /*
        자석 체인

        자석을 이어 붙여 자석 체인을 만들고 이를 이용한 가상 화폐를 만들고 싶어짐

        자석 특징
        +극 1이라는 숫자
        -극 2라는 숫자
        자석은 막대모양 +극 -극 하나씩

        보통 자석은 같은 극끼리 밀어내고 다른 극끼리 서로 끌어당겨 붙는 성질
        이 성질을 이용해 가지고 있는 자석들을 모두 이어 붙여
        연결된 자석 체인을 만들려고 함

        연결된 자석 중 하나의 방향을 뒤집어 자석 체인을 분리했을지 모름
        자석 체인이 모두 연결되어 있는지 확인하기

        입력
        자석의 개수 N (3 ~ 5)
        자석의 현재 연결 상태 나타내는 수열 한줄에 주어짐
        순서대로 2개의 인접한 숫자가 하나의 자석을 나타냄
        수열의 값중 1 +극 2 -극 나타냄
        단, 자석은 원래 상태(모두 연결된 상태)와 비교했을 때
        최대 1개만 반대로 뒤집을 수 있음

        출력
        모두 연결되어있으면 Yes
        아니면 No
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String magnet = sc.next();

        boolean isSame = true;
        char c = magnet.charAt(0);
        for (int i = 0; i < magnet.length(); i += 2) {
            if (c != magnet.charAt(i)) {
                isSame = false;
                break;
            }
        }

        System.out.println(isSame ? "Yes" : "No");
    }
}
