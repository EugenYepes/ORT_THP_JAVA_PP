package com.activity03.mains;

import java.util.Scanner;
public class Ej_39 {
    private static Scanner input = new Scanner(System.in);
    private static final int MAX_AMOUNT_SHOOTS = 3;
    private static final int MIN_AMOUNT_PLAYERS = 2;
    // Points
    private static final int POINTS_DIST_0 = 500;
    private static final int POINTS_MIN_10 = 250;
    private static final int POINTS_DIST_50 = 100;
    public static void main(String[] args) {
        int amountPlayers, numShoot, distShoot, points;
        int maxPoints = 0;
        int amountCenterShoots = 0;
        String maxPointsName = "";
        do {
            System.out.println("Please enter the amount of players, more tha 2");
            amountPlayers = Integer.parseInt(input.nextLine());
        } while (amountPlayers < MIN_AMOUNT_PLAYERS);

        for (int i = 0; i < amountPlayers; i++) {
            System.out.println("Please enter the name of the " + (i + 1) + " player");
            String name = input.nextLine();
            numShoot = 0;
            points = 0;
            while (numShoot < MAX_AMOUNT_SHOOTS) {
                do {
                    System.out.println("Distances to the center of the " + (numShoot + 1) + " of " + name);
                    distShoot = Integer.parseInt(input.nextLine());
                } while (distShoot < 0);

                numShoot++;
                if (distShoot == 0) {
                    points += POINTS_DIST_0;
                    amountCenterShoots++;
                } 
                if (distShoot > 0 && distShoot <= 10) {
                    points += POINTS_MIN_10;
                }
                if (distShoot >= 11 && distShoot <= 50) {
                    points += POINTS_DIST_50;
                }
            }
            if (points > maxPoints) {
                maxPoints = points;
                maxPointsName = name;
            }
        }
        System.out.println("The winner is " + maxPointsName + " and have " + maxPoints + " points!");
        System.out.println("The amount of shoots to the target " + amountCenterShoots);
        input.close();
    }
}
