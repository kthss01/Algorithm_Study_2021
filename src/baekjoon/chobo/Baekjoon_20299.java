package baekjoon.chobo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_20299 {
    /*
        3대 측정

        웨이트 트레이닝에서의 3대 측정으 스쿼트, 벤치프레스, 데드리프트의 중량 측정

        코드포스 레이팅의 합이 K 미만인 팀은 가입할 수 없는 VIP 클럽 만들고자함

        모든 팀원의 레이팅이 L 이상
        팀원 세 명의 레이팅의 합이 K 이상인 팀만이 가입

        가입할 수 이쓴 팀의 수를 구하고
        회원들의 레이팅 출력 하기

        입력
        N K L
        N 팀의 수 (1 <= N <= 500000)
        K 팀원 3명의 레이팅 합에 대한 클럽 가입 조건 (0 <= K <= 12000)
        L 개인 레이팅에 대한 클럽 가입 조건 (0 <= L <= 4000)

        출력
        VIP 클럽에 가입이 가능한 팀의 수 출력
        VIP 회원들의 레이팅을 입력받은 순서대로 공백으로 구분해 하나씩 출력
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer token = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(token.nextToken());
        int k = Integer.parseInt(token.nextToken());
        int l = Integer.parseInt(token.nextToken());

        int cnt = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            token = new StringTokenizer(br.readLine());

            int t1 = Integer.parseInt(token.nextToken());
            if (t1 < l) continue;
            int t2 = Integer.parseInt(token.nextToken());
            if (t2 < l) continue;
            int t3 = Integer.parseInt(token.nextToken());
            if (t3 < l) continue;

            if (t1 + t2 + t3 < k) continue;

            cnt++;
            sb.append(t1).append(" ").append(t2).append(" ").append(t3);
            if (i != n - 1)
                sb.append(" ");
//            else
//                sb.append("\n");
        }

        System.out.println(cnt);
        System.out.println(sb);
    }
}
