package com.gabriel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int input = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        System.out.println("Please enter a set of numbers, Will return the max and min of those numbers entered");
        while (true) {
            System.out.println("Enter number ");
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                input = scanner.nextInt();
                if (input < min) {
                    min = input;
                }
                if (input > max) {
                    max = input;
                }
                sum += input;
            } else {
                break;
            }
            scanner.nextLine(); // handles the next line character
        }
        System.out.println("The total sum is " + sum);
        System.out.println("The Max is " + max);
        System.out.println("The Min is " + min);
        scanner.close();
    }
}
