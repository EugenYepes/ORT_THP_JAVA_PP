package com.activity02.mains;

import java.util.Scanner;

class Ej_12 {

	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Please enter a number");
		int num1 = input.nextInt();
        System.out.println("Please enter a second number");
		int num2 = input.nextInt();
        
        if (num1 == num2) {
            System.out.println("the numbers are equals");
        } else if (num1 > num2) {
            System.out.println(num1 + "its grater than" + num2);
        } else {
            System.out.println(num1 + "its less than" + num2);
        }
        input.close();
	}
}