package com.activity03.mains;

import java.util.Scanner;


class Ej_28 {
	private static Scanner input = new Scanner(System.in);
    public static final int MAJOR_AGE = 18;
	public static void main(String[] args) {
        int amountNumbers;
        do {
            System.out.println("Please enter the amount of numbers to input");
            amountNumbers = Integer.parseInt(input.nextLine());
        } while (amountNumbers <= 0);

        int[] numbers = new int[amountNumbers];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter a number");
            numbers[i] = Integer.parseInt(input.nextLine());
        }

        // get the greatest number 
        int greatNumber = 0x80000000;
        int positionGreatNumber = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > greatNumber) {
                greatNumber = numbers[i];
                positionGreatNumber = i;
            }
        }

        System.out.println("The great number is: " + greatNumber + "\n" + "its in the " + (positionGreatNumber + 1));
        input.close();
    }
}