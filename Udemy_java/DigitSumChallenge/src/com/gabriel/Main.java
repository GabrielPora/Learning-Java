package com.gabriel;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(sumDigit(125));
        System.out.println(sumDigit(1));
        System.out.println(sumDigit(101));
        System.out.println(sumDigit(-123456789));
        System.out.println(sumDigit(98));
    }

    public static int sumDigit(int number) {
        if (number >= 10) {
            int sum = 0;
            int remaining = number;
            while (remaining != 0) {
                sum += remaining % 10;
                remaining = remaining / 10; // same as remaining /= 10;
            }
            return sum;

//            do {
//                sum += remaining % 10;
//                remaining = remaining / 10;
//            }
//            while (remaining != 0);

        } else {
            return -1;
        }
    }
}
