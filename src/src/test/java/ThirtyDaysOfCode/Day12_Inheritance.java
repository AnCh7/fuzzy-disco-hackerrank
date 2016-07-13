package ThirtyDaysOfCode;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertTrue;

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
        System.out.println("Name: " + lastName + ", " + firstName + "\nID: " + idNumber);
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

public class Day12_Inheritance {

    @Test
    public void evaluatesExpression() {
        assertTrue(true);
    }
}

class Solution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

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
        System.out.println("Grade: " + s.calculate());
    }
}
