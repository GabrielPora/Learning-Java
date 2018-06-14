package com.gabriel;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int newScore = calculateScore("Gabe", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
        System.out.println(calcFeetAndInchesToCentimeters(5,9)+ "cm");
        System.out.println(calcFeetAndInchesToCentimeters(0,0));
        System.out.println(calcFeetAndInchesToCentimeters(50));
        System.out.println(calcFeetAndInchesToCentimeters(47f));
        System.out.println(calcFeetAndInchesToCentimeters(100d));
        System.out.println(calcFeetAndInchesToCentimeters(100f));
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points!");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player  scored " + score + " points!");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player scored! ");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || inches < 0 || inches > 12) {
            return -1;
        }
        double tempInches = feet * 12;
        return (inches + tempInches) * 2.54;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }
        double remainderInches = inches % 12d;
        double feet = (int)inches / 12;
        return  calcFeetAndInchesToCentimeters(feet,  remainderInches);
    }

//    This works as we can still use the same method name but change our type and it will work
//    This is possible with System.out.println(); as it uses method overloading too
//        System.out.println("Hello");
//        System.out.println(5);
//        System.out.println(10.5);
//    It is able to handle the different types. 


    public static float calcFeetAndInchesToCentimeters(float inches) {
        if (inches < 0) {
            return -1;
        }
        float remainderInches = inches % 12;
        int wholeNumber = (int)inches / 12;
        if (remainderInches > 10){
            remainderInches= remainderInches/10;
        }
        remainderInches= remainderInches/10;
        float answer = wholeNumber+remainderInches;
        return  answer;
    }
}
