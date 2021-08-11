package hackerrank.regex;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MatchingAnythingButaNewLine {

    /*
        dot .
        dot(.) matches anything (except for a newline)

     */

    public static void main(String[] args) {
        Tester tester = new Tester();
//        tester.check("...\\....\\....\\....");
        tester.check(".{3}\\..{3}\\..{3}\\..{3}");
    }

    static class Tester {

        public void check(String pattern){

            Scanner scanner = new Scanner(System.in);
            String testString = scanner.nextLine();
            Pattern p = Pattern.compile(pattern);
            Matcher m = p.matcher(testString);
            boolean match = m.matches();

            System.out.format("%s", match);
        }

    }
}
