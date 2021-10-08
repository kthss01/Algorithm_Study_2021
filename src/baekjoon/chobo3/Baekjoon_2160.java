package baekjoon.chobo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Baekjoon_2160 {
    /*
        그림 비교 -> 재채점 이후 틀렸었음 -> 수정

        N(2 <= N <= 50)개의 그림이 있는데
        각각의 그림은 5 x 7 크기
        두 가지 색으로 되어 있음. X . 으로 표현
        이러한 그림들이 주어졌을 때, 가장 비슷한 두 개의 그림을 찾아내기
        두 개의 그림에서 다른 칸의 개수가 가장적을 때, 두 개의 그림이 가장 비슷

        입력
        N
        5 x N 개 의 줄에 7개의 문자로 각각의 그림이 주어짐
        출력
        첫째 줄에 가장 비슷한 두 그림의 번호 출력
        그림의 번호는 1 ~ N 번호를 출력할 때에는 작은 것을 먼저 출력
        입력은 항상 답이 한 가지인 경우만 주어짐
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        ArrayList<ArrayList<String>> imgList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            ArrayList<String> img = new ArrayList<>();
            for (int j = 0; j < 5; j++) {
                img.add(br.readLine());
            }
            imgList.add(img);
        }

        int imgA = 0;
        int imgB = 0;
        int diff = 35;

        for (int i = 0; i < imgList.size() - 1; i++) {
            for (int j = i + 1; j < imgList.size(); j++) {

                ArrayList<String> img1 = imgList.get(i);
                ArrayList<String> img2 = imgList.get(j);

                int temp = 0;
                // 두 img 비교
                for (int k = 0; k < img1.size(); k++) {
                    String str1 = img1.get(k);
                    String str2 = img2.get(k);
                    for (int l = 0; l < str1.length(); l++) {
                        if(str1.charAt(l) != str2.charAt(l)) {
                            temp++;
                        }
                    }
                }

                if (temp <= diff) {
                    diff = temp;
                    imgA = i + 1;
                    imgB = j + 1;
                }
            }
        }

        System.out.printf("%d %d\n", imgA, imgB);
    }
}
