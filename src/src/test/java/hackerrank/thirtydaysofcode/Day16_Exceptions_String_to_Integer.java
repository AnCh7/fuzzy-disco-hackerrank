package hackerrank.thirtydaysofcode;

import hackerrank.helper.InputStream;
import hackerrank.helper.PrintStream;
import hackerrank.helper.Scanner;
import hackerrank.helper.System;
import org.junit.Test;

import java.util.*;

class Day16_Exceptions_String_to_Integer_Solution {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        //if (s.length() >= 1 && s.length() <= 10) {
            //Boolean isValid = true;
            //for (Character c : s.toCharArray()) {
            //    if (!Character.isLowerCase(c) && !Character.isDigit(c)) {
            //        isValid = false;
            //    }
            //}
            //if (isValid) {
                try {
                    Integer i = Integer.parseInt(s);
                    System.out.println(i);
                } catch (Exception ex) {
                    System.out.println("Bad String");
                }
            //}
        //}
    }
}

public class Day16_Exceptions_String_to_Integer {

    @Test
    public void runSolution() {
        // Injecting input data from HackerRank challenge
        List<String> inputData = new ArrayList<>();
        Collections.addAll(inputData,
                "3"
        );

        InputStream inputStream = new InputStream();
        inputStream.setInputData(inputData);
        System.setIn(inputStream);

        // Injecting output data from HackerRank challenge
        List<String> outputData = new ArrayList<>();
        Collections.addAll(outputData,
                "3"
        );

        PrintStream outputStream = new PrintStream();
        outputStream.setOutputData(outputData);
        System.setOut(outputStream);

        Day16_Exceptions_String_to_Integer_Solution.main(null);
    }

    @Test
    public void runSolution2() {
        // Injecting input data from HackerRank challenge
        List<String> inputData = new ArrayList<>();
        Collections.addAll(inputData,
                "za"
        );

        InputStream inputStream = new InputStream();
        inputStream.setInputData(inputData);
        System.setIn(inputStream);

        // Injecting output data from HackerRank challenge
        List<String> outputData = new ArrayList<>();
        Collections.addAll(outputData,
                "Bad String"
        );

        PrintStream outputStream = new PrintStream();
        outputStream.setOutputData(outputData);
        System.setOut(outputStream);

        Day16_Exceptions_String_to_Integer_Solution.main(null);
    }
}
