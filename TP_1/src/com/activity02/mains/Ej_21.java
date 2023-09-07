package com.activity02.mains;

import java.util.Scanner;

import com.activity02.enums.WeekDays;

class Ej_21 {

	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {

        System.out.println("Please enter the number of the day from 1 to 7. 1 its Sunday");
        int dayNumber = Integer.parseInt(input.nextLine());
        System.out.println("The day " + dayNumber + " is " + WeekDays.getByNumberLowCase(dayNumber));

        input.close();
    }
}