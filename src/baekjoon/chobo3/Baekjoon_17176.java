package baekjoon.chobo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_17176 {
    /*
        암호해독기

        암호문 해독시 해독에 오류가 없는지 확인하려함
        해독한 문장이 암호문을 해석한 결과로 나올 수 없다면 그 해독은 잘못된 거

        암호문 0 ~ 52 이하의 정수
        0 띄어쓰기 1 ~ 26 A ~ Z 27 ~ 52 a ~ z 해석
        암호문은 띄어쓰기를 포함한 모든 철자를 이와 같이 정수로 치환한 후
        순서를 무작위로 뒤섞어서 만듬

        입력
        수열의 길이 N (1 ~ 100,000)
        암호문에 해당하는 수 N개가 띄어쓰기와 함께 주어짐
        평문 주어짐 단, 평문의 길이 N과 같으며 띄어쓰기로 시작하거나 끝나지 않음

        출력
        평문을 암호화해서 주어진 암호문을 만들 수 있다면 "y"
        아니면 "n" 따옴표 없이 출력
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer token = new StringTokenizer(br.readLine());

        int[] arr = new int[53];
        while (token.hasMoreTokens()) {
            int num = Integer.parseInt(token.nextToken());
            arr[num]++;
        }

        int[] arr2 = new int[53];
        String str = br.readLine();
        for (char c : str.toCharArray()) {
            if (c == ' ') {
                arr2[0]++;
            } else if (c >= 'A' && c <= 'Z') {
                arr2[c - 'A' + 1]++;
            } else {
                arr2[c - 'a' + 27]++;
            }
        }

        boolean isSame = true;
        for (int i = 0; i < 53; i++) {
            if (arr[i] != arr2[i]) {
                isSame = false;
                break;
            }
        }

        System.out.println(isSame ? "y" : "n");
    }
}
