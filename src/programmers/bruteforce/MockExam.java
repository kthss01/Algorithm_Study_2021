package programmers.bruteforce;

import java.util.ArrayList;

public class MockExam {
    /*
        모의고사

        수포자 문제 찍는 방식
        1번 : 1,2,3,4,5, 1,2,3,4,5, ...
        2번 : 2,1,2,3,2,4,2,5, 2,1,2,3,2,4,2,5
        3번 : 3,3,1,1,2,2,4,4,5,5, 3,3,1,1,2,2,4,4,5,5

        1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때
        가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return하는 함수

        제한 조건
        시험 최대 10,000문제
        문제의 정답 1,2,3,4,5 중 하나
        가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값 오름차순 정렬
     */
    public static void main(String[] args) {
        int[] answers = {1, 2, 3, 4, 5};

        int[] result = solution(answers);
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        for (int num : result) {
            sb.append(num).append(" ");
        }
        sb.append("]\n");
        System.out.println(sb);

        System.out.println();

        answers = new int[]{1, 3, 2, 4, 2};

        result = solution(answers);
        sb = new StringBuilder();
        sb.append("[ ");
        for (int num : result) {
            sb.append(num).append(" ");
        }
        sb.append("]\n");
        System.out.println(sb);
    }

    private static int[] solution(int[] answers) {
        int[] answer = {};

        int[] n1 = {1, 2, 3, 4, 5};
        int[] n2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] n3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int a1 = 0;
        int a2 = 0;
        int a3 = 0;

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == n1[i % n1.length]) a1++;
            if (answers[i] == n2[i % n2.length]) a2++;
            if (answers[i] == n3[i % n3.length]) a3++;
        }

        int win = Math.max(a1, Math.max(a2, a3));

        ArrayList<Integer> winner = new ArrayList<>();
        if (win == a1) winner.add(1);
        if (win == a2) winner.add(2);
        if (win == a3) winner.add(3);

        answer = new int[winner.size()];
        for (int i = 0; i < winner.size(); i++) {
            answer[i] = winner.get(i);
        }
        // 더 깔끔한 방법 근데 느리다고함
//        answer = winner.stream().mapToInt(i -> i).toArray();

        return answer;
    }
}
