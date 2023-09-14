package com.activity03.mains;

import java.util.Scanner;

class Ej_23 {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
        System.out.println("Plese enter a number: ");
        int number = Integer.parseInt(input.nextLine());
        System.out.println("The multiples of " + number + " are");
		for (int numMultiple = 1; numMultiple <= 10; numMultiple++) {
			System.out.print(number * numMultiple + "\t");
		}
        input.close();
    }
}
