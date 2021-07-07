package baekjoon.chobo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_10708 {
    /*
        크리스마스 파티

        게임 규칙
        1. 사람 중 타겟을 정함
        2. 타겟이 누구인지 이름 작성
        3. 타겟 이름 발표
            예상 맞추면 1점 타겟은 자신의 이름을 적어서 반드시 1점
            빗나가면 자신은 점수 x 타겟은 빗나간 수만큼 점수

        M번 게임했을때 각 사람들의 합계 점수 구하기

        입력
        총 3 + M 줄
        친구들의 수 N (3 <= N <= 100)
        게임 횟수 M (3 <= M <= 100)
        공백 구분 게임의 타겟 사람
            타겟은 자신의 이름을 종이에 쓰도록 되있어서 반드시 자기를 쓰게되
        출력
        M번의 게임에서 각각이 얻은 합계 점수 출력
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        StringTokenizer token = new StringTokenizer(br.readLine());
        int[] targets = new int[m];
        for (int i = 0; i < m; i++) {
            targets[i] = Integer.parseInt(token.nextToken());
        }
        
        int[] users = new int[n];

        for (int i = 0; i < m; i++) {
            token = new StringTokenizer(br.readLine());
            int target = targets[i];

            for (int j = 0; j < n; j++) {
                int num = Integer.parseInt(token.nextToken());
                if (target == num) {
                    users[j]++;
                } else {
                    users[target - 1]++;
                }
            }
        }

        for (int user : users) {
            System.out.println(user);
        }
    }
}
