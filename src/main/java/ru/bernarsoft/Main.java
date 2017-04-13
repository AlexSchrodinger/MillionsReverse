package ru.bernarsoft;

import java.util.*;

public class Main {
    private static final int BOUND = 25_000_001;
    private static final int ELEMENT = 500_000;

    public static void main(String[] args) {

        int[] numbers = new int[BOUND];
        inputToArray(numbers);
        reverseAndPrint(numbers);
    }

    private static int[] inputToArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length ; i++) {
            array[i] = random.nextInt(BOUND);
        }
        return array;
    }

    private static void reverseAndPrint(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }

        for (int i = ELEMENT; i <= array.length; i += ELEMENT ) {
            System.out.println(array[i]);
        }
    }
}