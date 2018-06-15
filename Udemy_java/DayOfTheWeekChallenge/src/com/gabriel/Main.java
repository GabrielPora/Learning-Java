package com.gabriel;

public class Main {

    public static void main(String[] args) {
        // write your code here
        printDayOfTheWeek(5);
        printDayOfTheWeek(8);
        printDayOfTheWeek(0);
        printDayOfTheWeek(-1);

        System.out.println("\nDoing the Advance section");
        advancePrintDayOfTheWeek(5);
        advancePrintDayOfTheWeek(8);
        advancePrintDayOfTheWeek(0);
        advancePrintDayOfTheWeek(-1);
    }

    public static void printDayOfTheWeek(int day) {
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }


    //    Honestly I got bored so I decided to use an array to point to the correct day.
    public static void advancePrintDayOfTheWeek(int day) {
        if (day > 6 || day < 0) {
            System.out.println("Invalid day");
            return;
        }
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println(daysOfWeek[day]);
    }
}
