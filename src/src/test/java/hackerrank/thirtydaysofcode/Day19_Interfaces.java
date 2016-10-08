package hackerrank.thirtydaysofcode;

import hackerrank.helper.InputStream;
import hackerrank.helper.PrintStream;
import hackerrank.helper.Scanner;
import hackerrank.helper.System;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

interface AdvancedArithmetic {
    int divisorSum(int n);
}

class Calculator implements AdvancedArithmetic {

    @Override
    public int divisorSum(int n) {
        Integer sum = 0;
        for (Integer i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}

class Day19_Interfaces_Solution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in());
        int n = scan.nextInt();

        if (n >= 1 && n <= 1000) {
            AdvancedArithmetic myCalculator = new Calculator();
            int sum = myCalculator.divisorSum(n);
            System.out().println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
            System.out().println(sum);
        }
        scan.close();
    }
}

public class Day19_Interfaces {

    @Test
    public void runSolution() {

        // Injecting input data from HackerRank challenge
        List<String> inputData = new ArrayList<>();
        Collections.addAll(inputData,
                "6"
        );

        InputStream inputStream = new InputStream();
        inputStream.setInputData(scala.collection.JavaConversions.asScalaBuffer(inputData));
        System.setIn(inputStream);

        // Injecting output data from HackerRank challenge
        List<String> outputData = new ArrayList<>();
        Collections.addAll(outputData,
                "I implemented: hackerrank.thirtydaysofcode.AdvancedArithmetic",
                "12"
        );

        PrintStream outputStream = new PrintStream();
        outputStream.setOutputData(scala.collection.JavaConversions.asScalaBuffer(outputData));
        System.setOut(outputStream);

        Day19_Interfaces_Solution.main(null);
    }
}
