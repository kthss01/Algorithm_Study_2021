package programmers.level1;

public class FindMidChar {
    /*
        가운데 글자 가져오기

        단어 s의 가운데 글자를 반환하는 함수 만들기
        단어의 길이가 짝수라면 가운데 두 글자 반환

        제한 사항
        s의 길이 1이상, 100이하인 스트링
     */
    public static void main(String[] args) {
        String s = "abcde";
        System.out.println(solution(s)); // c

        s = "qwer";
        System.out.println(solution(s)); // we
    }

    public static String solution(String s) {
        String answer = "";

        int p = s.length() / 2;

        answer = s.length() % 2 == 1 ?
                s.substring(p, p + 1) :
                s.substring(p - 1, p + 1);

        // 더 간단한 방법
        // 홀짝 관계 없이 길이-1 / 2하면 중간이 됨 (짝수면 2개 출력되기 때문)
//        answer = s.substring((s.length() - 1) / 2, s.length() / 2 + 1);

        return answer;
    }
}
