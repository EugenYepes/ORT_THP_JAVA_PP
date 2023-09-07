package com.activity03.mains;

import java.util.Scanner;

public class Ej_36 {
    private static Scanner input = new Scanner(System.in);
    private static final double MAX_AVARAGE = 20.0;
    public static void main(String[] args) {
        int number, amountNumbers = 0, accumNumbers = 0;
        double avarage = 0.0;
        while (avarage < MAX_AVARAGE) {
            System.out.println("Please enter a number");
            number = Integer.parseInt(input.nextLine());
            accumNumbers += number;
            amountNumbers++;
            avarage = accumNumbers / amountNumbers;
        }
        System.out.println("The amount of values is: " + amountNumbers);
        input.close();
    }
}
