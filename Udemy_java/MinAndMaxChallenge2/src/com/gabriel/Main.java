package com.gabriel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;
        boolean first = true;
        int sum = 0;
        int input = 0;
        while (true) {
            System.out.println("Enter number ");
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                input = scanner.nextInt();

                if(first){
                    first = false;
                    min = input;
                    max = input;
                }

                if (input>max){
                    max=input;
                }
                if (input<min){
                    min = input;
                }
                sum += input;
            }else {
                break;
            }
            scanner.nextLine(); // handles the next line character
        }
        System.out.println("The total sum is " + sum);
        System.out.println("The min is " + min);
        System.out.println("The max is " + max);
        scanner.close();
    }
}
