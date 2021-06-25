package baekjoon.chobo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_5679 {
    /*
        Hailstone Sequences - 우박수

        hn = hn-1/2 (if hn-1 is even)
        hn = 3 x hn-1 + 1 (if hn-1 is odd)

        ex)
        h0 = 5 -> 5,16,8,4,2,1
        h0 = 11 -> 11,34,17,52,26,13,40,20,10,5,16,8,4,2,1

        결국 1이 됨

        주어진 우박수에서 가장 큰 값 출력

        각 테스트케이스 한 줄
        H starting value (1 <= H <= 500)

        0 입력이면 종료
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int h = Integer.parseInt(br.readLine());

            if (h == 0)
                break;

            int l = h;

            while (h != 1) {
                if (h % 2 == 0) {
                    h = h / 2;
                } else {
                    h = h * 3 + 1;
                }
                l = Math.max(h, l);
            }

            System.out.println(l);
        }
    }
}
