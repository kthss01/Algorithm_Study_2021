package baekjoon.chobo3;

import java.util.Scanner;

public class Baekjoon_3076 {
    /*
        상근이의 체스판

        체스판은 검정칸 흰칸 구분
        가장 왼쪽 위칸 검정색
        나머지 색은 검정과 흰색 번갈아가면서 등장
        검정색 'X', 흰색 '.'

        체스판 R행 x C열
        각각의 행의 높이는 문자 A개 만큼
        각각의 열의 너비는 문자 B개 만큼

        R C A B 가 주어졌을 때 체스판 출력하기
        첫째 줄 R, C (1 <= R, C <= 10)
        둘째 줄 A, B (1 <= A, B <= 10)

        출력 R * A행 C * B열 이루어져 있어야 함
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        char[] bw = new char[]{'X', '.'};

        for (int i = 0; i < r; i++) {
            int cur = i % 2;

            StringBuilder temp = new StringBuilder();
            for (int l = 0; l < c; l++) {
                for (int k = 0; k < b; k++) {
                    temp.append(bw[cur]);
                }
                cur = (cur + 1) % 2;
            }

            for (int j = 0; j < a; j++) {
                sb.append(temp).append("\n");
            }

        }

        System.out.println(sb);
    }
}
