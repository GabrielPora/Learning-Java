package com.gabriel;

import static com.gabriel.PositiveNegativeZero.checkNumber;
import static com.gabriel.MegaBytesConverter.printMegaBytesAndKiloBytes;
import static com.gabriel.BarkingDog.bark;
import  static com.gabriel.LeapYearCalculator.isLeapYear;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("PositiveNegativeZero");
        checkNumber(5);
        checkNumber(-5);
        checkNumber(0);

        System.out.println("\nMegaBytesConverter");
        printMegaBytesAndKiloBytes(2050);
        printMegaBytesAndKiloBytes(0);
        printMegaBytesAndKiloBytes(-2);

        System.out.println("\nBarkingDog");
        System.out.println( bark(true,1));
        System.out.println( bark(false, 2));
        System.out.println( bark(true,8));
        System.out.println( bark(true,-1));

        System.out.println("\nLeapYearCalculator");
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2016));
        System.out.println(isLeapYear(10000));

    }
}
