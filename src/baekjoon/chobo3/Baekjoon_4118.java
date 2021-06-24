package baekjoon.chobo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_4118 {
    /*
        Fred's Lotto Tickets

        로또 번호를 살 때 1 ~ 49 모두가 포함되게 사는지 확인하기
        Cover all the bases

        N (1 <= N <= 100) test cases
        N개 6자리 공백 구분 입력
        중복되는 숫자 티켓 없음
        그러나 숫자는 어떤 순서로든 나올 수 있음
        0 입력으로 종료
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int n = Integer.parseInt(br.readLine());

            if (n == 0)
                break;

            boolean[] lotto = new boolean[49];

            for (int i = 0; i < n; i++) {
                StringTokenizer token = new StringTokenizer(br.readLine());
                while(token.hasMoreTokens()) {
                    lotto[Integer.parseInt(token.nextToken()) - 1] = true;
                }
            }

            // check
            boolean isCoverAllTheBase = true;
            for (boolean isLottoPick : lotto) {
                if (!isLottoPick) {
                    isCoverAllTheBase = false;
                    break;
                }
            }
            System.out.println(isCoverAllTheBase ? "Yes" : "No");
        }
    }
}
