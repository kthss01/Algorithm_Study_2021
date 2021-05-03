package baekjoon.kingchobo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_6749 {
    /*
        Next int line

        3 형제가 있는데
        각 형제간의 나이차가 무조건 같음

        막내와 둘째를 알려줄 때 첫째의 나이는?

        두개의 정수 입력 (라인별 분리)
        첫 줄 Y (youngest child (0 <= Y <= 50)
        2 줄 M (middle child (Y <= M <= 50)
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int youngest = Integer.parseInt(br.readLine());
        int middle = Integer.parseInt(br.readLine());

        int oldest = middle + (middle - youngest);
        System.out.println(oldest);
    }
}
