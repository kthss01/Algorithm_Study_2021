package hackerrank.regex;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MatchingDigitsAndNonDigitCharacters {
    /*
        \d [0-9]
        \D 숫자빼고 나머지
     */

    public static void main(String[] args) {

        Regex_Test tester = new Regex_Test();
        tester.checker("\\d{2}\\D\\d{2}\\D\\d{4}"); // Use \\ instead of using \

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

