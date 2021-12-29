package baekjoon.chobo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * 나의 학점은? - 브론즈 2
 * 
 * A0 이상 학점을 받으려면 15등 이상이어야함
 * 최종 점수 내림차순 정렬
 *  학점 구하기
 *      A+ 1 ~ 5
 *      A0 6 ~ 15
 *      B+ 16 ~ 30
 *      B0 31 ~ 35
 *      C+ 36 ~ 45
 *      C0 46 ~ 48
 *      F 49 ~ 50
 * 
 * 입력
 *  학생들의 점수 50개 띄어쓰기 구분되어 주어짐
 *  내림차순 정렬 같은 점수 존재 X
 * 
 * 내가 받은 점수 주어짐 (둘째줄)
 * 모든 점수 0 이상 300 이하
 * 
 * 학점 출력
 */
public class Baekjoon_17826 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        String score = br.readLine();

        int rank = 1;
        while (token.hasMoreTokens()) {
            if (score.equals(token.nextToken())) {
                break;
            }
            rank++;
        }
        
        String ans = "";
        if (rank <= 5) {
            ans = "A+";
        } else if (rank <= 15) {
            ans = "A0";
        } else if (rank <= 30) {
            ans = "B+";
        } else if (rank <= 35) {
            ans = "B0";
        } else if (rank <= 45) {
            ans = "C+";
        } else if (rank <= 48) {
            ans = "C0";
        } else {
            ans = "F";
        }
        System.out.println(ans);
    }
}
