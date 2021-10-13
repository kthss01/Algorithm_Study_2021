package baekjoon.chobo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_17072 {
    /*
        아스키 아트

        아스키 문자로 그린 그림을 아스키 아트라고 함
        일반적인 그림 파일 (.jpg, .png 등)들은 기본적으로 해상도에 맞게
        픽셀 단위로 분할된 2차원 그리드에 대해 각 픽셀의 정보를 담는 방식으로 저장된다.
        이 정보에는 여러가지가 있으나 그 중 R G B 값은
        Red Green Blue의 3색이 각각 어느 정도 섞여 있는지를 나타내 주는 지표
        각 값 0 이상 255이하의 범위 정수값 가짐

        아스키 아트는 격자 그리드에서 픽셀 하나 단위로 문자를 할당하여
        그림을 그리는 방식이기 때문에, 우리가 알고 있는 모든 그림 파일은
        아스키 아트로 다시 그릴 수 있음
        그러나 여러 색을 가질 수 있는 그림 파일에 비해
        아스키 아트는 색상을 조절 할 수 없고, 각 픽셀 내부의 채도만 조정 가능함
        원본 이미지가 여러 색이면 원본 이미지의 느낌 살리기 힘듬

        하지만 이미지를 흑백 이미졸 바꾸는 필터를 통해
        원본 이미지를 흑백 이미지로 바꾸고, 그 이후 아스키 아트로
        변환한다면 퀄리티가 높아질 수 있음

        어떤 그림 하나를 흑백 이미지로 바꾸기 위해 각 픽셀마다
        R G b 3색이 어떤 비율로 혼합될지 결정하는 Intensity function을 사용함
        Intensity function 0 이상 255 이하의 R G B 값을 받아
        정수 하나 리턴하는 함수

        I (R, G, B) = 2126 R + 7152 G + 722 B

        위의 함수의 결과값은 0 이상 2,550,000 이하의 값을 가지게 되며,
        값이 높을수록 흰색에 가깝고, 값이 낮을 수록 검은색에 가까운 픽셀이 된다.
        아스키 아트는 intensity function에 따라 정수 하나로 변환된 각 픽셀을
        아래의 기준에 맞추어 변환하면 완성된다.

        Intensity                   변환 문자               아스키 코드
        0 ~ 510,000 미만                 #                    35
        510,000 ~ 1,020,000 미만         o (알파벳 소문자)      111
        1,020,000 ~ 1,530,000 미만       +                    43
        1,530,000 ~ 2,040,000 미만       -                    45
        2,040,000 이상                   .                    46

        원본 이미지 하나의 해상도와 각 픽셀별 R,G,B 값이 주어지면
        이미지의 아스키 아트를 출력하는 프로그램 작성

        입력
        그림의 세로의 길이 N과 가로의 길이 M (1 <= N, M <= 400)
        각 줄에 3M개의 정수 주어짐
        이중 i+1번째 줄의 3j-2, 3j-1 3j번째 정수 R G B 모든 값 0 ~ 255

        출력
        N x M 격자 형태로, 입력된 그림을 아스키 아트로 변환하여 출력
        줄 끝에 필요 없는 공백을 출력하지 않도록 주의
    */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(token.nextToken());
        int m = Integer.parseInt(token.nextToken());

        for (int i = 0; i < n; i++) {
            token = new StringTokenizer(br.readLine());

            for (int j = 0; j < m; j++) {
                int r = Integer.parseInt(token.nextToken());
                int g = Integer.parseInt(token.nextToken());
                int b = Integer.parseInt(token.nextToken());

                int intensity = 2126 * r + 7152 * g + 722 * b;

                if (intensity >= 2040000) {
                    sb.append(".");
                } else if (intensity >= 1530000) {
                    sb.append("-");
                } else if (intensity >= 1020000) {
                    sb.append("+");
                } else if (intensity >= 510000) {
                    sb.append("o");
                } else {
                    sb.append("#");
                }
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
