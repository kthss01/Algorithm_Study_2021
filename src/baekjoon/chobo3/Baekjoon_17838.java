package baekjoon.chobo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 커맨드 - 브론즈 2
 * 
 * 좋아하는 커맨드
 *  문자열 길이 7
 *  2가지 종류의 문자로 이루어짐
 *  AABBABB 형식
 * 
 * 좋아하는 커맨드인지 확인하기
 * 
 * 입력
 *  테스트 케이스의 개수 T 1 ~ T ~ 100
 *  길이 N 알파벳 대문자로만 이루어진 문자열 입력
 *  N 10,000보다 작거나 같은 자연수
 * 
 * 출력
 *  좋아하는 커맨드이면 1
 *  아니면 0 출력
 */
public class Baekjoon_17838 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String command = br.readLine();

            boolean isLike = true;

            if (command.length() != 7) {
                isLike = false;
            } else {
                
            }

            if (isLike) {
                sb.append(1);
            } else {
                sb.append(0);
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
