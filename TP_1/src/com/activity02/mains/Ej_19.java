package com.activity02.mains;

import java.util.Scanner;

import com.activity01.enums.*;

class Ej_19 {

	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
        int amountNumbers;
        boolean isOneDigit = false;
        boolean isOdd = false;
        boolean isBoth = false;
        boolean isNotBoth = false;
        do {
            System.out.println("Please enter the amount of number you will test the program");
            amountNumbers = Integer.parseInt(input.nextLine());
        } while (amountNumbers < 0);
        
        int[] numbers = new int[amountNumbers];

        for (int i = 0; i < amountNumbers; i++) {
            System.out.println("Please enter the " + EnumNumbers.getByNumberLowCase(i + 1) + " number");

            numbers[i] = Integer.parseInt(input.nextLine());
        }

        for (int i = 0; i < amountNumbers; i++) {
            if ((numbers[i]/10) == 0) {
                isOneDigit = true;
            } 
            if ((numbers[i] % 2) != 0) {
                isOdd = true;
            }
            if (isOneDigit && isOdd) {
                isBoth = true;
            } 
            if (!isOdd && !isOneDigit) {
                isNotBoth = true;
            }

            // show results
            System.out.println("The number: " + numbers[i] + "\n" + 
                                "isOneDigit: " + isOneDigit + "\n" + 
                                "isOdd: " + isOdd + "\n" + 
                                "isBoth: " + isBoth + "\n" + 
                                "isNotBoth: " + isNotBoth + "\n");
            isOneDigit = false;
            isOdd = false;
            isBoth = false;
            isNotBoth = false;
        }
        input.close();
    }
}