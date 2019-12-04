package com.company;

public class Main {

    public static void main(String[] args) {
//        int newScore = calculateScore("Zhain", 500);
//        System.out.println("New score is " + newScore);
//
//        calculateScore(75);
//        calculateScore();

        System.out.println(calcFeetAndInchesToCentimeters(13, 0));
        System.out.println(calcFeetAndInchesToCentimeters(-10));
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        return (feet >= 0 && inches >= 0 && inches <= 12) ? ((inches + (feet * 12d)) * 2.54d) : -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        return (inches >= 0) ? calcFeetAndInchesToCentimeters((inches / 12), 0) : -1;
    }


        public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }


}
