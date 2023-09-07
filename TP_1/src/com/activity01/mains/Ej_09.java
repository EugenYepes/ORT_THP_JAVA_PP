package com.activity01.mains;
import java.util.Scanner;

public class Ej_09 {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
        System.out.println("Input the first angle of a triangle (between 0 and 180)");
        double angle1 = Double.parseDouble(input.nextLine());
		System.out.println("Input the second angle of a triangle (between 0 and 180)");
        double angle2 = Double.parseDouble(input.nextLine());
		if (angle1 > 0.0 && angle2 > 0.0) {
			if (angle1 < 180.0 && angle2 < 180.0) {
				double angle3 = 180.0 - angle1 - angle2;
				System.out.println("The third angle of the triangle is: " + angle3);
			}
		} else {
			System.out.println("The number for a triangle mus be between 0 and 180 degrees");
		}
		input.close();
	}
}