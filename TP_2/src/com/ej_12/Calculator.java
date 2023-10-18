package com.ej_12;

public class Calculator {
    public int add(int num1, int num2) {
        return num1 + num2;
    }

	public int substract(int num1, int num2) {
		return num1 - num2;
	}

	public int multiply(int num1, int num2) {
		return num1 * num2;
	}

	public int division(int num1, int num2) throws IllegalArgumentException {
        int retVal = 0;
		if (num2 != 0) {
			retVal = num1 / num2;
		}
		return retVal;
	}
}
