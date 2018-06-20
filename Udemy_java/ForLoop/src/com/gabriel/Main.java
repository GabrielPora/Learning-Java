package com.gabriel;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("10,000 at 1% interest = " + calculateInterest(10000d, 1d));
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000d, 2d));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000d, 3d));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10000d, 4d));

//        for(int i = 0; i<5; i++){
//            System.out.println("10,000 at "+ i +"% interest = "+calculateInterest(10000d,i*1d));
//        }
        for (int i = 2; i <= 8; i++) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000d, i)));
        }

        System.out.println("*********************************#####################################*********************************");

        for (int i = 8; i >= 2; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000d, i)));
        }

        int count = 0;
        for (int i = 10; i <= 50; i++) {
            if (isPrime(i)) {
                System.out.println("Number "+i+" is a prime number");
                count++;
            }
            if (count == 10) {
                System.out.println("Exiting for loop");
                break;
            }
        }

    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
