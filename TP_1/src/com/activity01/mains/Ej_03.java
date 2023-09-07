package com.activity01.mains;
import java.util.Scanner;

public class Ej_03 {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Input a number:");
		int num = input.nextInt();
		System.out.println("The result of: " + num + " * 5 = " + num * 5 + "\nThe result of: " + num + " / 2 = " + (float)num/2);
		input.close();
	}
}