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
import static com.gabriel.NumberInWord.printNumberInWord;
import static com.gabriel.NumberOfDaysInMonth.getDaysInMonth;
import static com.gabriel.Sum3And5Challenge.Sum3And5;
import static src.com.gabriel.SumOddRange.sumOdd;
import static src.com.gabriel.NumberPalindrome.isPalindrome;
import static src.com.gabriel.FirstLastDigitSum.sumFirstAndLastDigit;
import static src.com.gabriel.EvenDigitSum.getEvenDigitSum;
import static src.com.gabriel.SharedDigit.hasSharedDigit;
import static src.com.gabriel.LastDigitChecker.hasSameLastDigit;
import static src.com.gabriel.GreatestCommonDivisor.getGreatestCommonDivisor;
import static src.com.gabriel.FactorPrinter.printFactors;
import static src.com.gabriel.PerfectNumber.isPerfectNumber;
import static src.com.gabriel.NumberToWords.numberToWords;
import static src.com.gabriel.FlourPacker.canPack;
import static src.com.gabriel.LargestPrime.getLargestPrime;

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

        System.out.println("\nNumberInWord");
        printNumberInWord(0);
        printNumberInWord(1);
        printNumberInWord(2);
        printNumberInWord(3);
        printNumberInWord(4);
        printNumberInWord(5);
        printNumberInWord(6);
        printNumberInWord(7);
        printNumberInWord(8);
        printNumberInWord(9);
        printNumberInWord(-8);
        printNumberInWord(10);

        System.out.println("\nEqualSumChecker");
        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));

        System.out.println("\nSum3And5Challenge");
        Sum3And5();

        System.out.println("\nSumOddRange");
        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(1, -100));
        System.out.println(sumOdd(100, 1000));

        System.out.println("\nNumberPalindrome");
        System.out.println(isPalindrome(100));
        System.out.println(isPalindrome(101));
        System.out.println(isPalindrome(123));
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));

        System.out.println("\nFirstLastDigitSum");
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));

        System.out.println("\nEvenDigitSum");
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(257));
        System.out.println(getEvenDigitSum(5));
        System.out.println(getEvenDigitSum(-10));
        System.out.println(getEvenDigitSum(123456789));

        System.out.println("\nSharedDigit");
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(-1, 100));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, -10));
        System.out.println(hasSharedDigit(15, 55));

        System.out.println("\nLastDigitChecker");
        System.out.println(hasSameLastDigit(12, 23,32));
        System.out.println(hasSameLastDigit(-1, 100,10));
        System.out.println(hasSameLastDigit(99, 99,9));
        System.out.println(hasSameLastDigit(15, -10,51));
        System.out.println(hasSameLastDigit(15, 55,45));

        System.out.println("\nGreatestCommonDivisor");
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(-1, 100));
        System.out.println(getGreatestCommonDivisor(19, 99));
        System.out.println(getGreatestCommonDivisor(15, -10));
        System.out.println(getGreatestCommonDivisor(45, 15));

        System.out.println("\nFactorPrinter");
        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(252);
        printFactors(257);
        printFactors(5);
        printFactors(-10);

        System.out.println("\nPerfectNumber");
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));

        System.out.println("\nNumberToWords");
        numberToWords(6);
        numberToWords(28);
        numberToWords(5);
        numberToWords(-1);
        numberToWords(10);
        numberToWords(1000);

        System.out.println("\nFlourPacker");
        System.out.println(canPack(1, 0,4));
        System.out.println(canPack(1, 0,5));
        System.out.println(canPack(0, 5,4));
        System.out.println(canPack(2, 2,12));
        System.out.println(canPack(-3, 2,12));

        System.out.println("\nLargestPrime");
        System.out.println(getLargestPrime(7));
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(31));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
    }
}
