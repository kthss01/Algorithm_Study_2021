package baekjoon.chobo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_10810 {
    /*
        공 넣기

        바구니 N개가 있고 각각의 바구니에는 1 ~ N번까지 번호가 매겨져 있음
        또 1번부터 N번까지 번호가 적혀있는 공을 매우 많이 가지고 있음
        가장 처음 바구니에는 공이 들어있지 않으며 바구니에는 공을 1개만 넣을 수 있음

        앞으로 M번 공을 넣으려고 함
        한 번 공을 넣을 때, 공을 넣을 바구니 범위를 정하고,
        정한 바구니에 모두 같은 번호가 적혀있는 공을 넣음
        만약, 바구니에 공이 이미 있는 경우에는 들어있는 공을 빼고
        새로 공을 넣음
        공을 넣을 바구니는 연속되어 있어야 함

        공을 어떻게 넣을지가 주어졌을 때, M번 공을 넣은 이후에
        각 바구니에 어떤 공이 들어있는지 구하기

        입력
        N (1 <= N <= 100) M (1 <= M <= 100)
        M개 줄 공을 넣는 방법
        i j k i번 바구니부터 j번 바구니까지 k번 번호 공 넣음
        ex)
            2 5  2번 바구니부터 5번 바구니까지 6번 공 넣음
            (1 <= i <= j <= N, 1 <= k <= N)
        입력으로 주어진 순서대로 공을 넣음

        출력
        1번 바구니부터 N번 바구니에 들어있는 공의 번호를 공백 구분 출력
        공이 들어있지 않은 바구니는 0 출력
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(token.nextToken());
        int m = Integer.parseInt(token.nextToken());

        int[] arr = new int[n + 1];

        for (int c = 0; c < m; c++) {
            token = new StringTokenizer(br.readLine());

            int i = Integer.parseInt(token.nextToken());
            int j = Integer.parseInt(token.nextToken());
            int k = Integer.parseInt(token.nextToken());

            for (int l = i; l <= j; l++) {
                arr[l] = k;
            }
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
