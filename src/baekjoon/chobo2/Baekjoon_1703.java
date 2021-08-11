package baekjoon.chobo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_1703 {
    /*
        생장점

        나무의 모든 생장점 같은 숫자(splitting factor)의 가지로 나뉨
        생장점이 보존된 가지의 끝에만 나뭇잎이 달림

        각 해(level) 성장기의 splitting factor와 그 해 겨울에 쳐낸 가지의 수
        이용해서 나뭇잎 수 구하기

        처음 심는 것은 잎 하나

        입력
        나무의 나이 a (1 <= a <= 20)
        그 뒤로 2a개의 정수가 공백
        splitting factor와 가지치기 한 가지의 수 level 별
        마지막 줄 0 더 이상 입력 x 0 처리 x

        출력
        잎의수 한 줄 출력, 나뭇잎 수 signed 32-bit integer 초과 안함
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String line = br.readLine();
            if (line.equals("0"))
                 break;

            StringTokenizer token = new StringTokenizer(line);

            int a = Integer.parseInt(token.nextToken());

            int leaf = 1;

            for (int i = 0; i < a; i++) {
                int sf = Integer.parseInt(token.nextToken());
                int cut = Integer.parseInt(token.nextToken());
                leaf = leaf * sf - cut;
            }

            sb.append(leaf).append("\n");
        }

        System.out.println(sb);
    }
}
