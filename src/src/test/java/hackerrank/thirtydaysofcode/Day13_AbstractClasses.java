package hackerrank.thirtydaysofcode;

import hackerrank.helper.InputStream;
import hackerrank.helper.PrintStream;
import hackerrank.helper.Scanner;
import hackerrank.helper.System;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

abstract class Book {

    String title;
    String author;

    Book(String t, String a) {
        title = t;
        author = a;
    }

    abstract void display();
}

class MyBook extends Book {

    private Integer _price;

    MyBook(String title, String author) {
        super(title, author);
    }

    MyBook(String title, String author, int price) {
        super(title, author);
        _price = price;
    }

    @Override
    void display() {
        System.out.println("Title: " + super.title +
                "\nAuthor: " + super.author +
                "\nPrice: " + +_price);
    }
}

class Day13_AbstractClasses_Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        String author = sc.nextLine();
        int price = sc.nextInt();

        Book new_novel = new MyBook(title, author, price);
        new_novel.display();
    }
}

// Using helper classes for Java
public class Day13_AbstractClasses {

    @Test
    public void runSolution() {
        // Injecting input data from HackerRank challenge
        List<String> inputData = new ArrayList<>();
        Collections.addAll(inputData,
                "The Alchemist",
                "Paulo Coelho",
                "248"
        );

        InputStream inputStream = new InputStream();
        inputStream.setInputData(inputData);
        System.setIn(inputStream);

        // Injecting output data from HackerRank challenge
        List<String> outputData = new ArrayList<>();
        Collections.addAll(outputData,
                "Title: The Alchemist" +
                "\nAuthor: Paulo Coelho" +
                "\nPrice: 248"
        );

        PrintStream outputStream = new PrintStream();
        outputStream.setOutputData(outputData);
        System.setOut(outputStream);

        Day13_AbstractClasses_Solution.main(null);
    }
}