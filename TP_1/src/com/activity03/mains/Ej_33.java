package com.activity03.mains;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej_33 {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        while (true) {
            System.out.println("Please enter numbers, finish with 0)");
            int number = Integer.parseInt(input.nextLine());
            if (number == 0) {
                break;
            }
            numbers.add(number);
        }

        int minNumber = 0x7FFFFFFF;
        int maxNumber = 0x80000000;
        for (Integer number : numbers) {
            if (number < minNumber) {
                minNumber = number;
            }
            if (number > maxNumber) {
                maxNumber = number;
            }
        }
        System.out.println("Maximun number: " + maxNumber);
        System.out.println("Lowest number: " + minNumber);
        input.close();
    }
}
