package baekjoon.chobo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Baekjoon_14545 {
    /*
        Square

        grid square 가 있을 때 만들 수 있는 정사각형의 개수 구하기
        ex)
        length 4 => 30

        입력
        P
        P만큼 length 입력
        length 1,000,000 보다 작고 0보다 큼

        출력
        개수 출력 결과는 integer 범위 넘지 않음

        규칙
        1   1
        2   5
        3   14
        4   30
        순으로 나옴
        arr[n] = arr[n-1] + n * n
     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        int p = Integer.parseInt(br.readLine());

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);

        for (int i = 0; i < p; i++) {
            int n = Integer.parseInt(br.readLine());

            sb.append(compute(list, n)).append("\n");
        }

        System.out.println(sb);
    }

    private static int compute(ArrayList<Integer> list, int n) {

        if (list.size() >= n) {
            return list.get(n - 1);
        }

        int s = list.size();

        for (int i = s; i < n; i++) {
            list.add(list.get(i - 1) + (i + 1) * (i + 1));
        }

        return list.get(n - 1);
    }

}
