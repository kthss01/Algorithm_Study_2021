package baekjoon.chobo2;

import java.util.Scanner;

public class Baekjoon_15059 {
    /*
        Hard choice

        요리가 주어지고
        요구하는 요리가 주어질 때
        부족분 출력

        Ca Ba Pa (0 <= Ca, Ba, Pa <= 100)
        Cr Br Pr (0 <= Cr, Br, Pr <= 100)

        aisle - 통로
        respectively - 각각
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ca = sc.nextInt();
        int ba = sc.nextInt();
        int pa = sc.nextInt();

        int cr = sc.nextInt();
        int br = sc.nextInt();
        int pr = sc.nextInt();

        int result = 0;

        if (ca < cr) {
            result += cr - ca;
        }

        if (ba < br) {
            result += br - ba;
        }

        if (pa < pr) {
            result += pr - pa;
        }

        System.out.println(result);
    }
}
