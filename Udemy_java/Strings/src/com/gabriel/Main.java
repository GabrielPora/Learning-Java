package com.gabriel;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String myString = "This is a String.\n";
        System.out.println(myString);
        // this is how to append to the string
        myString = myString + "This has been added afterwards";
        System.out.println(myString);
        myString = myString + " \u00AE 2018";
        System.out.println(myString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("This is the lastString output: " + lastString);

        // To address this issue we can use
        myInt = myInt + Integer.parseInt(lastString);
        lastString = "" + myInt;
        System.out.println(lastString);

    }
}
