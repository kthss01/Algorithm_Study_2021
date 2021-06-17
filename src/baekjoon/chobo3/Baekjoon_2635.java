package baekjoon.chobo3;

import java.util.ArrayList;
import java.util.Scanner;

public class Baekjoon_2635 {
    /*
        수 이어가기

        다음과 같은 규칙에 따라 수들을 만들려고함
            1. 첫 번째 수로 양의 정수가 주어짐
            2. 두 번째 수는 양의 정수 중에서 하나를 선택
            3. 세 번째부터 이후에 나오는 모든 수는 앞의 앞의 수에서 앞의 수를 빼서 만듬
            ex) 세 번째 수는 첫 번째 수에서 두 번째 수를 뺀 것이고,
            네 번째 수는 두 번째 수에서 세 번째 수를 뺀 것
            4. 음의 정수가 만들어지면, 이 음의 정수를 버리고 더 이상 수를 만들지 않음

        입력으로 첫 번째 수가 주어질 때
        이 수에서 시작하여 위의 규칙으로 만들어지는 최대 개수의 수들 구하기
        최대 개수의 수들이 여러 개일 때, 그 중 하나의 수들만 출력

        입력
        첫 번째 수 주어짐 (30,000보다 같거나 작은 양의 정수)
        출력
        첫째 줄에 첫 번째 수로 시작하여 위의 규칙에 따라 만들 수 있는 수들의 최대 개수 출력
        둘째 줄에 그 최대 개수의 수들을 차례대로 출력 (빈칸 공백)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Integer> arr = null;

        for (int i = n / 2; i <= n; i++) {
            int prev = n;
            int next = i;
            ArrayList<Integer> tempArr = new ArrayList<>();
            tempArr.add(prev);
            tempArr.add(next);

            while (prev - next >= 0) {
                tempArr.add(prev - next);
                int temp = prev - next;
                prev = next;
                next = temp;
            }

            if (arr == null || arr.size() < tempArr.size()) {
                arr = tempArr;
            }
        }

        if (arr == null)
            System.out.println(0);
        else {
            System.out.println(arr.size());
            for (int a : arr) {
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}
