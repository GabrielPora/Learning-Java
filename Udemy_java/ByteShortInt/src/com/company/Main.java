package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        byte myByteValue = -128;
        short myShortValue = 3585;
        int myIntValue = 3455325;
        long myLongValue =  (50000L + (10 * (myByteValue + myShortValue + myIntValue)));
        System.out.println("myLongValue = "+myLongValue);

    }
}
