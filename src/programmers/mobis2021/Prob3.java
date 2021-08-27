package programmers.mobis2021;

public class Prob3 {

    /*
        문제설명
        0 이상의 정수로 이루어진 길이가 n인 배열 a가 있습니다.
         당신은 이 배열에 다음과 같은 행동을 할 수 있습니다.

        a 배열에서 0보다 큰 특정 수를 하나 골라 1 감소시킵니다.
        당신은 a[0] & a[1] & ... & a[n-1] = 0 이 되도록 위의 행동을 0번 이상 반복하고자 합니다.
        (&는 Bitwise And 연산입니다.) 이때, 당신은 주어진 행동을 가능한 적게 반복하고 싶습니다.
        따라서, 당신은 배열 원소 간의 &(Bitwise And) 연산 결과가 0이 되도록 주어진 행동을 하는 횟수를 최소화하고,
        그때의 최소화된 횟수를 구하면 됩니다.

        정수로 이루어진 배열 m과 b가 매개변수로 주어집니다.
        b는 여러 개의 a 배열을 순서대로 이어 붙인 배열이며, m은 각 a 배열의 길이가 순서대로 담긴 배열입니다.
        각 a 배열에 대해 문제의 답을 구하여 배열에 차례대로 담아 return 하도록 solution 함수를 완성해주세요.

        예를 들어, m = [2,3,4], b = [1,2,3,4,5,6,7,8,9] 라면, 다음 3가지 배열에 대해서 문제의 답을 구해야 합니다.

        a = [1,2] (m[0] = 2 이므로, b의 첫 2개 원소가 a 배열을 이룹니다.)
        a = [3,4,5] (m[1] = 3 이므로, b의 그다음 3개 원소가 a 배열을 이룹니다.)
        a = [6,7,8,9] (m[2] = 4 이므로, b의 그다음 4개 원소가 a 배열을 이룹니다.)
        답이 항상 32-bit 정수 범위에 있는 것은 증명될 수 있습니다.
     */

    /*
        제한사항
        1 ≤ m의 길이 ≤ 200,000
        1 ≤ m의 모든 수 ≤ 200,000
        1 ≤ m의 모든 수의 합 = b의 길이 ≤ 200,000
        0 ≤ b의 모든 수 < 230
     */

    /*
        입출력 예
        m	    b	        result
        [2,2]	[3,2,1,2]	[2,0]
     */

    public static void main(String[] args) {
        int[] m;
        int[] b;
        int[] result;
        int[] answer;

        // ex1
        m = new int[]{2, 2};
        b = new int[]{3, 2, 1, 2};
        result = new int[]{2, 0};
        answer = solution(m, b);
        System.out.println(check(answer, result));

    }

    public static boolean check(int[] answer, int[] result) {

        for (int i = 0; i < answer.length; i++) {
            if (answer[i] != result[i])
                return false;
        }

        return true;
    }

    public static int[] solution(int[] m, int[] b) {
        int[] answer = {};
        return answer;
    }
}
