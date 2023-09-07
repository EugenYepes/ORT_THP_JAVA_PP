package com.activity02.mains;

import java.util.Scanner;

class Ej_16 {

	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
        System.out.println("Please enter the amount of enrolled persons");
        int enrolled = Integer.parseInt(input.nextLine());
        System.out.println("Please enter the amount of seats of the auditorium");
        int seatsAuditorium = Integer.parseInt(input.nextLine());

        if (enrolled >= 0 && seatsAuditorium >= 0) {
            if (enrolled <= seatsAuditorium) {
                System.out.println("There are enough seats for all the enrolled persons");
            } else {
                System.out.println("There arent enough seats, they need " + (enrolled - seatsAuditorium) + " more seats");
            }
        } else {
            System.err.println("ERROR: Imput of negative numbers, abort");
        }

        input.close();
    }
}