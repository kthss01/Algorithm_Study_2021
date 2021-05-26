package baekjoon.chobo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_16727 {
    /*
        ICPC

        매치 2번을 해서 종합 점수로 승자를 정함
        동률일 경우 어웨이에서 더 많이 넣은 팀이 승리
        그것도 동점이면 패널티샷

        prestigious 명망 있는[높은], 일류의
        eagerly 열망하여,열심히, 간절히
        aggregate 합계, 총액, 종합한

        입력
        p1 s1
        s2 p2
        공백 구분 입력 모든 값 0 ~ 20 정수

        p1 승리시 Persepolis
        s1 승리시 Esteghlal

        점수 총합과 동점시 어웨이 득점으로 결정

        그래도 동점이면 Penalty
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer token = new StringTokenizer(br.readLine());

        int p1 = Integer.parseInt(token.nextToken());
        int s1 = Integer.parseInt(token.nextToken());

        token = new StringTokenizer(br.readLine());
        int s2 = Integer.parseInt(token.nextToken());
        int p2 = Integer.parseInt(token.nextToken());

        String winP = "Persepolis";
        String winS = "Esteghlal";
        String penalty = "Penalty";

        System.out.println(p1 + p2 > s1 + s2 ? winP
                : p1 + p2 < s1 + s2 ? winS
                : s1 > p2 ? winS
                : s1 == p2 ? penalty
                : winP);
    }
}
