package baekjoon.chobo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_1673 {
    /*
        치킨 쿠폰

        치킨 한 마리를 주문할 수 있는 치킨 쿠폰 n장
        이 치킨집에서는 치킨을 한 마리 주무할 때마다 도장을 하나씩 찍어주는데
        도장을 k개 모으면 치킨 쿠폰 한 장으로 교환할 수 있음
        지금 갖고 있는 치킨 쿠폰으로 치킨을 최대 몇마리나 먹을 수 있는지 구하기
        단, 치킨을 주문하기 위해서는 반드시 치킨 쿠폰을 갖고 있어야 한다.
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String line = br.readLine();
            if (line == null)
                break;

            StringTokenizer token = new StringTokenizer(line);

            int n = Integer.parseInt(token.nextToken());
            int k = Integer.parseInt(token.nextToken());

            int ans = n;

            while (n / k != 0) {
                ans += n / k;
                n = n / k + n % k;
            }

            System.out.println(ans);
        }
    }

}
