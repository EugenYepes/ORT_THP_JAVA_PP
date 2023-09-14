package com.activity03.mains;
import java.util.Scanner;
public class claseViernes {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Ingresa un numero");
		int numero = Integer.parseInt(input.nextLine());
		
		System.out.println("Los multiplos del numero ingresado son:");
		// System.out.println(numero * 1);
		// System.out.println(numero * 2);
		// System.out.println(numero * 3);
		// System.out.println(numero * 4);
		// System.out.println(numero * 5);
		// System.out.println(numero * 6);
		// System.out.println(numero * 7);
		// System.out.println(numero * 8);
		// System.out.println(numero * 9);
		// System.out.println(numero * 10);
		for (int numMultiplo = 1; numMultiplo <= 10; numMultiplo++) {
			System.out.println(numero * numMultiplo);
		}
		input.close();
	}
}
