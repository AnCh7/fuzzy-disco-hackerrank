package hackerrank.thirtydaysofcode.java;

import hackerrank.helper.java.InputStream;
import hackerrank.helper.java.PrintStream;
import hackerrank.helper.java.Scanner;
import hackerrank.helper.java.System;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Difference {

    private int[] elements;
    public int maximumDifference;

    public Difference(int[] elements) {
        this.elements = elements;
    }

    public void computeDifference() {
        for (int i = 0; i < elements.length - 1; i++) {
            Integer current = elements[i];
            for (int k = i + 1; k < elements.length; k++) {
                Integer next = elements[k];
                Integer diff = Math.abs(current - next);
                if (diff > maximumDifference) {
                    maximumDifference = diff;
                }
            }
        }
    }
}

class Day14_Scope_Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        if (n >= 1 && n <= 10) {
            for (int i = 0; i < n; i++) {
                Integer elem = sc.nextInt();
                if (n >= 1 && n <= 100) {
                    a[i] = elem;
                }
            }
        }
        sc.close();

        Difference difference = new Difference(a);
        difference.computeDifference();
        System.out.print(difference.maximumDifference);
    }
}


public class Day14_Scope {

    @Test
    public void runSolution() {
        // Injecting input data from HackerRank challenge
        List<String> inputData = new ArrayList<>();
        Collections.addAll(inputData,
                "3",
                "1",
                "2",
                "5"
        );

        InputStream inputStream = new InputStream();
        inputStream.setInputData(inputData);
        System.setIn(inputStream);

        // Injecting output data from HackerRank challenge
        List<String> outputData = new ArrayList<>();
        Collections.addAll(outputData,
                "4"
        );

        PrintStream outputStream = new PrintStream();
        outputStream.setOutputData(outputData);
        System.setOut(outputStream);

        Day14_Scope_Solution.main(null);
    }
}
