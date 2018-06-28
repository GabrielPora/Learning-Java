package com.gabriel;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // write your code hereSystem.out.println("Enter " + count + " integer values\r");
        System.out.println("Enter the amount of elemts you want to enter into the array\r");
        int count = scanner.nextInt();
        int[] array = readIntegers(count);
        int min = findMin(array);
        System.out.println("The minimum value was "+min);
    }

    public static int[] readIntegers(int count) {
        System.out.println("Enter " + count + " integer values\r");
        int[] values = new int[count];
        for (int i = 0; i < values.length;i++){
            System.out.println("Enter integer value\r");
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i< array.length;i++){
            if (min>array[i]){
                min=array[i];
            }
        }
        return min;
    }
}
