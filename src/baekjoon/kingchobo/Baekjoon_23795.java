package baekjoon.kingchobo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 사장님 도박은 재미로 하셔야 합니다 - 브론즈 3
 * 
 * 매판마다 배팅한 양의 정수의 합을 출력
 * 입력
 *  매 줄 양의 정수 입력
 *  -1 종료
 *  입력된 값 2000개 미만
 *  배팅한 돈의 합 2,147,483,647 안넘음
 * 출력
 *  총합 출력
 */
public class Baekjoon_23795 {
   
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        while (true) {
            int num = Integer.parseInt(br.readLine());
            if (num == -1) {
                break;
            }
            sum += num;
        }
        System.out.println(sum);
    }
}
