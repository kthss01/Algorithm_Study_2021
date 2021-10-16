package programmers.dev_matching.exam2021;

import java.util.HashSet;
import java.util.Set;

public class Prob01 {
    /*
        정규표현식 문제 -> 아닌듯
        신규 아이디 추천 문제

        new_id registered_list에 포함되어있지 않으면 new_id 추천 후 종료
        포함되어있으면
            new_id S N으로 분리
            N -> 10진수 숫자로 변환 n null이면 0
            n + 1 문자열로 변환 N1
            S+N1으로 변경 후 다시 체크
        -> 시간 초과 남
        -> set으로 해결
     */
    public static void main(String[] args) {
        String[] registered_list = { "card", "ace13", "ace16", "banker", "ace17", "ace14" };
        String new_id = "ace15";
        String answer = new Solution().solution(registered_list, new_id);
        System.out.println(answer);

        registered_list = new String[]{ "cow", "cow1", "cow2", "cow3", "cow4", "cow9", "cow8", "cow7", "cow6", "cow5" };
        new_id = "cow";
        answer = new Solution().solution(registered_list, new_id);
        System.out.println(answer);

        registered_list = new String[]{ "bird99", "bird98", "bird101", "gotoxy" };
        new_id = "bird98";
        answer = new Solution().solution(registered_list, new_id);
        System.out.println(answer);
    }

    static class Solution {
        public boolean checkSameId(String[] list, String id) {
            for (String str : list) {
                if (str.equals(id)) {
                    return true;
                }
            }
            return false;
        }

        public String changeId(String id) {
            String s = "";
            String n = "";
            for (int i = 0; i < id.length(); i++) {
                // 숫자 찾기
                if (id.charAt(i) >= '0' && id.charAt(i) <= '9') {
                    s = id.substring(0, i);
                    n = String.valueOf(Integer.parseInt(id.substring(i)) + 1);
                    break;
                }
            }

            if (s.equals("")) {
                s = id;
                n = "1";
            }

            return s + n;
        }

        public String solution(String[] registered_list, String new_id) {
            String answer = "";

            String id = new_id;

            Set<String> set = new HashSet<>();
            for (String str : registered_list) {
                set.add(str);
            }

            while (true) {
//                if (!checkSameId(registered_list, id)) {
                if (!set.contains(id)) {
                    answer= id;
                    break;
                } else {
                    id = changeId(id);
                }
            }

            return answer;
        }
    }
}


