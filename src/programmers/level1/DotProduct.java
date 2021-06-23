package programmers.level1;

public class DotProduct {
    /*
        내적
        길이가 같은 두 1차원 정수 배열 a,b가 매개변수로 주어질 때
        a와 b의 내적을 return 하도록 solution 함수 완성

        a, b의 내적 : a[0]*b[0] + a[1]*b[1] + ... + a[n-1]*b[n-1]
        (n은 a, b의 길이)

        a, b의 길이는 1 이상 1,000 이하
        a, b의 모든 수는 -1,000 이상 1,000 이하
     */
    public static void main(String[] args) {
        int[] a, b;

        a = new int[]{1, 2, 3, 4};
        b = new int[]{-3, -1, 0, 2};
        System.out.println(solution(a, b));

        a = new int[]{-1, 0, 1};
        b = new int[]{1, 0, -1};
        System.out.println(solution(a, b));
    }

    public static int solution(int[] a, int[] b) {
        int answer = 0;

        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }

        return answer;
    }
}
