package hackerrank.thirtydaysofcode;

import hackerrank.helper.System;
import org.junit.Test;

class Day21_Generics_Solution {

    private static void printArray(Object[] array) {
        for (Object o : array) {
            System.out().println(o.toString());
        }
    }

    public static void main(String args[]) {

        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};

        printArray(intArray);
        printArray(stringArray);

        if (Day21_Generics_Solution.class.getDeclaredMethods().length > 2) {
            System.out().println("You should only have 1 method named printArray.");
        }
    }
}

public class Day21_Generics {

    @Test
    public void runSolution() {
        Day21_Generics_Solution.main(null);
    }
}
