package hackerrank.regex;

import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MatchingStartAndEnd {
    /*
        ^ start
            ^123 123으로 시작
            1235123 -> 앞 123
        $ end
            123$ 123으로 끝끝
            1235123 -> 뒤 123
     */
    public static void main(String[] args) {
        Regex_Test tester = new Regex_Test();
        tester.checker("^\\d\\w{4}\\.$"); // Use \\ instead of using \
    }

    static class Regex_Test {

        public void checker(String Regex_Pattern){

            Scanner Input = new Scanner(System.in);
            String Test_String = Input.nextLine();
            Pattern p = Pattern.compile(Regex_Pattern);
            Matcher m = p.matcher(Test_String);
            System.out.println(m.find());
        }

    }
}
