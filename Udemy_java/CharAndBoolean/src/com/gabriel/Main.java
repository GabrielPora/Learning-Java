package com.gabriel;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // width of 16 (2 bytes)
        char myCharC = '\u00AE';
        System.out.println("printing out unicode " + myCharC);


        char myCharR = '\u00AE';
        System.out.println("printing out unicode registered symbol " + myCharR);

        boolean myBoolean = true;
    }
}
