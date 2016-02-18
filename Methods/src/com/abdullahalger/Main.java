package com.abdullahalger;

public class Main {

    public static void main(String[] args) {
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Abdullah", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Roger", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Bill", highScorePosition);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore++;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }

        return -1;
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int score) {

        if (score >= 1000) {
            return 1;
        } else if ((score >= 500) && (score < 1000)) {
            return 2;
        } else if ((score >= 100) && (score < 500)) {
            return 3;
        } else {
            return 4;
        }
    }



}
