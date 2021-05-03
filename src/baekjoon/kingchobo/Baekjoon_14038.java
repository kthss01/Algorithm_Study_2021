package baekjoon.kingchobo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_14038 {
    /*
        Tournament Selection

        각각의 player 6번의 게임을 진행함

        5,6 win -> Group 1
        3,4 win -> Group 2
        1,2 win -> Group 3
        no win -> eliminated

        6 줄
        각 줄 W or L (win or loss)

        1,2,3 -1 중 하나 출력 (-1 eliminated)
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int win = 0;

        for (int i = 0; i < 6; i++) {
            char result = br.readLine().charAt(0);
            if (result == 'W')
                win++;
        }

        int group = -1;

        switch (win) {
            case 5:
            case 6:
                group = 1;
                break;
            case 3:
            case 4:
                group = 2;
                break;
            case 2:
            case 1:
                group = 3;
                break;
        }

        System.out.println(group);
    }
}
