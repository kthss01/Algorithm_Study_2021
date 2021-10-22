package baekjoon.chobo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_17450 {
    /*
        과자 사기
        S, N, U 이름이 붙은 과자 3개 팜
        한 봉지당 가격과 무게가 안내되어있음
        같은 종류의 과자끼리 봉지의 무게가 똑같음

        10 봉지 사려고 함
        할인 쿠폰 하나 가지고 있는데
        총 구매 금액 5000 이상일 때 500원 깎아 주는 쿠폰
        5000 미안인 경우 할인 쿠폰 사용 불가
        할인 여러번 적용 불가

        가성비 중요
        가성비란 총 무게를 총 금액으로 나눈 값
        한 종류의 과자만 10봉지 골라 사려고 함
        또 다른 물건 구매하지 않을 생각

        가성비 = 과자 10봉지의 무게의 합 / 쿠폰 사용을 고려했을 때 과자 10봉지를 사는데 필요한 돈

        S N U 순서대로 가격 무게 띄어쓰기로 입력
        1 ~ 1000 이하 정수
        세 종류의 과자의 가성비가 서로 다름 보장

        가장 가성비가 높은 과자의 이름 출력
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        int sC = Integer.parseInt(token.nextToken()) * 10;
        double sW = Double.parseDouble(token.nextToken()) * 10;
        token = new StringTokenizer(br.readLine());
        int nC = Integer.parseInt(token.nextToken()) * 10;
        double nW = Double.parseDouble(token.nextToken()) * 10;
        token = new StringTokenizer(br.readLine());
        int uC = Integer.parseInt(token.nextToken()) * 10;
        double uW = Double.parseDouble(token.nextToken()) * 10;

        double s = sW / (sC >= 5000 ? sC - 500 : sC);
        double n = nW / (nC >= 5000 ? nC - 500 : nC);
        double u = uW / (uC >= 5000 ? uC - 500 : uC);

        String ans = "";
        if (s > n && s > u) {
            ans = "S";
        } else if (n > s && n > u) {
            ans = "N";
        } else {
            ans = "U";
        }

        System.out.println(ans);

    }
}
