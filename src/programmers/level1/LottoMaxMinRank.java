package programmers.level1;

public class LottoMaxMinRank {
    /*
        로또의 최고 순위와 최저 순위

        로또 6/45는 1부터 45까지의 숫자 중 6개를 찍어서 맞히는 복권
        로또의 순위 규칙
        순위      당첨내용
        1       6개 번호 모두 일치
        2       5개 번호가 일치
        3       4개 번호가 일치
        4       3개 번호가 일치
        5       2개 번호가 일치
        6(낙첨)   그 외

        일부 번호를 알아볼 수 없게 되었을 때
        로또로 당첨이 가능했던 최고 순위와 최저 순위 알아보기
        알아볼 수 없는 번호 0으로 표기

        순서와 상관없이, 구매한 로또에 당첨 번호가 일치하는 번호가 있으면 맞힌걸로 인정

        로또 번호를 담은 배열 lottos
        당첨 번호를 담은 배열 win_nums가 매개변수로 주어질 때
        당첨 가능한 최고 순위와 최저 순위 차례대로 배열에 담아서
        return 하도록 solution 함수 구현

        제한사항
        lottos는 길이 6인 정수 배열
        lottos의 모든 원소는 0 이상 45 이하인 정수
            0은 알아볼 수 없는 숫자 의미
            0을 제외한 다른 숫자들은 lottos에 2개 이상 담겨있지 않음
            lottos의 원소들은 정렬되어 있지 않을 수도 있음
        win_nums은 길이 6인 정수 배열
        win_nums의 모든 원소는 1 이상 45 이하인 정수
            win_nums에는 같은 숫자가 2개 이상 담겨있지 않음
            win_nums의 원소들은 정렬되어 있지 않을 수 있음
     */

    public static void main(String[] args) {
        int[] lottos, win_nums, result;

        lottos = new int[]{44, 1, 0, 0, 31, 25};
        win_nums = new int[]{31, 10, 45, 1, 6, 19};
        result = solution(lottos, win_nums);
        System.out.println(result[0] + " " + result[1]); // 3, 5

        lottos = new int[]{0, 0, 0, 0, 0, 0};
        win_nums = new int[]{38, 19, 20, 40, 15, 25};
        result = solution(lottos, win_nums);
        System.out.println(result[0] + " " + result[1]); // 1, 6

        lottos = new int[]{45, 4, 35, 20, 3, 9};
        win_nums = new int[]{20, 9, 3, 45, 4, 35};
        result = solution(lottos, win_nums);
        System.out.println(result[0] + " " + result[1]); // 1, 1
    }

    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {};

        int[] lottoNum = new int[46]; // 로또 번호 배열 0도 포함
        int[] rank = {6, 6, 5, 4, 3, 2, 1}; // 일치 개수에 따른 순위

        for (int lotto : lottos) {
            lottoNum[lotto]++;
        }

        int zeroCnt = lottoNum[0];
        int sameCnt = 0;

        for (int num : win_nums) {
            if (lottoNum[num] != 0) { // 뽑은 번호가 있으면 같은 번호
                sameCnt++;
            }
        }

        answer = new int[] {rank[sameCnt + zeroCnt], rank[sameCnt]};
        // 최고 최저 순위 배열에 담기

        return answer;
    }
}
