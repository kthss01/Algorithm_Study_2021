package baekjoon.chobo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Baekjoon_3985 {
    /*
        롤 케이크

        길이 L미터의 롤 케이크
        1미터 단위로 잘라 놓음
        가장 왼쪽 조각이 1번, 오른쪽 조각이 L번 조각
        1번부터 N번까지 번호가 매겨져 있음
        종이에 자신이 원하는 조각을 적어서 낸다.
        이 때, 두 수 P, K를 적어서 내며
        P번 조각부터 K번 조각을 원한다는 뜻

        1번의 종이부터 순서대로 펼쳐서 해당하는 조각에 그 사람의 번호를 적을 것
        이 때, 이미 번호가 적혀있는 조각은 번호를 적지 못하고 넘어간다.
        이런 방식을 이용해서 조각을 주다보니,
        자신이 원래 원했던 조각을 받지 못하는 경우가 생길 수 있다.

        가장 많은 케이크 조각을 받을 것으로 기대하는 번호와
        실제로 가장 많은 케이크 조각을 받은 번호 구하기

        입력
        첫째 줄 롤 케이크의 길이 L (1 <= L <= 1000)
        둘째 줄 방청객의 수 N (1 <= N <= 1000)
        다음 N개 줄 각 i가 종이에 적어낸 수 Pi, Ki, (1 <= Pi <= Ki, <= L, i = 1 ... N)

        출력
        첫째 줄 가장 많은 조각을 받을 것으로 기대하고 있던 번호 출력
        둘째 줄 실제로 가장 많은 조각을 받은 번호 출력
        가장 많은 조각을 받도록 예상되는 번호가 여러 개인 경우 번호가 가장 작은 사람을 출력
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int l = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int[] check = new int[l + 1];
        int[] cakes = new int[n + 1];

        int[][] arr = new int[n + 1][2];

        int maxIndex = 0;
        int maxCakeLength = 0;

        for (int i = 1; i <= n; i++) {
            StringTokenizer token = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(token.nextToken());
            arr[i][1] = Integer.parseInt(token.nextToken());

            if(maxCakeLength < arr[i][1] - arr[i][0] + 1) {
                maxCakeLength = arr[i][1] - arr[i][0] + 1;
                maxIndex = i;
            }

            for (int j = arr[i][0]; j <= arr[i][1]; j++) {
                if (check[j] == 0)
                    check[j] = i;
            }
        }

        for (int i = 0; i <= l; i++) {
            cakes[check[i]]++;
        }

        int realMaxIndex = 0;
        int realMaxCakeLength = 0;
        for (int i = 1; i <= n; i++) {
            if(cakes[i] > realMaxCakeLength) {
                realMaxCakeLength = cakes[i];
                realMaxIndex = i;
            }
        }

        System.out.println(maxIndex);
        System.out.println(realMaxIndex);
    }
}
