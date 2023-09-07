package com.activity03.mains;

import java.util.Scanner;

class Ej_30 {
	private static Scanner input = new Scanner(System.in);
    public static final int MAJOR_AGE = 18;
	public static void main(String[] args) {
        char operation;
        int num1, num2;
        while (true) {
            System.out.println("Please enter an operaton to do between 2 numbers {+, -, *, /, F} (Close the program with F)");
            operation = input.nextLine().toUpperCase().charAt(0);

            if (operation == 'F') {
                System.out.println("Close the program");
                break;
            } else if (operation == '+' || operation == '-' ||operation == '*' ||operation == '/') {
                System.out.println("Enter a number");
                num1 = Integer.parseInt(input.nextLine());
                System.out.println("Enter the second number");
                num2 = Integer.parseInt(input.nextLine());

                switch (operation) {
                    case '+':
                        System.out.println("The operation is " + operation + " and the result " + (num1 + num2));
                        break;
                    case '-':
                        System.out.println("The operation is " + operation + " and the result " + (num1 - num2));
                        break;
                    case '*':
                        System.out.println("The operation is " + operation + " and the result " + (num1 * num2));
                        break;
                    case '/':
                        if (num2 != 0) {
                            float aux = (float) num1 / num2;
                            System.out.println("The operation is " + operation + " and the result " + aux);
                        } else {
                            System.err.println("ERROR");
                        }
                        break;
                    default:
                        break;
                }
            } else {
                System.err.println("Wrong enter, try again");
            }
        }
        input.close();
    }
}