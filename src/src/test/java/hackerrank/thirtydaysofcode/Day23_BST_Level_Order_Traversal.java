package hackerrank.thirtydaysofcode;

import hackerrank.helper.InputStream;
import hackerrank.helper.PrintStream;
import hackerrank.helper.Scanner;
import hackerrank.helper.System;
import hackerrank.thirtydaysofcode.Day22_BST_Solution.Node;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class Day23_BST_Level_Order_Traversal_Solution {


    private static void levelOrder(Node root) {
        LinkedList<Node> _queue = new LinkedList<>();
        List<String> strings = new LinkedList<>();
        if (root != null) {
            strings.add(String.valueOf(root.data));
            _queue.push(root);
            while (!_queue.isEmpty()) {
                Node tree = _queue.pollLast();
                if (tree.left != null) {
                    _queue.push(tree.left);
                    strings.add(String.valueOf(tree.left.data));
                }
                if (tree.right != null) {
                    _queue.push(tree.right);
                    strings.add(String.valueOf(tree.right.data));
                }
            }
            System.out.println(String.join(" ", strings));
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Node root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = Day22_BST_Solution.insert(root, data);
        }
        levelOrder(root);
    }
}

public class Day23_BST_Level_Order_Traversal {

    @Test
    public void runSolution() {

        // Injecting input data from HackerRank challenge
        List<String> inputData = new ArrayList<>();
        Collections.addAll(inputData,
                "6",
                "3",
                "5",
                "4",
                "7",
                "2",
                "1"
        );

        InputStream inputStream = new InputStream();
        inputStream.setInputData(inputData);
        System.setIn(inputStream);

        // Injecting output data from HackerRank challenge
        List<String> outputData = new ArrayList<>();
        Collections.addAll(outputData,
                "3 2 5 1 4 7"
        );

        PrintStream outputStream = new PrintStream();
        outputStream.setOutputData(outputData);
        System.setOut(outputStream);

        Day23_BST_Level_Order_Traversal_Solution.main(null);
    }
}
