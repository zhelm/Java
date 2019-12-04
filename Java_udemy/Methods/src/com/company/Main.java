package com.company;

public class Main {

    public static void main(String[] args) {

//        int highScore = calculateScore(true, 800, 5, 100);
//        System.out.println(highScore);
//
//        highScore = calculateScore(true, 10000, 8, 200);
//        System.out.println(highScore);
        displayHighScorePosition("Zhain", calculateHighScorePosition(1500));
        displayHighScorePosition("Zhain", calculateHighScorePosition(900));
        displayHighScorePosition("Zhain", calculateHighScorePosition(400));
        displayHighScorePosition("Zhain", calculateHighScorePosition(50));

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int score) {
//        if (score >= 1000){
//            return 1;
//        } else if (score >= 500) {
//            return 2;
//        } else if (score >= 100) {
//            return 3;
//        }
//        return 4;
//    }

        int position = 4;
        if (score >= 1000){
            position = 1;
        } else if (score >= 1000){
            position = 2;
        } else if (score >= 1000){
            position = 3;
        }
        return position;

    }
}
