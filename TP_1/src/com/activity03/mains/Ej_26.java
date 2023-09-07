package com.activity03.mains;

import java.util.Scanner;

class Ej_26 {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
        int number;
        int amountMultiples = 0;
        do {
            System.out.println("Please enter the amount of multiples");
            number = Integer.parseInt(input.nextLine());
        } while (number < 0 );

        for (int i = 0; amountMultiples < number; i++) {
            if ((i % 3) == 0 && (i % 5) != 0) {
                System.out.println(i);
                amountMultiples++;
            }
        }
        input.close();
    }
}