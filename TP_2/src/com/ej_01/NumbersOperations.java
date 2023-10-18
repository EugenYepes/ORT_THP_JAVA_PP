package com.ej_01;

import java.util.Scanner;
public class NumbersOperations {
    private int num1;
    private int num2;
    private Scanner input;

    public NumbersOperations(Scanner input) {
        this.input = input;
        num1 = requestNumber("Please enter a number", 40, 100);
        num2 = requestNumber("Please enter a second number", 40, 100);
    }

    public int add() {
        return num1 + num2;
    }

	public int substract() {
		return num1 - num2;
	}

	
	public int multiply() {
		return num1 * num2;
	}

	public float division() throws IllegalArgumentException {
		if (num2 == 0) {
			throw new IllegalArgumentException("Denominator equals 0");
		}
		return (float)num1 / num2;
	}

    /**
     * request a number. if both limits are 0, no limits apply
     * if lowLimit its greater than the highLimit, swap the values
     * @param msg       message to show when request number
     * @param lowLimit  lower limit
     * @param highLimit higher limit
     * @return
     */
    public int requestNumber(String msg, int lowLimit, int highLimit) {
        int number;
        if (lowLimit == 0 && highLimit == 0) {
            return requestNumber(msg);
        } else if (lowLimit > highLimit) {
            int aux = lowLimit;
            lowLimit = highLimit;
            highLimit = aux;
        }
        do {
            number = requestNumber(msg);
        } while (number < lowLimit || number > highLimit);
        return number;
    }

    private int requestNumber(String msg) {
        System.out.println(msg);
        input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());
        return number;
    }

    public int getNum1() {
        return num1;
    }

    public void setNumOneFromKeyboard(String msg, int lowLimit, int highLimit) {
        this.num1 = requestNumber(msg, lowLimit, highLimit);
    }

    public void setNumOneFromKeyboardWithoputLimits(String msg) {
        this.num1 = requestNumber(msg);
    }

    public int getNum2() {
        return num2;
    }
    
    public void setNumTwoFromKeyboardWithoputLimits(String msg) {
        this.num1 = requestNumber(msg);
    }

    public void setNumTwoFromKeyboard(String msg, int lowLimit, int highLimit) {
        this.num1 = requestNumber(msg, lowLimit, highLimit);
    }
}
