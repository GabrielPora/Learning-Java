package com.gabriel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
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

//        Scanner scannerInstructor = new Scanner(System.in);
//        sum = 0;
//        input = 0;
//        count = 1;
//        System.out.println("Please enter 10 numbers");
//        while (true) {
//            System.out.println("Enter number #" + count);
//            boolean isAnInt = scannerInstructor.hasNextInt();
//            if (isAnInt) {
//                input = scannerInstructor.nextInt();
//                sum += input;
//                count++;
//                if (count > 10) {
//                    break;
//                }
//            }else {
//                System.out.println("Invalid Number!\n Please Enter a valid number");
//            }
//            scannerInstructor.nextLine(); // handles the next line character
//        }
//        System.out.println("The total sum is " + sum);
//        scannerInstructor.close();

    }
}
