package com.activity03.mains;

import java.util.Scanner;

class Ej_24 {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) { 
        int num1, num2;
        StringBuilder outMessage = new StringBuilder();
        do {
            System.out.println("Plese enter a number: ");
            num1 = Integer.parseInt(input.nextLine());
            System.out.println("Plese enter another number: ");
            num2 = Integer.parseInt(input.nextLine());
        } while (num1 > num2);

        outMessage.append("[");
        for (int i = num1; i <= num2; i++) {
            outMessage.append(i + ", ");
        }
        outMessage.setCharAt(outMessage.length() - 2, ']');
        System.out.println(outMessage.toString());

        outMessage = new StringBuilder();
        outMessage.append("(");
        for (int i = num1 + 1; i < num2; i++) {
            outMessage.append(i + ", ");
        }
        outMessage.setCharAt(outMessage.length() - 2, ')');
        System.out.println(outMessage.toString());

        input.close();
    }
}
