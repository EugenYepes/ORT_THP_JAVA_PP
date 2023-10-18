package com.ej_06;

public class Test {
	private static final int SAMPLE_SIZE = 100;
	private static final String GREAT_VALUE_MESSAGE = "The grate value is: ";
	public static void main(String[] args) {
		Dice dice1 =  new Dice();
		Dice dice2 =  new Dice();
		String message;
		int acum1 = 0, acum2 = 0;

		for (int i = 0; i < SAMPLE_SIZE; i++) {
			acum1 += dice1.roll();
			acum2 += dice2.roll();
			if (dice1.getValue() == dice2.getValue()) {
				System.out.println("Both dice have the same value " + dice1.getValue());
			} else {
				if (dice1.getValue() > dice2.getValue()) {
					message = GREAT_VALUE_MESSAGE + dice1.getValue(); 
				} else {
					message = GREAT_VALUE_MESSAGE + dice2.getValue(); 
				}
				System.out.println(message);
			}
		}

		System.out.println("The avarage number of the first dice its " + (double)acum1 / SAMPLE_SIZE);
		System.out.println("The avarage number of the second dice its " + (double)acum2 / SAMPLE_SIZE);
	}
}
