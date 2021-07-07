package baekjoon.chobo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_10410 {
    /*
        Eligibility - 적임, 적격

        ICPC 참가 규칙에 맞는지 확인하기
        1. 학생이 2010년 이후 중등교육 시작했으면 eligible
        2. 1991년 이후 출생이면 eligible
        3. 위 조건에 해당하지 않을 때 학생이 8학기 넘은 학생이면 ineligible
        4. 3 조건에 해당하지 않을 때 코치가 청원서 제출 필요

        8학기 넘었단 얘긴 각학기 5코스라 41코스 이상인걸 의미

        Tertiary education - 3차 교육
        Postsecondary education - 중등 교육
        petition 진정[탄원/청원](서)

        입력
        num test case
        name YYYY/MM/DD YYYY/MM/DD courses
            name 30 alphabetic characters
            first date first began post-secondary studies
            second date birth
            courses non-negative integer 학생이 완료한 코스
        최대 1000 cases

        출력
        name eligible/ineligible/coach petitions
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (t != 0) {
            StringTokenizer token = new StringTokenizer(br.readLine());

            String name = token.nextToken();
            String study = token.nextToken();
            String birth = token.nextToken();
            int courses = Integer.parseInt(token.nextToken());

            String[] rStr = {"eligible", "ineligible", "coach petitions"};

            int studyYear = Integer.parseInt(study.substring(0, 4));
            int birthYear = Integer.parseInt(birth.substring(0, 4));

            int result = 1;

            if (studyYear >= 2010 || birthYear >= 1991 || courses < 41) {
                result = 0;
            }
            if (studyYear < 2010 && birthYear < 1991 && courses < 41) {
                result = 2;
            }

            sb.append(name).append(" ").append(rStr[result]).append("\n");

            t--;
        }

        System.out.println(sb);
    }
}
