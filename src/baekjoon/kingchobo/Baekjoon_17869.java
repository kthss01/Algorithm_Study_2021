package baekjoon.kingchobo;

import java.util.Scanner;

public class Baekjoon_17869 {
    /*
        Simple Collatz Sequence

        collatz 사람 이름
        Simple Collatz Sequence (SCS)

        S(k) 짝수면 k/2 아니면 k+1

        ex) 11
        11 12 6 3 4 2 1

        항상 1로 끝남

        몇번의 step으로 끝나는지 확인해서 출력하기

        n 입력 n은 32-bit unsigned integer
        -> long으로 해야했음
        step 출력
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        int step = 0;

        while (n > 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n += 1;
            }
            step++;
        }

        System.out.println(step);
    }
}
