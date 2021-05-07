package baekjoon.chobo2;

import java.util.Scanner;

public class Baekjoon_13985 {
	/*
	 * Equality
	 * 
	 * 식이 주어질 때 계산이 맞는지 확인하기 (항상 합으로 주어짐)
	 * 
	 * a + b = c
	 * 
	 * 정확한 이 포맷으로 입력 받음 (정수 한자리 총 9개 문자)
	 * 
	 * 계산이 맞으면 YES 아니면 NO 출력
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String p = sc.nextLine();

		char a = p.charAt(0);
		char b = p.charAt(4);
		char c = p.charAt(8);

		if ((a - '0') + (b - '0') == (c - '0')) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

}
