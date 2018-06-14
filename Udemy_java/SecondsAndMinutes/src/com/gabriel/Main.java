package com.gabriel;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(getDurationString(61, 0));
        System.out.println(getDurationString(130, 58));
        System.out.println(getDurationString(3668));
        System.out.println(getDurationString(3945));
    }

    private static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid value";
        }
        int hours = minutes / 60;
        int remainderMinutes = minutes % 60;
        if (seconds == 0) {
            return (hours + "h " + remainderMinutes + "m " + seconds + "0s");
        }
        return (hours + "h " + remainderMinutes + "m " + seconds + "s");
    }


    private static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid value";
        }
        int minutes = seconds / 60;
        int remainderSeconds = seconds % 60;
        return getDurationString(minutes, remainderSeconds);
    }
}
