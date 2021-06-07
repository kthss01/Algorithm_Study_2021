package baekjoon.chobo2;

import java.util.Scanner;

public class Baekjoon_20540 {
    /*
        연길이의 이상형

        MBTI는 Myers-Brigs Type Indicator의 줄임말

        MBTI 다음과 같은 네 가지 척도로 성격 표현
        지표                                      설명
        외향 (Extroversion)   내향 (Introversion)    선호하는 세계 : 세상과 타인 / 내면 세계
        감각 (Sensation)      직관 (iNtuition)       인식 형태 : 실제적인 인식 / 실제 너머로 인식
        사고 (Thinking)       감정 (Feeling)         판단 기준 : 사실과 진실 위주 / 관계와 사람 위주
        판단 (Judging)        인식 (Perceiving)      생활양식 : 계획적인 생활 / 즉흥적인 생활

        네 가지 척도마다 두 가지 경우가 존재하므로, 총 16가지의 유형이 만들어짐.
        유형은 각 경우를 나타내는 알파벳 한 글자씩을 따서 네 글자로 표시

        구분      감각/사고    감각/감정    직관/감정     직관/사고
        내향/판단   ISTJ        ISFJ        INFJ        INTJ
        내향/인식   ISTP        ISFP        INFP        INTP
        외향/인식   ESTP        ESFP        ENFP        ENTP
        외향/판단   ESTJ        ESFJ        ENFJ        ENTJ

        자신과 정반대인 사람에게 매력을 느낀다고함
        MBTI 4글자가 대문자로 주어질 때
        이상형에 해당하는 MBTI 출력
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String mbti = sc.nextLine();

        StringBuilder reverseMbti = new StringBuilder();

        for (char c : mbti.toCharArray()) {
            switch (c) {
                case 'I':
                    reverseMbti.append('E');
                    break;
                case 'E':
                    reverseMbti.append('I');
                    break;
                case 'S':
                    reverseMbti.append('N');
                    break;
                case 'N':
                    reverseMbti.append('S');
                    break;
                case 'T':
                    reverseMbti.append('F');
                    break;
                case 'F':
                    reverseMbti.append('T');
                    break;
                case 'J':
                    reverseMbti.append('P');
                    break;
                case 'P':
                    reverseMbti.append('J');
                    break;
            }
        }

        System.out.println(reverseMbti);
    }
}
