package com.activity02.mains;

import java.util.Scanner;

class Ej_18 {

	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
        System.out.println("Please enter a number");
        int num1 = Integer.parseInt(input.nextLine());
        System.out.println("Please enter a second number");
        int num2 = Integer.parseInt(input.nextLine());

        try {
            // get the greatest number and put it in the num1
            if (num2 > num1) {
                int aux = num1;
                num1 = num2;
                num2 = aux;
            }

            if ((num1 % num2) == 0) {
                System.out.println("The number " + num1 + " is divisible by " + num2);
            }
        } catch (Exception e) {
            System.err.println(e);
        }

        input.close();
    }
}