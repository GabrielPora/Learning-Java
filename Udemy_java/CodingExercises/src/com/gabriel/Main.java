package com.gabriel;

import static com.gabriel.PositiveNegativeZero.checkNumber;
import static com.gabriel.MegaBytesConverter.printMegaBytesAndKiloBytes;
import static com.gabriel.BarkingDog.bark;
import static com.gabriel.LeapYearCalculator.isLeapYear;
import static com.gabriel.DecimalComparator.areEqualByThreeDecimalPlaces;
import static com.gabriel.EqualSumChecker.hasEqualSum;
import static com.gabriel.TeenNumberChecker.hasTeen;
import static com.gabriel.AreaCalculator.area;
import static com.gabriel.MinutesToYearsDaysCalculator.printYearsAndDays;
import static com.gabriel.IntEqualityPrinter.printEqual;
import static com.gabriel.PlayingCat.isCatPlaying;

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
        System.out.println(bark(true, 1));
        System.out.println(bark(false, 2));
        System.out.println(bark(true, 8));
        System.out.println(bark(true, -1));

        System.out.println("\nLeapYearCalculator");
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2016));
        System.out.println(isLeapYear(10000));

        System.out.println("\nDecimalComparator");
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.1754));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));

        System.out.println("\nEqualSumChecker");
        System.out.println(hasEqualSum(1, 1, 1));
        System.out.println(hasEqualSum(1, 1, 2));
        System.out.println(hasEqualSum(1, -1, 0));

        System.out.println("\nTeenNumberChecker");
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));

        System.out.println("\nAreaCalculator");
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));

        System.out.println("\nMinutesToYearsDaysCalculator");
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
        printYearsAndDays(-1445);

        System.out.println("\nIntEqualityPrinter");
        printEqual(1, 1, 1);
        printEqual(1, 1, 2);
        printEqual(1, -1, 0);
        printEqual(1, 2, 3);

        System.out.println("\nPlayingCat");
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
        System.out.println(isCatPlaying(true, 45));
    }
}
