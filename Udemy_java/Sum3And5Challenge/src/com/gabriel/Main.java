package com.gabriel;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                sum = sum + i; // same as sum += i
                System.out.println("Number " + i + " is dividable by 3 and 5");
                count++;
            }
            if (count == 5) {
                System.out.println("Exiting loop");
                break;
            }
        }
        System.out.println("Sum = "+ sum);
    }
}
