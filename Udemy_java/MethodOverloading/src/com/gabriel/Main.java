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
        System.out.println(calcFeetAndInchesToCentimeters(47));
        System.out.println(calcFeetAndInchesToCentimeters(100));
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

//    public static double calcFeetAndInchesToCentimeters(double inches) {
//        if (inches < 0) {
//            return -1;
//        }
//        double remainderInches = inches % 12d;
//        int wholeNumber = (int)inches / 12;
//        if (remainderInches > 10){
//            remainderInches= remainderInches/10;
//        }
//        remainderInches= remainderInches/10;
//        double answer = wholeNumber+remainderInches;
//        return  answer;
//    }
}
