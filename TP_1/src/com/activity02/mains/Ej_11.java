package com.activity02.mains;
import java.util.Scanner;

class Ej_11 {

	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Please enter a number");
		int num = input.nextInt();
        if ((num % 2) == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
        input.close();
	}
}