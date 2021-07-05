package baekjoon.chobo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.StringTokenizer;

public class Baekjoon_9733 {
    /*
        꿀벌

        꿀벌이 하는 일
        휴식(Re), 순찰(Pt), 방청소(Cc), 꽃가루 먹기(Ea)
        새끼 돌보기(Tb), 벌집 짓기와 관리(Cm), 외부 활동(Ex)

        꿀벌이 한 일이 주어졌을 때,
        각각을 몇 번 했고, 비율이 어떻게 되는지 구하기

        입력
        꿀벌이 한 일이 공백과 줄바꿈으로 구분되어 주어짐
        최대 24개의 일

        출력
        각각의 일을 한 횟수와 비융르 공백으로 구분하여 출력
        출력 {Re, Pt, Cc, Ea, Tb, Cm, Ex} 순서대로
        비율은 소수점 둘째 자리까지 출력한다.
        주어진 목록에 없는 일은 출력하지 않는다.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] works = {"Re", "Pt", "Cc", "Ea", "Tb", "Cm", "Ex"};
        Map<String, Integer> workMap = new HashMap<>();

        for (String work : works) {
            workMap.put(work, 0);
        }

        String temp = "";
        int total = 0;
        while (true) {
            temp = br.readLine();

            if (temp == null) {
                break;
            }

            StringTokenizer token = new StringTokenizer(temp);

            while (token.hasMoreTokens()) {
                temp = token.nextToken();
                if (workMap.containsKey(temp)) {
                    workMap.put(temp, workMap.get(temp) + 1);
                }
                total++;
            }
        }

        for (String work : works) {
            System.out.printf("%s %d %.2f\n", work, workMap.get(work), workMap.get(work) / (double) total);
        }
        System.out.println("Total " + total + " 1.00");
    }
}
