package com.gabriel;

import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void sumInputs(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int input = 0;
        int count = 1;
        System.out.println("Please enter 10 numbers");
        System.out.println("Enter number #" + count);
        boolean hasNextInt = scanner.hasNextInt();
        while (!hasNextInt || count < 10) {
            if (!hasNextInt) {
                System.out.println("Invalid Number!\n Please Enter a valid number");
            }
            System.out.println("Enter number #" + count);
            scanner.nextLine(); // handles the next line character
            hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                input = scanner.nextInt();
                sum += input;
                count++;
//                if (count != 10) {
//                    hasNextInt = false;
//                }
            }
        }
        System.out.println("The total sum is " + sum);
        scanner.close();


    }
}
