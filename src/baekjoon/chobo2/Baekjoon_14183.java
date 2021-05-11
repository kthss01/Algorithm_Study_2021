package baekjoon.chobo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_14183 {
    /*
        Key Maker

        가지고 있는 키가 고객의 키로 만들 수 있는지 확인하기
        고객의 키 depth보다 작으면 고객의 키로 만들 수 있음

        m n (1 <= m <= 10 m cuts , 1 <= n <= 100 비교할 key)

        0 0 입력시 종료
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer token = new StringTokenizer(br.readLine());

            int m = Integer.parseInt(token.nextToken());
            int n = Integer.parseInt(token.nextToken());

            if (m == 0 && n == 0) {
                break;
            }

            token = new StringTokenizer(br.readLine());
            int[] customerKey = new int[m];

            for (int i = 0; i < m; i++) {
                customerKey[i] = Integer.parseInt(token.nextToken());
            }

            int count = 0;

            for (int i = 0; i < n; i++) {
                token = new StringTokenizer(br.readLine());

                boolean isUseful = true;
                for (int j = 0; j < m; j++) {
                    int key = Integer.parseInt(token.nextToken());
                    if (customerKey[j] < key) {
                        isUseful = false;
                        break;
                    }
                }
                if (isUseful) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
