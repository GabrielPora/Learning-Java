package com.gabriel;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // write your code hereSystem.out.println("Enter " + count + " integer values\r");
        System.out.println("Enter the amount of elemts you want to enter into the array\r");
        int count = scanner.nextInt();
        int[] array = readIntegers(count);

        System.out.println("None reversed array\n");
        System.out.println("array: " + Arrays.toString(array));

        int min = findMin(array);
        System.out.println("The minimum value was " + min);
        System.out.println("******************************");

        reverse(array);
        System.out.println("Reversed array\n");
        System.out.println("array: " + Arrays.toString(array));

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " has value of " + array[i]);
        }
    }

    public static int[] readIntegers(int count) {
        System.out.println("Enter " + count + " integer values\r");
        int[] values = new int[count];
        for (int i = 0; i < values.length; i++) {
            System.out.println("Enter integer value\r");
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void reverse(int[] array) {
        int j = array.length - 1;
        int half = array.length / 2;
        for (int i = 0; i < half; i++) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            j--;
        }
    }

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
