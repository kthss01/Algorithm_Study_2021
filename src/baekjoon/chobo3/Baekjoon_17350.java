package baekjoon.chobo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_17350 {
    /*
        2루수 이름이 뭐야

        야구팀의 멤버 수 N 1 ~ 1000
        선수의 이름 한 줄 씩
        이름 1 ~ 99글자
        영어 소문자들과 대문자 Q W E R T O P로 이루어짐

        anj라는 이름 가진 사람있으면 뭐야; 없으면 뭐야? 출력
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String word = "anj";
        String ans = "뭐야?";

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            if (word.equals(str)) {
                ans = "뭐야;";
                break;
            }
        }

        System.out.println(ans);
    }
}
