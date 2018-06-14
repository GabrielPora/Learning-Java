package com.gabriel;

public class TeenNumberChecker {
    public static boolean hasTeen(int num1, int num2, int num3) {
        int checkMin = 13;
        int checkMax = 19;
        if (num1 >= checkMin && num1 <= checkMax) {
            return true;
        } else if (num2 >= checkMin && num2 <= checkMax) {
            return true;
        } else if (num3 >= checkMin && num3 <= checkMax) {
            return true;
        } else {
            return false;
        }
    }
}
