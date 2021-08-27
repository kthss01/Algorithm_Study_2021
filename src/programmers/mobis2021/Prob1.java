package programmers.mobis2021;

import java.util.ArrayList;
import java.util.Collections;

public class Prob1 {

    /*
        문제설명
        0 ~ 9 사이의 숫자가 쓰여있는 정육면체 주사위 n개가 주어졌을 때,
        당신은 이 주사위로 만들 수 없는 가장 작은 자연수를 찾으려 합니다.
        주사위로 숫자를 만드는 방법은 다음과 같습니다.

        주사위를 모두 굴립니다.
        그중 1 ~ n개를 임의로 선택합니다.
        선택한 주사위를 임의의 순서로 왼쪽부터 오른쪽까지 나열합니다.
        단, 0이 나온 주사위를 맨 왼쪽에 놓을 수 없습니다. 0이 나온 주사위 하나만 선택하는 것도 불가능합니다.
        임의로 나열한 주사위를 왼쪽부터 읽어 숫자를 만듭니다.
        예를 들어, 2개의 주사위가 선택되었고 왼쪽 주사위는 1, 오른쪽 주사위는 2가 나왔다면 숫자 12를 만듭니다.
        주사위는 원하는 숫자가 나올 때까지 계속 굴릴 수 있습니다.

        예를 들어, 주사위 두 개가 주어지고,
        각 주사위에 쓰여있는 숫자가 [1, 6, 2, 5, 3, 4], [9, 9, 1, 0, 7, 8]라고 할 때
        만들 수 있는 숫자는 다음과 같습니다.

        1, 2, 3, ..., 20, 21, 27, 28, ...

        따라서 만들 수 없는 가장 작은 자연수는 22입니다.

        주사위의 정보를 담은 2차원 정수 배열 dice가 매개변수로 주어질 때,
        만들 수 없는 가장 작은 자연수를 return 하도록 solution 함수를 완성해주세요.
     */

    /*
        제한사항
        1 ≤ dice의 길이 = 주사위의 개수 ≤ 4
        dice의 원소는 각 주사위에 쓰인 수를 담고 있는 길이 6인 정수 배열입니다.
        주사위는 항상 0 이상 9 이하인 수가 6개 쓰여있으며, 중복된 수가 쓰여있을 수도 있습니다.
     */

    /*
        입출력 예
        dice	                                                        result
        [[1, 6, 2, 5, 3, 4], [9, 9, 1, 0, 7, 8]]	                    22
        [[0, 1, 5, 3, 9, 2], [2, 1, 0, 4, 8, 7], [6, 3, 4, 7, 6, 5]]	66
     */

    public static void main(String[] args) {
        int[][] dice;
        int result;
        int answer;

//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//
//        do {
//            int temp = 0;
//            for (int i = 0; i < list.size(); i++) {
//                temp += list.get(i) * (int) Math.pow(10, list.size() - 1 - i);
//            }
//            System.out.println(temp);
//        } while(nextPermutation(list));

        // ex1
        dice = new int[][]{{1, 6, 2, 5, 3, 4}, {9, 9, 1, 0, 7, 8}};
        result = 22;
        answer = solution(dice);
        System.out.println(check(answer, result));

        // ex2
        dice = new int[][]{{0, 1, 5, 3, 9, 2}, {2, 1, 0, 4, 8, 7}, {6, 3, 4, 7, 6, 5}};
        result = 66;
        answer = solution(dice);
        System.out.println(check(answer, result));
    }

    public static boolean check(int answer, int result) {
        return answer == result;
    }

    public static int solution(int[][] dice) {
        int answer = 0;

        int[] numbs = new int[10001];

        // 1자리 수
        for (int i = 0; i < dice.length; i++) {
            for (int j = 0; j < 6; j++) {
                if (numbs[dice[i][j]] == 0)
                    numbs[dice[i][j]] = 1;
            }
        }

        // 2자리 수
        if (dice.length >= 2) {
            for (int i = 0; i < dice.length; i++) {
                int temp = 0;
                for (int j = 0; j < 6; j++) {

                    for (int k = 0; k < dice.length; k++) {
                        if (i == k)
                            continue;

                        for (int l = 0; l < 6; l++) {
                            temp = dice[i][j] * 10 + dice[k][l];

//                        System.out.println(temp);

                            if (numbs[temp] == 0)
                                numbs[temp] = 1;
                        }
                    }
                }
            }
        }

        // 3자리 수
        if (dice.length >= 3) {
            for (int m = 0; m < dice.length; m++) {
                int temp = 0;
                for (int n = 0; n < 6; n++) {
                    for (int i = 0; i < dice.length; i++) {
                        for (int j = 0; j < 6; j++) {
                            for (int k = 0; k < dice.length; k++) {
                                if (i == k || k == m || m == i)
                                    continue;
                                for (int l = 0; l < 6; l++) {
                                    temp = dice[m][n] * 100 + dice[i][j] * 10 + dice[k][l];

                                    if (numbs[temp] == 0)
                                        numbs[temp] = 1;
                                }
                            }
                        }
                    }
                }
            }
        }

        // 4자리 수
        if (dice.length >= 4) {
            for (int o = 0; o < dice.length; o++) {
                for (int p = 0; p < 6; p++) {
                    int temp = 0;
                    for (int m = 0; m < dice.length; m++) {
                        for (int n = 0; n < 6; n++) {
                            for (int i = 0; i < dice.length; i++) {
                                for (int j = 0; j < 6; j++) {
                                    for (int k = 0; k < dice.length; k++) {
                                        if (i == k || k == m || m == i)
                                            continue;
                                        for (int l = 0; l < 6; l++) {
                                            temp = dice[o][p] * 1000 + dice[m][n] * 100 + dice[i][j] * 10 + dice[k][l];

                                            if (numbs[temp] == 0)
                                                numbs[temp] = 1;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        for (int i = 1; i <= 10000; i++) {
            if (numbs[i] == 0) {
                answer = i;
                break;
            }
        }

        return answer;
    }

    // 순열 구하기
    private static boolean nextPermutation(ArrayList<Integer> list) {
        int i = list.size() - 1;
        int j = list.size() - 1;

        // top
        while (i > 0 && list.get(i - 1) >= list.get(i)) --i;
        if (i <= 0) return false; // 꼭대기 0이면 마지막

        // find j
        while (list.get(i - 1) > list.get(j)) --j;
        Collections.swap(list, i - 1, j);

        // 순서 정하기
        for (; i < j; ++i, --j) {
            Collections.swap(list, i, j);
        }

        return true;
    }
}
