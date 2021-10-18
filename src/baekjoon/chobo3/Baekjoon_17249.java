package baekjoon.chobo3;

import java.util.Scanner;

public class Baekjoon_17249 {
    /*
        태보태보 총난타

        왼쪽 잔상 오른쪽 잔상이 주어질 때 주먹 몇번 뻗었는지 확인학

        =@로 끝남 잔상이 남지 않는 경우 없음
        얼굴 형태 ^O^ 꼴 주먹의 잔상 같은 곳에 위치 않함

        입력
        문자열 길이 1000 넘지 않음
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int left = 0;
        int right = 0;
        boolean isLeft = true;

        for (char ch : str.toCharArray()) {
            if (ch == '@') {
                if (isLeft) {
                    left++;
                } else {
                    right++;
                }
            } else if (ch == '^') {
                isLeft = false;
            }
        }

        System.out.println(left + " " + right);
    }
}
