package baekjoon.chobo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_13772 {
	/*
	 * Holes
	 * 
	 * 단어에 hole 이 있는지 파악하려고함
	 * ex) 
	 * 	A, O - hole 1
	 *  B - hole2
	 *  C E F - hole 0 
	 *  
	 *  Q R O P A D - 1 
	 *  B - 2
	 *  
	 *  N (0 <= N <= 30)
	 *  문자열 공백과 함께 대문자만 (무조건 1단어 이상 포함, 문자열 길이는 250을 넘지 않음)
	 *  hole 갯수 출력
	 */
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String hole1 = "QROPAD";
		// B = hole2
		
		
		for (int i = 0; i < n; i++) {
			int ans = 0;
			String str = br.readLine();
			for (int j = 0; j < str.length(); j++) {
				for (int k = 0; k < hole1.length(); k++) {
					if (str.charAt(j) == hole1.charAt(k))
						ans++;
				}
				if(str.charAt(j) == 'B')
					ans += 2;
			}
			System.out.println(ans);
		}
		
	}

}
