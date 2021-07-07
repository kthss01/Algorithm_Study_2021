package programmers.level1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class NumDesc {
    /*
        정수 내림차순으로 배치하기

        정수 n의 각 자릿수를 큰 것부터 작은 순으로 정렬한 새로운 정수 리턴

        ex)
        n 118372 -> 873211

        제한 조건
        n 1 이상 800000000 이하 자연수
     */
    public static void main(String[] args) {
        long n = 118372;
        System.out.println(solution(n));
    }

    private static long solution(long n) {
        long answer = 0;

        // 문자열 변환해 배열 만들고 정렬 후 다시 문자열 만들어 숫자 변환
//        String str = String.valueOf(n);
//        ArrayList<Integer> list = new ArrayList<>();
//        for (char ch : str.toCharArray()) {
//            list.add(ch - '0');
//        }
//
//        list.sort(Collections.reverseOrder());
//
//        StringBuilder sb = new StringBuilder();
//        for (int num : list) {
//            sb.append(num);
//        }
//
//        answer = Long.parseLong(sb.toString());

        // 숫자 배열에 넣은 후 9부터 내려오면서 문자열 만들어서 숫자 변환
        int[] arr = new int[10];
        while (n != 0) {
            arr[(int) (n % 10)]++;
            n /= 10;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 9; i >= 0; i--) {
            if (arr[i] != 0) {
                for (int j = 0; j < arr[i]; j++) {
                    sb.append(i);
                }
            }
        }

        answer = Long.parseLong(sb.toString());

        return answer;
    }
}
