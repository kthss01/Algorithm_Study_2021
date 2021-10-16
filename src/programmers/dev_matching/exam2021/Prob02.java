package programmers.dev_matching.exam2021;

import java.util.ArrayList;
import java.util.Collections;

public class Prob02 {
    /*
        휴가일수 계산
        주말 공휴일 연차 주어질 때
        가장 휴가를 길게 떠날 수 있는 기간 구하기
        DP 문제일 수도
     */
    public static void main(String[] args) {
        int leave = 4;
        String day = "FRI";
        int[] holidays = { 6, 21, 23, 27, 28 };

        /*
            2 3 6 9 10 16 17 21 23 24 27 28 29 30
         */

        int answer = new Solution().solution(leave, day, holidays);
        System.out.println(answer);

        leave = 30;
        day = "MON";
        holidays = new int[] {1, 2, 3, 4, 28, 29, 30};
        answer = new Solution().solution(leave, day, holidays);
        System.out.println(answer);
    }

    static class Solution {
        public int solution(int leave, String day, int[] holidays) {
            int answer = -1;

            ArrayList<Integer> list = findRestDay(day, holidays);

            Collections.sort(list);

            for (int i = 0; i < list.size(); i++) {
                int left = leave;
                int start = list.get(i);
                int j = i + 1;
                int cnt = 1;
                while (left >= 0 && j < list.size()) {
                    if (list.get(j) == start + cnt) {
                        j++;
                    } else {
                        left--;
                    }
                    cnt++;
                }
                answer = Math.max(answer, cnt);
            }

            answer = Math.min(30, answer);

            return answer;
        }

        private ArrayList<Integer> findRestDay(String day, int[] holidays) {
            ArrayList<Integer> list = new ArrayList<>();

            int sat = 0;
            int sun = 0;
            switch (day) {
                case "MON":
                    sat = 6;
                    sun = 7;
                    break;
                case "TUE":
                    sat = 5;
                    sun = 6;
                    break;
                case "WED":
                    sat = 4;
                    sun = 5;
                    break;
                case "THU":
                    sat = 3;
                    sun = 4;
                    break;
                case "FRI":
                    sat = 2;
                    sun = 3;
                    break;
                case "SAT":
                    sat = 1;
                    sun = 2;
                    break;
                case "SUN":
                    sat = 7;
                    sun = 1;
                    break;
            }

            for (int i = sat; i <= 30; i++) {
                if ((i - sat) % 7 == 0 || (i - sun) % 7 == 0) {
                    list.add(i);
                }
            }

            for (int h : holidays) {
                for (int d : list) {
                    if (h != d) {
                        list.add(h);
                        break;
                    }
                }
            }

            return list;
        }
    }
}