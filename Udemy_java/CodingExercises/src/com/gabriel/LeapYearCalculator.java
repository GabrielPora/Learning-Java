package com.gabriel;

public class LeapYearCalculator {
    public static boolean isLeapYear(int year) {
        if ((year < 1) || (year > 9999)) {
            return false;
        }
        int remainder = 0;
        int divBy100 = 0;
        int divBy400 = 0;
        remainder = year % 4;
        divBy100 = year % 100;
        divBy400 = year % 400;

        if (year >= 400) {
            if ((remainder == 0) && ((divBy100 != 0) || (divBy400 == 0))) {
                return true;
            }
        } else {
            if ((remainder == 0) && (divBy100 != 0)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
