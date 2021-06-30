package programmers.level1;

public class SignsAdd {
    /*
        음양 더하기

        정수들의 절대값을 차례대로 담은 정수 배열 absolutes
        정수들의 부호를 차례대로 담은 boolean 배열 signs
        매개변수로 주어질 때 실제 정수들의 합을 구하여 return 하는 solution 함수 완성

        제한 사항
        absolutes의 길이는 1 이상 1,000 이하
            absolutes의 모든 수는 각각 1 이상 1,000 이하
        signs의 길이는 absolutes의 길이와 같음
            signs[i]가 참이면 absolutes[i]의 실제 정수가 양수, 아니면 음수
     */

    public static void main(String[] args) {
        int[] absolutes;
        boolean[] signs;

        absolutes = new int[]{4, 7, 12};
        signs = new boolean[]{true, false, true};
        System.out.println(solution(absolutes, signs)); // result : 9

        absolutes = new int[]{1, 2, 3};
        signs = new boolean[]{false, false, true};
        System.out.println(solution(absolutes, signs)); // result : 0
    }

    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < absolutes.length; i++) {
            answer += signs[i] ? absolutes[i] : -absolutes[i];
        }

        return answer;
    }
}
