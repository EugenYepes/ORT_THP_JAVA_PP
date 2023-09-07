package com.activity03.mains;

import java.util.Scanner;

class Ej_23 {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
        System.out.println("Plese enter a number: ");
        int number = Integer.parseInt(input.nextLine());
        int numMultiples = 0;

        for (int i = 1; numMultiples <= 10 && i <= number; i++) {
            if ((number % i) == 0) {
                System.out.print(number / i + "\t");
                numMultiples++;
            }
        }
        input.close();
    }
}
