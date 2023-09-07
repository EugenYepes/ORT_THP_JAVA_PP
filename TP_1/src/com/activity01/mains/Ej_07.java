package com.activity01.mains;
import java.util.Scanner;

public class Ej_07 {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Input the length of the field");
		int lenght = input.nextInt();
		System.out.println("Input with of the field");
		int with = input.nextInt();
		System.out.println("Input the value of the square meter");
		int squareMeterValue = input.nextInt();

		System.out.println("The value of the field is:" + (lenght * with * squareMeterValue));
	}
}
