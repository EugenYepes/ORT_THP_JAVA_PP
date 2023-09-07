package com.activity02.mains;

import java.util.Scanner;

class Ej_17 {

	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
        System.out.println("Please enter your age. (1 - 120)");
        int age = Integer.parseInt(input.nextLine());
        System.out.println("Please enter your gender. (M - F) ");
        char gender = input.next().toUpperCase().charAt(0);

        if ((age >= 0 || age <= 120) && (gender == 'M' || gender == 'F')) {
            if (gender == 'M' && age >= 65) {
                System.out.println("You can retire");
            } else if (gender == 'F' && age >= 60) {
                System.out.println("You can retire");
            }
        } else {
            System.err.println("ERROR: Age out of range or invalid gender");
        }

        input.close();
    }
}