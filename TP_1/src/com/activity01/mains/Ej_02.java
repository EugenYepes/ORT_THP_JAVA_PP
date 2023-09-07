package com.activity01.mains;
import java.util.Scanner;

public class Ej_02 {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int[] notes = new int[3];
		System.out.println("Input the 3 notes of an exam: ");
		notes[0] = input.nextInt();
		notes[1] = input.nextInt();
		notes[2] = input.nextInt();
		float avarage = (float)(notes[0] + notes[1] + notes[2]) / 3;
		System.out.println("The avarage note is: " + avarage);
		input.close();
	}
}
