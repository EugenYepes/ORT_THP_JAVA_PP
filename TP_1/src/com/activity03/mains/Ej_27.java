package com.activity03.mains;

import java.util.Scanner;

import com.activity01.enums.*;

class Ej_27 {
	private static Scanner input = new Scanner(System.in);
    public static final int MAJOR_AGE = 18;
	public static void main(String[] args) {
        int[] age = new int[5];
        int amountMajorAges = 0;
        for (int i = 0; i < age.length; i++) {
            do {
                System.out.println("Please enter the " + EnumNumbers.getByNumberLowCase(i + 1) + " age");
                age[i] = Integer.parseInt(input.nextLine());
            } while (age[i] < 0 || age[i] > 120);
        }

        float avarage = 0;
        for (int i = 0; i < age.length; i++) {
            avarage += (float)age[i];
        }
        avarage = (float) avarage / age.length;

        System.out.println("The avarage of the ages is " + avarage);

        for (int i = 0; i < age.length; i++) {
            if (age[i] > MAJOR_AGE && age[i] % 2 != 0) {
                amountMajorAges++;
            }
        }
        System.out.println("The amount of major ages and odd ages are: " + amountMajorAges);
        input.close();
    }
}