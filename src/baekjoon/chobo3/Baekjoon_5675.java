package baekjoon.chobo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_5675 {
    /*
        시침과 분침
        시계 완벽한 원 몽야
        시침, 분침 원의 중심을 기준으로 회전
        시계 60개 눈금 지름을 따라서 표시
        눈금과 눈금 사이의 거리는 모두 같음

        분침 1분에 한 번씩 다음 눈금으로이동
        시침은 12분에 한 번씩 다음 눈금으로 이동
        즉, 1시간이 지나면 다섯 눈금 이동
        이 시계는 시나 분이 바뀌는 순간 즉시 다음 눈금으로 이동
        즉, 시침과 분침은 항상 눈금을 가리키고 있으며, 그 사이를 가리키는 경우는 없음

        자정은 시침과 분침이 동시에 가장 윗 눈금을 가리킬 때
        즉, 0시 0분
        12시간 또는 720분이 지나면, 시침과 분침은 다시 같은 위치로 오게 됨
        이러한 움직임은 계속해서 반복

        분침이 움직였을 때 시침이 움직이지 않을 수 있다.
        하지만, 시침이 움직였담녀 항상 분침도 움직임

        시침과 분침이 이루는 각도 계산
        어떤 각도가 반복해서 나오나
        어떤 각도는 절대 나오지 않음
        예를 들어 3시, 9시 각도 90도
        65도는 없음

        시침과 분침이 이루는 각도가 A가 되는 경우가 있는지 확인

        0보다 크거나 같고, 180보다 작거나 같은 정수 A가 주어졌을 때,
        시계가 각도 A를 이루는 시간이 있는지 확인하기

        여러개의 테스트케이스 A (0 <= A <= 180)
        되는 경우 Y 아니면 N

        한 개 눈금 움직일때마다 6도이므로 나머지 6 == 0 인 경우 Y
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String temp;
        while ((temp = br.readLine()) != null) {
            System.out.println(Integer.parseInt(temp) %  6 == 0 ? "Y" : "N");
        }
    }
}

