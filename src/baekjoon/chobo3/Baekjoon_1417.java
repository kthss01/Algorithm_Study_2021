package baekjoon.chobo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Baekjoon_1417 {
    /*
        국회의원 선거

        투표를 하고자 할 때
        1번이 이기기 위해서 다른 기호를 찍은 사람을 매수하려는 경우
        해당 사람들의 최소값을 출력하기

        ex)
        1 - 5
        2 - 7
        3 - 7
        일때
        2번 1명
        3번 1명 가져오면
        7 - 6 - 6으로 이기게됨

        입력
        후보 수 N
        N개 빈칸으로 구분하여 입력
        N 1,000보다 작거나 같은 자연수, 득표수 1,000보다 작거나 같은 자연수

        문제 풀이 확인
        처음엔 전체 평균으로 해서 처리하려고 했는데
        이렇게하면 평균에 함정에 빠질 수 있어서 문제가 되는거 같음
        누가 한 사람 평균보다 엄청 클 수 있어 이 처리로는 해결이안됨
        -> 완전 탐색을 사용해야한다고 함
        -> 우선순위 큐 쓰는것도 좋은거 같음

        우선순위 큐로 한번 풀어보자
        우선순위에 1번 후보보다 작은 값들을 넣어주고
        하나씩 빼서 비교한 후에 -1 해주고 넣는 식으로 하면 되는 거 같다.
        힙으로 구현되어있는데 min 힙이 기본임
        max힙으로 쓰려면 Colletions.reverseOrder() 매개변수로 넣어주면 됨
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int num = 0;

        // 우선순위 높은 숫자 순 Max 힙
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            if (i == 0)
                num = Integer.parseInt(br.readLine());
            else {
                int temp = Integer.parseInt(br.readLine());
                if (num <= temp) {
                    pq.add(temp);
                }
            }
        }

        int count = 0;

        while (!pq.isEmpty()) {
            int temp = pq.poll();

            if (temp >= num) {
                num++;
                pq.add(temp - 1);
                count++;
            }
        }

        System.out.println(count);
    }
}
