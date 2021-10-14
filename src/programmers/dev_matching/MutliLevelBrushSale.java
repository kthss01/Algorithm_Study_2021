package programmers.dev_matching;

public class MutliLevelBrushSale {
    /*
        다단계 칫솔 판매

        다단계 이익 분배 규칙
        모든 판매원 칫솔의 판매에 의하여 발생하는 이익에서
        10%를 계산하여 자신을 조직에 참여시킨 추천인에게 분배
        나머지는 자신이 가짐
        자신에게 발생하는 이익 또한 마찬가지의 규칙으로 자신의 추천인에게 분배
        단, 10% 계산시 원 단위에서 절사
        10%를 계산한 금액이 1원 미만인 경우 이득을 분배하지 않고 자신이 모두 가짐

        enroll 각 판매원의 이름 배열
        referral 각 판매원을 다단계 조직에 참여시킨 다른 판매원의 이름 ㅂ열
        seller 판매량 집계 데이터의 판매원 이름
        amount 판매량 집계 데이터의 판매 수량
        이 때 각 판매원이 득한 이익금을 나열한 배열 return
        판매원에게 배분된 이익금의 총합 계산하여(정수형으로),
        입력으로 주어진 enroll에 이름이 포함된 순서에 따라 나열

        제한사항
            enroll 길이 1 ~ 10,000
                enroll 민호 x 민호 제외 조직 구성원의 총 수
            referral 길이 enroll 길이와 같음
                referral 내에서 i번째 이름은
                배열 enroll 내에서 i번째에 있는 판매원을 조직에 참여시킨 이름
                어느 누구의 추천도 없이 조직에 참여한 사람에 대해서
                - 기입
                enroll 에 등장하는 이름은 조직에 참여한 순서에 다름
                즉, 어느 판매원의 이름이 enroll의 i 번째 등장한다면,
                이 판매원을 조직에 참여시킨 사람의 이름,
                즉 referral의 i번째 원소는 이미 배열 enroll의 j번째 (j < i) 등장 보장
            seller 1 ~ 100,000
                seller 내의 i번째 이름은 i번째 판매 집계 데이터가
                어느 판매원에 의한 것인지를 나타냄
                seller에는 같은 이름이 중복해서 들어잇을 수 있음
            amount 길이 seller 길이와 같음
                amount 내의 i번째에 있는 수는 i번째 판매 집계 데이터의 판매량을 나타냄
                판매량의 범위 1 ~ 100
            칫솔 한 개를 판매하여 얻어지는 이익은 100원 정해짐
            모든 조직 구성원들의 이름 10 글자 이내 영문 알파벳 소문자들로만 이루어짐짐
     */

    public static void main(String[] args) {
        String[] enroll = { "john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young" };
        String[] referral = { "-", "-", "mary", "edward", "mary", "mary", "jaimie", "edward" };
        String[] seller = { "young", "john", "tod", "emily", "mary" };
        int[] amount = { 12, 4, 2, 5, 10 };

        int[] answer = new Solution().solution(enroll, referral, seller, amount);

        for (int ans : answer) {
            System.out.print(ans + " ");
        }
        System.out.println();
    }

    static class Solution {
        public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
            int[] answer = {};
            return answer;
        }
    }
}

