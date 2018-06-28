package com.gabriel;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // below is to call the simple arrays
        SimpleArrays simpleArrays = new SimpleArrays();
        System.out.println(simpleArrays);
        System.out.println();
        System.out.println();
        /****************************************************/


        System.out.println("This is how it is done in real life");
        // This is now real life how it is done

        int[] myIntegers = getIntegers(5);
        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }
        double average = getAverage(myIntegers);
        System.out.println("The array average is " + average);

    }

    private static double getAverage(int[] myIntegers) {
        double sum = 0;
        for (int i = 0; i < myIntegers.length; i++) {
            sum += myIntegers[i];
        }
        sum = sum / myIntegers.length;
        return sum;
    }

    private static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integers values.\r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

}
