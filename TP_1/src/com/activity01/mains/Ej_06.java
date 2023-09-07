package com.activity01.mains;
import java.util.Scanner;

public class Ej_06 {
	private static Scanner input = new Scanner(System.in);
	private static final double BASIC_SALARY = 44000.0;
	public static void main(String[] args) {
		System.out.println("Plase input the amount of money of sales along one month");
		double amountMoneySales = Double.parseDouble(input.nextLine());
		double earnsMonth = BASIC_SALARY + amountMoneySales * 0.16;
		System.out.println("The salary of one month is: " + earnsMonth + " USD");
		input.close();
	}
}
