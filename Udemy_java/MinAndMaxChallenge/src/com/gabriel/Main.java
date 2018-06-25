package com.gabriel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scannerInstructor = new Scanner(System.in);
        int sum = 0;
        int input = 0;
        int min = 10;
        int max = -10;
        int count = 1;
        System.out.println("Please enter a set of numbers, Will return the max and min of those numbers entered");
        while (true) {
            System.out.println("Enter number #" + count);
            boolean isAnInt = scannerInstructor.hasNextInt();
            if (isAnInt) {
                input = scannerInstructor.nextInt();
                if (input<min){
                    min = input;
                }
                if (input>max){
                    max = input;
                }
                sum += input;
                count++;
                if (count > 10) {
                    break;
                }
            } else {
                System.out.println("Invalid Number!\n Please Enter a valid number");
            }
            scannerInstructor.nextLine(); // handles the next line character
        }
        System.out.println("The total sum is " + sum);
        System.out.println("The Max is " + max);
        System.out.println("The Min is " + min);
        scannerInstructor.close();
    }
}
