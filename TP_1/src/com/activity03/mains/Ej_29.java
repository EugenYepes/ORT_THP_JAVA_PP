package com.activity03.mains;

import java.util.Scanner;

class Ej_29 {
	private static Scanner input = new Scanner(System.in);
    public static final int MAJOR_AGE = 18;
	public static void main(String[] args) {
        int calification;
        do {
            System.out.println("Please enter the calification of the exam");
            calification = Integer.parseInt(input.nextLine());
        } while (calification < 0 || calification > 10);
        System.out.println("The calification is: " + calification);
        input.close();
    }
}