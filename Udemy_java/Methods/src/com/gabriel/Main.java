package com.gabriel;

public class Main {

    public static void main(String[] args) {
        // write your code here
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculatePrintScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);


        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculatePrintScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Gabe", position);

        position = calculateHighScorePosition(900);
        displayHighScorePosition("Jack", position);

        position = calculateHighScorePosition(400);
        displayHighScorePosition("Max", position);

        position = calculateHighScorePosition(50);
        displayHighScorePosition("Test", position);

    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position "
                + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int highScore) {
        int position = 4; // assuming the worse case
        if (highScore >= 1000) {
            position = 1;
        } else if (highScore >= 500) {
            position = 2;
        } else if (highScore >= 100) {
            position = 3;
        }
        return position;
    }

    public static int calculatePrintScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            return finalScore;
        } else {
            return -1;
        }
    }
}
