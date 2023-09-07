package com.activity02.mains;

import java.util.Scanner;

class Ej_20 {

	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {

        System.out.println("Please enter a number");
        int num1 = Integer.parseInt(input.nextLine());
        System.out.println("Input the operation to do between the to numbers");
        char operationSymbol = input.nextLine().toUpperCase().charAt(0);
        System.out.println("Please enter an other number number");
        int num2 = Integer.parseInt(input.nextLine());

        switch (operationSymbol) {
            case '+':
                System.out.println("The operation is " + operationSymbol + " and the result " + (num1 + num2));
                break;
            case '-':
                System.out.println("The operation is " + operationSymbol + " and the result " + (num1 - num2));
                break;
            case '*':
                System.out.println("The operation is " + operationSymbol + " and the result " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    float aux = (float) num1 / num2;
                    System.out.println("The operation is " + operationSymbol + " and the result " + aux);
                } else {
                    System.out.println("ERROR");
                }
                break;
            default:
                break;
        }
        input.close();
    }
}