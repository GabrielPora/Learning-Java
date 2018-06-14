package com.gabriel;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        int truncate = 3;
        double temp1 = num1;
        double temp2 = num2;
        temp1 = (((int) (Math.pow(10, truncate) * temp1)) / Math.pow(10, truncate));
        temp2 = (((int) (Math.pow(10, truncate) * temp2)) / Math.pow(10, truncate));
        if (temp1 == temp2) {
            return true;
        } else {
            return false;
        }
    }
}
