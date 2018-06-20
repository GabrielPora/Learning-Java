package com.gabriel;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int count = 1;
        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        for (count = 1; count != 6; count++) {
            System.out.println("Count value is " + count);
        }

        int number = 4;
        int finishNumber = 20;
        int sum = 0;
        count = 0;

        while (number<=finishNumber){
            number++;
            if (!isEvenNumber(number)){
                continue; // will go back to that start of the while loop and continue
            }
            sum +=number;
            count++;
            System.out.println("Even Number "+number);
            if (count==5){
                break;
            }
        }
        System.out.println("Sum = "+sum);

    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
