package hackerrank.thirtydaysofcode;

import hackerrank.helper.InputStream;
import hackerrank.helper.PrintStream;
import hackerrank.helper.Scanner;
import hackerrank.helper.System;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Day24_More_Linked_Lists_Solution {

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    private static Node insert(Node head, int data) {
        Node p = new Node(data);
        if (head == null)
            head = p;
        else if (head.next == null)
            head.next = p;
        else {
            Node start = head;
            while (start.next != null)
                start = start.next;
            start.next = p;
        }
        return head;
    }

    private static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out().println(start.data + " ");
            start = start.next;
        }
    }

    private static Node removeDuplicates(Node head) {
        if (head != null) {
            Node current = head;
            Node next = head.next;
            while (next != null) {
                if (current.data == next.data) {
                    current.next = next.next;
                    next = current.next;
                } else {
                    current = next;
                    next = next.next;
                }
            }
        }
        return head;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in());
        Node head = null;
        int T = sc.nextInt();
        while (T-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        head = removeDuplicates(head);
        display(head);
    }
}

public class Day24_More_Linked_Lists {

    @Test
    public void runSolution() {

        // Injecting input data from HackerRank challenge
        List<String> inputData = new ArrayList<>();
        Collections.addAll(inputData,
                "6",
                "1",
                "2",
                "2",
                "3",
                "3",
                "4"
        );

        InputStream inputStream = new InputStream();
        inputStream.setInputData(scala.collection.JavaConversions.asScalaBuffer(inputData));
        System.setIn(inputStream);

        // Injecting output data from HackerRank challenge
        List<String> outputData = new ArrayList<>();
        Collections.addAll(outputData,
                "1 ",
                "2 ",
                "3 ",
                "4 "
        );

        PrintStream outputStream = new PrintStream();
        outputStream.setOutputData(scala.collection.JavaConversions.asScalaBuffer(outputData));
        System.setOut(outputStream);

        Day24_More_Linked_Lists_Solution.main(null);
    }

    @Test
    public void runSolution2() {

        // Injecting input data from HackerRank challenge
        List<String> inputData = new ArrayList<>();
        Collections.addAll(inputData,
                "7",
                "1",
                "1",
                "1",
                "1",
                "1",
                "1",
                "1"
        );

        InputStream inputStream = new InputStream();
        inputStream.setInputData(scala.collection.JavaConversions.asScalaBuffer(inputData));
        System.setIn(inputStream);

        // Injecting output data from HackerRank challenge
        List<String> outputData = new ArrayList<>();
        Collections.addAll(outputData,
                "1 "
        );

        PrintStream outputStream = new PrintStream();
        outputStream.setOutputData(scala.collection.JavaConversions.asScalaBuffer(outputData));
        System.setOut(outputStream);

        Day24_More_Linked_Lists_Solution.main(null);
    }
}
