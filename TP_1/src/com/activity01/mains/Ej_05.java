package com.activity01.mains;
import java.util.Scanner;

public class Ej_05 {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Plase input 2 numbers:");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		System.out.println("The input variable there are: " + num1 + " " + num2);
		int aux = num1;
		num1 = num2;
		num2 = aux;
		System.out.println("The results of swap the number are: " + num1 + " " + num2);
		input.close();
	}
}
