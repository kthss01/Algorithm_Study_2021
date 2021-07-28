package baekjoon.chobo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Baekjoon_14535 {
    /*
        Birthday Graph

        생년 월일 입력 받아서
        월별로 갯수 체크해서 출력하기

        입력
        N (N <= 100)
        dd mm yyyy 형식으로 입력
        N == 0 종료

        출력
        Case #N: 시작
        Jan: ** 갯수
        ...
        Dec: 없으면 빈칸 형식으로 출력
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

//        Map<String, String> monthStrMap = new HashMap<>();
//        monthStrMap.put("01", "Jan");
//        monthStrMap.put("02", "Feb");
//        monthStrMap.put("03", "Mar");
//        monthStrMap.put("04", "Apr");
//        monthStrMap.put("05", "May");
//        monthStrMap.put("06", "Jun");
//        monthStrMap.put("07", "Jul");
//        monthStrMap.put("08", "Aug");
//        monthStrMap.put("09", "Sep");
//        monthStrMap.put("10", "Oct");
//        monthStrMap.put("11", "Nov");
//        monthStrMap.put("12", "Dec");
        String[][] monthStrArr = new String[][] {
                {"1", "Jan"},
                {"2", "Feb"},
                {"3", "Mar"},
                {"4", "Apr"},
                {"5", "May"},
                {"6", "Jun"},
                {"7", "Jul"},
                {"8", "Aug"},
                {"9", "Sep"},
                {"10", "Oct"},
                {"11", "Nov"},
                {"12", "Dec"}
        };

        int num = 1;
        while (true) {
            int n = Integer.parseInt(br.readLine().trim());

            if (n == 0)
                break;

            Map<String, Integer> monthMap = new HashMap<>();

            for (int i = 0; i < n; i++) {
                String month = br.readLine().split(" ")[1];
                month = String.valueOf(Integer.parseInt(month));

                if (monthMap.containsKey(month)) {
                    monthMap.put(month, monthMap.get(month) + 1);
                } else {
                    monthMap.put(month, 1);
                }
            }

            sb.append(String.format("Case #%d:\n", num++));

            for (String[] strArr : monthStrArr) {
                String m = strArr[0];
                sb.append(strArr[1]).append(":");

                if (monthMap.containsKey(m)) {
                    for (int i = 0; i < monthMap.get(m); i++) {
                        sb.append("*");
                    }
                }

                sb.append("\n");
            }
        }

        System.out.println(sb);
    }
}
