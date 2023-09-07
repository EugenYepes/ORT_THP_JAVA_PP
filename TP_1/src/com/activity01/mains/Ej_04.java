package com.activity01.mains;
import java.util.Scanner;

public class Ej_04 {
	private static Scanner input = new Scanner(System.in);
	private static final int DAYS_WEEK = 5;
	public static void main(String[] args) {
		System.out.println("Input the salary of one working hour:");
		int salaryHour = input.nextInt();
		System.out.println("Input the amount of hours worked in one day:");
		int workedHoursDay = input.nextInt();
		float salaryWeek = (float)salaryHour * workedHoursDay * DAYS_WEEK + salaryHour * workedHoursDay * 1/2;
		System.out.println("The salary for one week is: " + salaryWeek);
		input.close();
	}
}