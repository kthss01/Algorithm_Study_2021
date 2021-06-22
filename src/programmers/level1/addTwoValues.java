package programmers.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class addTwoValues {
    /*
        두 개 뽑아서 더하기
        정수 배열 numbers가 주어짐
        numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서
        만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수 완성
     */
    public static void main(String[] args) {
        int[] numbers;
        int[] answer;

        numbers = new int[]{2, 1, 3, 4, 1};
        answer = solution(numbers);
        print(answer);

        numbers = new int[]{5, 0, 2, 7};
        answer = solution(numbers);
        print(answer);
    }

    public static void print(int[] number) {
        for (int num : number) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] solution(int[] numbers) {
        int[] answer = {};

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i == j) continue; // 같은 거 제거
                set.add(numbers[i] + numbers[j]);
            }
        }

        ArrayList<Integer> list = new ArrayList<>(set);

        Collections.sort(list); // 정렬해주는게 좋을 듯

        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        // 더 좋은 방법
        // TreeSet으로 하면 정렬도 됨
        // 스트림 이용하는 방법도 있음
        answer = set.stream().sorted().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}
