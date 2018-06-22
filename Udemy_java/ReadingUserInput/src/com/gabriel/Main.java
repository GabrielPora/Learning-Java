package com.gabriel;

import java.util.Scanner;
import static com.gabriel.ReadingUserInputChallenge.sumInputs;

public class Main {

    public static void main(String[] args) {
	// write your code here
        sumInputs();

        Scanner scanner = new Scanner(System.in);
        int yearOfBirth = 0;
        System.out.println("Enter your year of birth:");
        boolean hasNextInt = scanner.hasNextInt();
        while (!hasNextInt){
            System.out.println("Invalid input!\n Please Enter your year of birth:");
            scanner.nextLine(); // handles the next line character
            hasNextInt = scanner.hasNextInt();
            if (hasNextInt){
                yearOfBirth = scanner.nextInt();
                if (yearOfBirth<1950 || yearOfBirth>2018){
                    hasNextInt=false;
                }
            }
        }
        scanner.nextLine(); // handles the next line character
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        int age = 2018 - yearOfBirth;
        System.out.println("Your name is "+name+" and you are "+age+" years old");
        scanner.close();
    }
}
