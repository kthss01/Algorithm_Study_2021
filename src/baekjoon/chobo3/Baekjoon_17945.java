package baekjoon.chobo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 통학의 신 - 브론즈 3
 * 
 * 통학 시간 1시간 40분
 * -> 쓸데없는 얘기
 * 
 * 이차방정식의 근 구하기
 * 
 * 입력
 * x^2 + 2Ax + B = 0 두 계수 A, B 주어짐
 * A, B는 정수 
 *  -1000 ~ A, B ~ 1000
 * 이 방정식의 근은 항상 정수
 * 
 * x * y = B
 * x + y = 2A
 * 
 * 출력
 * 방정식의 근들을 모두 공백으로 분리해 오름차순으로 출력
 * 중근일 경우 하나만 출력
 */
public class Baekjoon_17945 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(token.nextToken());
        int b = Integer.parseInt(token.nextToken());

        String ans = "";
        for (int i = -1000; i <= 1000; i++) {
            for (int j = -1000; j <= 1000; j++) {
                if (i * j == b && i + j == 2 * a) {
                    if (i == j) {
                        ans = String.valueOf(-i);
                    } else if (i > j) {
                        ans = -i + " " + -j;
                    }
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
