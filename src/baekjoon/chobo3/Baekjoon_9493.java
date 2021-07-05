package baekjoon.chobo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_9493 {
    /*
        길면 기차, 기차는 빨라, 빠른 것은 비행기

        거리 M(km)이 주어졌을 때 기차의 속도 A(km/h)와 비행기의 속도 B(km/h)로
        달렸을 때 발생하는 시간의 차를 계산

        입력
        한 줄에 테스트 케이스 하나씩
        각 테스트 케이스 세 개의 정수 M (1 <= M <= 10,000) A, B (1 <= A <= B <= 1000)
        마지막 테스트 케이스 0 세 개로 나타내며 따로 처리 않고 종료

        각 테스트 케이스마다 다음 형식으로 시간을 출력
        H:MM:SS
        분(MM) 초(SS) 모두 2자리로 표현
        초(Second)는 반올림 시(Hour) 최소 자리
        출력에 공백 x 테스트 케이스 사이에 빈 줄 출력 x
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer token = new StringTokenizer(br.readLine());

            int m = Integer.parseInt(token.nextToken());
            int a = Integer.parseInt(token.nextToken());
            int b = Integer.parseInt(token.nextToken());

            if (m == 0 && a == 0 && b == 0)
                break;

            double t1 = (double) m * 3600 / a;
            double t2 = (double) m * 3600 / b;

            int dt = (int) Math.round(t1 - t2);
            int hh = dt / 3600;
            int mm = (dt / 60) % 60;
            int ss = dt % 60;
            System.out.printf("%d:%02d:%02d\n", hh, mm, ss);
        }
    }
}
