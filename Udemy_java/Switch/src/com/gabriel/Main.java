package com.gabriel;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int value = 2;
        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }

        int switchValue = 3;
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Was a 3 or a 4 or a 5");
                System.out.println("Actually it was " + switchValue);
                break; // remember this is here to stop it from moving on.
            default:
                System.out.println("Was not a number between 1 and 5");
                break;
        }

        char switchChar = 'D';
        switch (switchChar) {
            case 'A':
                System.out.println("Char was A");
                break;
            case 'B':
                System.out.println("Char was B");
                break;
            case 'C':
            case 'D':
            case 'E':
                System.out.println("Char was " + switchChar);
                break; // remember this is here to stop it from moving on.
            default:
                System.out.println("Char was not A, B, C, D or E");
                break;
        }

//        side note in Java 7 they introduced strings into switch statements
        String month = "January";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "July":
                System.out.println("Happy Birthday");
                break;
            default:
                System.out.println("Not found");
                break;
        }
    }
}
