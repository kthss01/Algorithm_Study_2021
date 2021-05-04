package baekjoon.kingchobo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_21300 {
    /*
        Bottle Return

        litter - 쓰레기

        6개의 값을 받아서 그 값의 개수를 모두 구한 후
        5를 곱하여 반환
        각 값은 한줄에 스페이스로 구분 [0, 100]
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer token = new StringTokenizer(br.readLine());

        int cnt = 0;

        for (int i = 0; i < 6; i++) {
            cnt += Integer.parseInt(token.nextToken());
        }

        System.out.println(cnt * 5);
    }
}
