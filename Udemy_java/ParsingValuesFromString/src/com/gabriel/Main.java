package com.gabriel;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String numberAsString = "2018";
        System.out.println("numberAsString = " + numberAsString);


        double numberDouble = Double.parseDouble(numberAsString);
        int number = Integer.parseInt(numberAsString);
        System.out.println("number = " + number);

        numberAsString += 9;
        number += 9;
        numberDouble -= 9;
        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);
        System.out.println("numberDouble = " + numberDouble);

    }
}
