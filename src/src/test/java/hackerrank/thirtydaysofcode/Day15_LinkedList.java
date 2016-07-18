package hackerrank.thirtydaysofcode;

import hackerrank.helper.InputStream;
import hackerrank.helper.PrintStream;
import hackerrank.helper.Scanner;
import hackerrank.helper.System;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class Day15_LinkedList_Solution {

    public static Node insert(Node head, int data) {
        Node node = new Node(data);
        if (head == null) {
            return node;
        } else {
            Node last = head;
            Node lastButOne = null;
            while (last != null) {
                lastButOne = last;
                last = last.next;
            }
            lastButOne.next = node;
            return head;
        }
    }

    public static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while (N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }

        display(head);
        sc.close();
    }
}

public class Day15_LinkedList {

    @Test
    public void runSolution() {
        // Injecting input data from HackerRank challenge
        List<String> inputData = new ArrayList<>();
        Collections.addAll(inputData,
                "4",
                "2",
                "3",
                "4",
                "1"
        );

        InputStream inputStream = new InputStream();
        inputStream.setInputData(inputData);
        System.setIn(inputStream);

        // Injecting output data from HackerRank challenge
        List<String> outputData = new ArrayList<>();
        Collections.addAll(outputData,
                "2 ",
                "3 ",
                "4 ",
                "1 "
        );

        PrintStream outputStream = new PrintStream();
        outputStream.setOutputData(outputData);
        System.setOut(outputStream);

        Day15_LinkedList_Solution.main(null);
    }
}
