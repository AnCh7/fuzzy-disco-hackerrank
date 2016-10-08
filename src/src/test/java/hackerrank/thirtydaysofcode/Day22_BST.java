package hackerrank.thirtydaysofcode;

import hackerrank.helper.InputStream;
import hackerrank.helper.PrintStream;
import hackerrank.helper.Scanner;
import hackerrank.helper.System;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Day22_BST_Solution {

    static class Node {
        Node left, right;
        int data;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static int getHeight(Node root) {
        if (root.right == null && root.left == null) return 0;
        else if (root.left == null) return 1 + getHeight(root.right);
        else if (root.right == null) return 1 + getHeight(root.left);
        else return 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in());
        int T = sc.nextInt();
        Node root = null;

        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }

        int height = getHeight(root);
        System.out().println(height);
    }
}

public class Day22_BST {

    @Test
    public void runSolution() {

        // Injecting input data from HackerRank challenge
        List<String> inputData = new ArrayList<>();
        Collections.addAll(inputData,
                "7",
                "3",
                "5",
                "2",
                "1",
                "4",
                "6",
                "7"
        );

        InputStream inputStream = new InputStream();
        inputStream.setInputData(scala.collection.JavaConversions.asScalaBuffer(inputData));
        System.setIn(inputStream);

        // Injecting output data from HackerRank challenge
        List<String> outputData = new ArrayList<>();
        Collections.addAll(outputData,
                "3"
        );

        PrintStream outputStream = new PrintStream();
        outputStream.setOutputData(scala.collection.JavaConversions.asScalaBuffer(outputData));
        System.setOut(outputStream);

        Day22_BST_Solution.main(null);
    }

    @Test
    public void runSolution2() {

        // Injecting input data from HackerRank challenge
        List<String> inputData = new ArrayList<>();
        Collections.addAll(inputData,
                "9",
                "20",
                "50",
                "35",
                "44",
                "9",
                "15",
                "62",
                "11",
                "13"
        );

        InputStream inputStream = new InputStream();
        inputStream.setInputData(scala.collection.JavaConversions.asScalaBuffer(inputData));
        System.setIn(inputStream);

        // Injecting output data from HackerRank challenge
        List<String> outputData = new ArrayList<>();
        Collections.addAll(outputData,
                "4"
        );

        PrintStream outputStream = new PrintStream();
        outputStream.setOutputData(scala.collection.JavaConversions.asScalaBuffer(outputData));
        System.setOut(outputStream);

        Day22_BST_Solution.main(null);
    }
}
