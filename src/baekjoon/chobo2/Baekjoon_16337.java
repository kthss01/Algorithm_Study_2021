package baekjoon.chobo2;

// import javafx.util.Pair;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Baekjoon_16337 {
    /*
        Die
        주사위 면이 주어졌을 때
        올바른 값이면 주사위 번호를 출력하고 아니면
        unknown 출력

        O : 로 구분되어서 입력 받음 3x3

        나올 수 있는 경우
        - 1
        :::
        :0:
        :::

        - 2
        0:: ::0
        ::: :::
        ::0 0::

        - 3
        0:: ::0
        :0: :0:
        ::0 0::

        - 4
        0:0
        :::
        0:0

        - 5
        0:0
        :0:
        0:0

        - 6
        0:0 000
        0:0 :::
        0:0 000
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        ArrayList<ArrayList<Pair<Integer, Integer>>> dices = new ArrayList<>();
//
//        // dice 1
//        dices.add(new ArrayList<>());
//        dices.get(0).add(new Pair<>(1, 1));
//
//        // dice 2
//        dices.add(new ArrayList<>());
//        dices.get(1).add(new Pair<>(0, 0));
//        dices.get(1).add(new Pair<>(2, 2));
//
//        dices.add(new ArrayList<>());
//        dices.get(2).add(new Pair<>(0, 2));
//        dices.get(2).add(new Pair<>(2, 0));
//
//        // dice 3
//        dices.add(new ArrayList<>());
//        dices.get(3).add(new Pair<>(0, 0));
//        dices.get(3).add(new Pair<>(1, 1));
//        dices.get(3).add(new Pair<>(2, 2));
//
//        dices.add(new ArrayList<>());
//        dices.get(4).add(new Pair<>(0, 2));
//        dices.get(4).add(new Pair<>(1, 1));
//        dices.get(4).add(new Pair<>(2, 0));
//
//        // dice 4
//        dices.add(new ArrayList<>());
//        dices.get(5).add(new Pair<>(0, 0));
//        dices.get(5).add(new Pair<>(0, 2));
//        dices.get(5).add(new Pair<>(2, 0));
//        dices.get(5).add(new Pair<>(2, 2));
//
//        // dice 5
//        dices.add(new ArrayList<>());
//        dices.get(6).add(new Pair<>(0, 0));
//        dices.get(6).add(new Pair<>(0, 2));
//        dices.get(6).add(new Pair<>(1, 1));
//        dices.get(6).add(new Pair<>(2, 0));
//        dices.get(6).add(new Pair<>(2, 2));
//
//        // dice 6
//        dices.add(new ArrayList<>());
//        dices.get(7).add(new Pair<>(0, 0));
//        dices.get(7).add(new Pair<>(1, 0));
//        dices.get(7).add(new Pair<>(2, 0));
//        dices.get(7).add(new Pair<>(0, 2));
//        dices.get(7).add(new Pair<>(1, 2));
//        dices.get(7).add(new Pair<>(2, 2));
//
//        dices.add(new ArrayList<>());
//        dices.get(8).add(new Pair<>(0, 0));
//        dices.get(8).add(new Pair<>(0, 1));
//        dices.get(8).add(new Pair<>(0, 2));
//        dices.get(8).add(new Pair<>(2, 0));
//        dices.get(8).add(new Pair<>(2, 1));
//        dices.get(8).add(new Pair<>(2, 2));
//
//        int[][] arr = new int[3][3];
//
//        ArrayList<Pair<Integer, Integer>> dice = new ArrayList<>();
//
//        for (int i = 0; i < 3; i++) {
//            String r = br.readLine();
//            for (int j = 0; j < r.length(); j++) {
//                if (r.charAt(j) == 'o') {
//                    dice.add(new Pair<>(i, j));
//                }
//            }
//        }
//
//        int result = 0;
//
//        for (ArrayList<Pair<Integer, Integer>> d : dices) {
//            boolean isSame = false;
//            if (d.size() == dice.size()) {
//                isSame = true;
//                for (int i = 0; i < dice.size(); i++) {
//                    Pair<Integer, Integer> p1 = d.get(i);
//                    Pair<Integer, Integer> p2 = dice.get(i);
//                    if (p1.getKey() != p2.getKey() || p1.getValue() != p2.getValue()) {
//                        isSame = false;
//                        break;
//                    }
//                }
//                if (isSame) {
//                    result = dice.size();
//                    break;
//                }
//            }
//        }
//
//        System.out.println(result == 0 ? "unknown" : result);

        // 문자열로 처리하는게 편함 map으로 해서 문자열 처리로 끝내자
        Map<String, String> dices = new HashMap<>();

        dices.put(":::" + ":o:" + ":::", "1");
        dices.put("o::" + ":::" + "::o", "2");
        dices.put("::o" + ":::" + "o::", "2");
        dices.put("o::" + ":o:" + "::o", "3");
        dices.put("::o" + ":o:" + "o::", "3");
        dices.put("o:o" + ":::" + "o:o", "4");
        dices.put("o:o" + ":o:" + "o:o", "5");
        dices.put("o:o" + "o:o" + "o:o", "6");
        dices.put("ooo" + ":::" + "ooo", "6");

        String dice = br.readLine();
        dice += br.readLine();
        dice += br.readLine();

        String result = dices.get(dice);
        System.out.println(result != null ? result : "unknown");
    }
}
