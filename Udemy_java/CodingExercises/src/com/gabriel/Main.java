package com.gabriel;

import static com.gabriel.PositiveNegativeZero.checkNumber;
import static com.gabriel.MegaBytesConverter.printMegaBytesAndKiloBytes;
import static com.gabriel.BarkingDog.bark;

public class Main {

    public static void main(String[] args) {
	// write your code here
        checkNumber(5);
        checkNumber(-5);
        checkNumber(0);

        printMegaBytesAndKiloBytes(2050);
        printMegaBytesAndKiloBytes(0);
        printMegaBytesAndKiloBytes(-2);

        System.out.println( bark(true,1));
        System.out.println( bark(false, 2));
        System.out.println( bark(true,8));
        System.out.println( bark(true,-1));
    }
}
