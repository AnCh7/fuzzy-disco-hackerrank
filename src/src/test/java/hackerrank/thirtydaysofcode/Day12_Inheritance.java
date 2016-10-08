package hackerrank.thirtydaysofcode;

import hackerrank.helper.InputStream;
import hackerrank.helper.PrintStream;
import hackerrank.helper.Scanner;
import hackerrank.helper.System;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person {

    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson() {
        System.out().println("Name: " + lastName + ", " + firstName + "\nID: " + idNumber);
    }
}

class Student extends Person {

    private int[] testScores;

    Student(String firstName, String lastName, int id, int[] scores) {
        super(firstName, lastName, id);
        testScores = scores;
    }

    private Integer sumTestScores() {
        int sum = 0;
        for (int i : testScores) {
            sum += i;
        }
        return sum;
    }

    public char calculate() {
        Integer average = this.sumTestScores() / testScores.length;
        if (average <= 100 && average >= 90) {
            return 'O';
        } else if (average < 90 && average >= 80) {
            return 'E';
        } else if (average < 80 && average >= 70) {
            return 'A';
        } else if (average < 70 && average >= 55) {
            return 'P';
        } else if (average < 55 && average >= 40) {
            return 'D';
        } else if (average < 40) {
            return 'T';
        } else {
            throw new IllegalArgumentException();
        }
    }
}

class Day12_Inheritance_Solution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in());

        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();

        int[] testScores = new int[numScores];

        for (int i = 0; i < numScores; i++) {
            testScores[i] = scan.nextInt();
        }

        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out().println("Grade: " + s.calculate());
    }
}

public class Day12_Inheritance {

    @Test
    public void runSolution() {

        // Injecting input data from HackerRank challenge
        List<String> inputData = new ArrayList<>();
        Collections.addAll(inputData,
                "Heraldo",
                "Memelli",
                "8135627",
                "2",
                "100",
                "80"
        );

        InputStream inputStream = new InputStream();
        inputStream.setInputData(scala.collection.JavaConversions.asScalaBuffer(inputData));
        System.setIn(inputStream);

        // Injecting output data from HackerRank challenge
        List<String> outputData = new ArrayList<>();
        Collections.addAll(outputData,
                "Name: Memelli, Heraldo\nID: 8135627",
                "Grade: O"
        );

        PrintStream outputStream = new PrintStream();
        outputStream.setOutputData(scala.collection.JavaConversions.asScalaBuffer(outputData));
        System.setOut(outputStream);

        Day12_Inheritance_Solution.main(null);
    }
}
