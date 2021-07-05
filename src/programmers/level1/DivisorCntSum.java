package programmers.level1;

import java.util.Arrays;

public class DivisorCntSum {
    /*
        약수의 개수와 덧셈
        두 정수 left와 right 매개변수
        left부터 right까지의 모든 수들 중에서,
        약수의 개수가 짝수인 수는 더하고
        약수의 개수가 홀수인 수는 뺀 수를 return 하는 solution 함수 완성

        제한사항
        1 <= left <= right <= 1000
     */
    public static void main(String[] args) {
        int left, right;

        left = 13;
        right = 17;
        System.out.println(solution(left, right)); // result = 43

        left = 24;
        right = 27;
        System.out.println(solution(left, right)); // result = 52
    }

    // 약수 구하는 함수
    public static int findDivisorCnt(int number) {
        int cnt = 0;

        // 가장 간단한 방법
//        for (int i = 1; i <= number; i++) {
//            if (number % i == 0)
//                cnt++;
//        }

        // 1차 효율
        // 12 1 2 3 4 6 12
        for (int i = 1; i * i <= number; i++) {
            if (number % i == 0) {
                cnt++;

                // 반대의 경우도 갯수 증가
                if (i * i < number) {
                    cnt++;
                    // ex) 10 의 경우 2 일때 5도 약수 갯수 증가해야해서
                    // 9의 경우 3일땐 3만 해야해서 < 까지만
                }
            }
        }

        return cnt;
    }

    public static int[] findDivisorCnt2(int n) {
        // nlogn 방법 기존 n^2방법이 안먹힐 때 사용

        // 범위에 대해서 한번에 약수의 개수를 구할 수 있음
        // 각 배수에 대해서 약수를 찾는 방법

        int[] arr = new int[n + 1]; // n만큼의 공간 할당

        Arrays.fill(arr, 1); // 1은 모두의 약수라 1로 채움

        for (int i = 2; i <= n ; i++) {
            for (int j = i; j <= n; j += i) {
                arr[j]++;
            }
        }

        return arr;
    }

    public static int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            int divisorCnt = findDivisorCnt(i);

//            System.out.println("수: " + i + " 약수의개수: " + divisorCnt);

            answer += divisorCnt % 2 == 0 ? i : -i; // 짝수면 더하고 홀수면 빼기
        }

//        int[] arr = findDivisorCnt2(right);
//        for (int i = left; i <= right; i++) {
//            answer += arr[i] % 2 == 0 ? i : -i;
//        }

        return answer;
    }
}
