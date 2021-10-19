package baekjoon.chobo3;

import java.util.Scanner;

public class Baekjoon_17293 {
    /*
        맥주 99병

        규칙에 맞게 출력하기
        K bottles of beer on the wall, K bottles of beer.
        Take one down and pass it around, K-1 bottles of beer on the wall.
        ...
        맥주 한 병이면 bottle 아니면 bottles
        0 bottles no more bottles

        더 이상 남아있지 않으면
        No more bottles of beer on the wall, no more bottles of beer.
        Go to the store and buy some more, N bottles of beer on the wall.

        1 ~ 99 N
        가사 출력
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();

        int k = n;
        while (k >= 0) {
            if (k > 1) {
                sb.append(k).append(" bottles of beer on the wall, ")
                    .append(k).append(" bottles of beer.\n");
                sb.append("Take one down and pass it around, ");
                if (k - 1 > 1) {
                    sb.append(k - 1).append(" bottles of beer on the wall.\n");
                } else {
                    sb.append(k - 1).append(" bottle of beer on the wall.\n");
                }
            } else if (k == 1) {
                sb.append(k).append(" bottle of beer on the wall, ")
                    .append(k).append(" bottle of beer.\n");
                sb.append("Take one down and pass it around, ")
                    .append("no more").append(" bottles of beer on the wall.\n");
            } else {
                sb.append("No more").append(" bottles of beer on the wall, ")
                    .append("no more").append(" bottles of beer.\n");
                sb.append("Go to the store and buy some more, ");
                if (n > 1) {
                    sb.append(n).append(" bottles of beer on the wall.");
                } else {
                    sb.append(n).append(" bottle of beer on the wall.");
                }
            }
            sb.append("\n");
            k--;
        }
        System.out.println(sb);
    }
}
