package com.gabriel;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // width of int = 32 (4 bytes)
        int myIntValue = 5 / 3;
        // width of float = 32 (4 bytes)
        float myFloatValue = 5f / 3f;
        // width of double = 64 (8 bytes)
        double myDoubleValue = 5d / 3d;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        double pounds = 200d;
        double kilogram = pounds * 0.45359237d;
        System.out.println("kilogram = " + kilogram);


    }
}
