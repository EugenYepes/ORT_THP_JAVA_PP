package com.activity01.mains;
import java.util.Scanner;

class Ej_01 {

	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Please enter your name");
		String name = scan.nextLine();
		System.out.println("Welcome " + name + "!");
		scan.close();
	}
}
