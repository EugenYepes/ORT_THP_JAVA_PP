package com.activity01.mains;
import java.util.Scanner;

public class Ej_08 {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
        System.out.println("Input one number");
        double num1 = Double.parseDouble(input.nextLine());
		System.out.println("Input a second number");
        double num2 = Double.parseDouble(input.nextLine());
		System.out.println("Add: " + num1 + " + " + num2 + " = " + add(num1, num2));
		System.out.println("Subtract: " + num1 + " + " + num2 + " = " + substract(num1, num2));
		System.out.println("Multiply: " + num1 + " + " + num2 + " = " + multiply(num1, num2));
		try {
			System.out.println("Add: " + num1 + " + " + num2 + " = " + division(num1, num2));
			input.close();
		} catch (Exception e){
			System.err.println(e.toString());
			input.close();
		}
	}

	public static double add(double num1, double num2) {
		return num1 + num2;
	}

	public static double substract(double num1, double num2) {
		return num1 - num2;
	}

	
	public static double multiply(double num1, double num2) {
		return num1 * num2;
	}

	public static double division(double num1, double num2) throws IllegalArgumentException {
		if (num2 == 0) {
			throw new IllegalArgumentException("Denominator equals 0");
		}
		return num1 - num2;
	}
}
