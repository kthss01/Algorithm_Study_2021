package baekjoon.chobo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_2765 {
    /*
        자전거 속도

        자전거 속도계 앞 포크에 설치된 홀 효과 센서로 동작
        홀 효과를 이용해 속도계가 바퀴의 회전수를 측정
        바퀴의 지름을 안다면 회전수를 통해 이동거리를 측정할 수 있음
        또한 바퀴가 회전하는 동안 걸린 시간을 안다면 평균 속도 역시 알 수 있음

        바퀴의 지름, 회전수, 걸린 시간이 주어졌을 때,
        총 이동 거리와 평균 속도를 계산하기
        앞바퀴는 땅에서 떨어지거나 미끄러지거나 공전하지 않았다고 가정

        이동 거리의 단위는 miles이고 평균 속도의 단위는 miles/hour

        입력
        지름, 회전수, 시간이 공백으로 구분되어 주어짐
        지름 inch단위 실수
        회전수 정수
        시간 초단위의 실수
        입력은 회전수가 0이면 끝남
        실수는 소수점 셋째자리 이하까지 주어진다

        출력
        Trip #N: distance MPH 형태로 출력
        N 각각의 데이터 번호 출력
        distance 총 거리(Miles)를 소수 둘째 자리까지 반올림하여 나타내며
        MPH 평균 속도(miles per hour) 소수 둘째 자리까지 반올림하여 나타냄
        회전수가 0인 데이터에 대해서는 출력하지 않음
     */

    public static final double PI = 3.1415927;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = 1;
        while (true) {
            StringTokenizer token = new StringTokenizer(br.readLine());

            double d = Double.parseDouble(token.nextToken());
            int r = Integer.parseInt(token.nextToken());
            double s = Double.parseDouble(token.nextToken());

            if (r == 0)
                break;

            double distance = d * PI * r / (12 * 5280); // 1피트 12인치, 1마일 5280피트
            double mph = distance * 3600 / s; // 1시간 3600초

            System.out.printf("Trip #%d: %.2f %.2f\n", n++, distance, mph);
        }
    }
}
