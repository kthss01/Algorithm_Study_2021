package baekjoon.chobo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_14542 {
    /*
        Outer Triangle Sum

        숫자들이 삼각형 형태로 주어질때
        외각의 합 (삼각형 모형) 구하기

        ex)
        5
        1 8
        9 6 1
        2 7 2 6
        3 5 7 8 9
        sum = 5 + 1 + 9 + 2 + 3 + 5 + 7 + 8 + 9 + 6 + 1 + 8 = 64

        입력
        n (n <= 10)
        숫자들 공백 구분
        n 0 종료

        출력
        Case #:64 이런 형태
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        int caseNum = 1;
        while (true) {
            int n = Integer.parseInt(br.readLine());

            if (n == 0)
                break;

            int sum = 0;
            for (int i = 0; i < n; i++) {
                String[] arr = br.readLine().split(" ");
                if (i == 0) {
                    sum += Integer.parseInt(arr[0]);
                } else if (i == n - 1) {
                    for (String ele : arr) {
                        sum += Integer.parseInt(ele);
                    }
                } else {
                    int n1 = Integer.parseInt(arr[0]);
                    int n2 = Integer.parseInt(arr[arr.length - 1]);
                    sum += n1 + n2;
                }
            }
            sb.append("Case #").append(caseNum++).append(":").append(sum).append("\n");
        }

        System.out.println(sb);
    }
}
