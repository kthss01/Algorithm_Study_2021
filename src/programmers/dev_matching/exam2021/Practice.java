package programmers.dev_matching.exam2021;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Practice {
    /*
        연습 문제
        직사각형 4개의 점 중 3개의 좌표 주어질 때
        나머지 한 점의 좌표 구하기

        제한 사항
            v 세 점의 좌표 들어있는 2차원 배열
            v의 각 원소는 점의 좌표, 좌표 [x축 좌표, y축 좌표]
            좌표값 1 ~ 10억 자연수
            {x축 좌표, y축 좌표}로 남아 return
     */

    public static void main(String[] args) {
        int[][] v = {{1, 4}, {3, 4}, {3, 10}};

        int[] answer = new Solution().solution(v);

        for (int ans : answer) {
            System.out.print(ans + " ");
        }
        System.out.println();
    }

    static class Solution {
        public int[] solution(int[][] v) {
            int[] answer = new int[2];

            answer[0] = v[0][0] == v[1][0] ? v[2][0] :
                            v[1][0] == v[2][0] ? v[0][0] : v[1][0];
            answer[1] = v[0][1] == v[1][1] ? v[2][1] :
                    v[1][1] == v[2][1] ? v[0][1] : v[1][1];

            return answer;
        }
    }
}
