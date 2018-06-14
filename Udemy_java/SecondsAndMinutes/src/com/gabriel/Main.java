package com.gabriel;

import org.omg.CORBA.INVALID_ACTIVITY;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        // write your code here
        System.out.println(getDurationString(61, 0));
        System.out.println(getDurationString(130, 58));
        System.out.println(getDurationString(3668));
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(-61, 0));
        System.out.println(getDurationString(130, -58));
    }

    private static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return INVALID_VALUE_MESSAGE;
        }
        int hours = minutes / 60;
        int remainderMinutes = minutes % 60;
        String hoursString = checkString(hours, "h");
        String minutesString = checkString(remainderMinutes, "m");
        String secondsString = checkString(seconds, "s");
        return (hoursString + " " + minutesString + " " + secondsString);
    }

    private static String checkString(int value, String timeString) {
        timeString = value + timeString;
        if (value <= 9) {
            timeString = "0" + timeString;
        }
        return timeString;
    }


    private static String getDurationString(int seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }
        int minutes = seconds / 60;
        int remainderSeconds = seconds % 60;
        return getDurationString(minutes, remainderSeconds);
    }
}
