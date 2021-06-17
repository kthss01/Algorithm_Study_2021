package baekjoon.chobo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Baekjoon_2548 {
    /*
        대표 자연수

        대표 자연수는 주어진 모든 자연수들에 대하여 그 차이를 계산하여
        그 차이들 전체의 합을 최소로 하는 자연수

        대표 자연수 구하기

        자연수의 개수 N (1 <= N <= 20000)
        N개의 자연수 빈칸 구분 입력, 1 이상 10000 이하

        대표 자연수가 두 개 이상일 경우 그 중 제일 작은 것 출력

        -> 풀이 봄
        정렬해서 중간값을 꺼내면 된다고함함
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        StringTokenizer token = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr.add(Integer.parseInt(token.nextToken()));
        }

        Collections.sort(arr);

        if (arr.size() % 2 == 0) {
            System.out.println(arr.get(arr.size() / 2 - 1));
        } else {
            System.out.println(arr.get(arr.size() / 2));
        }
    }
}
