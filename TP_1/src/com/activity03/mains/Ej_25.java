package com.activity03.mains;

import java.util.Scanner;

class Ej_25 {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
        int with, height;
        do {
            System.out.println("Please enter the with");
            with = Integer.parseInt(input.nextLine());
            System.out.println("Please enter the height");
            height = Integer.parseInt(input.nextLine());
        } while (with < 0 && height < 0);

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < with; j++) {
                System.out.print("+" + "  ");
            }
            System.out.println();
        }
        input.close();
    }
}
