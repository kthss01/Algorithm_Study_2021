package programmers.kakaointership2020;

import java.util.HashMap;
import java.util.Map;

public class KeypadPress {
    /*
        2020 카카오 인턴쉽
        [카카오 인턴] 키패드 누르기

        전화 키패드에서 왼손, 오른손의 엄지손가락만을 이용해서 숫자만을 입력하려고 함
        맨 처음 왼손 엄지손가락 * 키패드
        오른손 엄지손가락ㅇ느 # 키패드 위치에서 시작

        엄지손가락 사용 규칙
        1. 엄지손가락은 상하좌우 4가지 방향으로만 이동 키패드 이동 한 칸은 거리로 1 해당
        2. 왼쪽 열의 3개의 숫자 1, 4, 7 왼손 엄지손가락 사용
        3. 오른쪽 열의 3개의 숫자 3, 6, 9 오른손 엄지손가락 사용
        4. 가운데 열의 4개의 숫자 2, 5, 8, 0을 입력할 때는
            두 엄지손가락의 현재 키패드의 위치에서 더 가까운 엄지손가락을 사용
            4-1. 만약 두 엄지손가락의 거리가 같다면,
                오른손잡이는 오른쪽 엄지손가락,
                왼손잡이는 왼손 엄지손가락을 사용

        순서래도 누를 번호가 담긴 배열 numbers,
        왼손잡이인지 오른손잡이인지를 나타내는 문자열 hand가 매개변수로 주어질 때,
        각 번호를 누른 엄지손가락이 왼손인지 오른손인지를 나타내는
        연속된 문자열 형태로 return 하도록 solution 함수를 완성하기

        [제한사항]
            numbers 배열의 크기는 1 이상 1,000 이하
            numbers 배열 원소의 값은 0이상 9이하인 정수
            hand "left" or "right"
                left 왼손잡이, right 오른손잡이
            왼쪽 엄지손가락을 사용한 경우 L
            오른쪽 엄지손가락을 사용한 경우 R을 순서대로 이어붙여 문자열 형태로 return
     */



    public static void main(String[] args) {
        int[] numbers = new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";

        System.out.println(solution(numbers, hand));

        numbers = new int[]{7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        hand = "left";

        System.out.println(solution(numbers, hand));

        numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        hand = "right";

        System.out.println(solution(numbers, hand));
    }

    static class Pos {
        int x, y;

        public Pos(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void setPos(Pos pos) {
            x = pos.x;
            y = pos.y;
        }
    }

    public static int distance(Pos p1, Pos p2) {
        return Math.abs(p1.x - p2.x) + Math.abs(p1.y - p2.y);
    }

    public static String solution(int[] numbers, String hand) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        Pos left = new Pos(3, 0);
        Pos right = new Pos(3, 2);

        Map<String, Pos> map = new HashMap<String, Pos>();
        int num = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                map.put(String.valueOf(num++), new Pos(i, j));
            }
        }
        map.put("*", new Pos(3, 0));
        map.put("0", new Pos(3, 1));
        map.put("#", new Pos(3, 2));

        for (int number : numbers) {
            Pos pos = map.get(String.valueOf(number));
            if (number == 1 || number == 4 || number == 7) {
                sb.append("L");
                left.setPos(pos);
            } else if (number == 3 || number == 6 || number == 9) {
                sb.append("R");
                right.setPos(pos);
            } else {
                int leftDistance = distance(left, pos);
                int rightDistance = distance(right, pos);

                // 거리가 같은 경우 주 손으로
                if (leftDistance == rightDistance) {
                    // 위치 설정
                    if (hand.equals("left")) {
                        sb.append("L");
                        left.setPos(pos);
                    } else {
                        sb.append("R");
                        right.setPos(pos);
                    }
                } else if (leftDistance > rightDistance) {
                    // 오른손이 더 가까운 경우
                    sb.append("R");
                    right.setPos(pos);
                } else {
                    // 왼손이 더 가까운 경우
                    sb.append("L");
                    left.setPos(pos);
                }
            }
        }

        answer = sb.toString();

        return answer;
    }
}
