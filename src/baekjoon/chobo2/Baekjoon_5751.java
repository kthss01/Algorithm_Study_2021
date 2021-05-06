package baekjoon.chobo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_5751 {
    /*
        Head or Tail

        confide - (비밀을) 털어놓다

        0 1 로 h t 값을 받았을 때
        갯수 세서 출력하기

        N (1 <= N <= 10000) the number of games played
        R (Ri = 0 Mary Won, Ri = 1 John Won)

        N = 0 end

        출력
        Mary won X times and John won Y times (X >= 0, Y >= 0)
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while (true) {
            int n = Integer.parseInt(br.readLine());
            
            if (n == 0) break;

            StringTokenizer token = new StringTokenizer(br.readLine());
            int mary = 0;
            int john = 0;

            for (int i = 0; i < n; i++) {
                if (Integer.parseInt(token.nextToken()) == 0)
                    mary++;
                else
                    john++;
            }

            System.out.printf("Mary won %d times and John won %d times\n", mary, john);
        }
    }
}
