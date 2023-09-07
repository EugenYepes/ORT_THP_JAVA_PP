package com.activity03.mains;

import java.util.Scanner;

public class Ej_37 {
    private static Scanner input = new Scanner(System.in);
    private static final int MAX_NUMBERS = 12;
    public static void main(String[] args) {
        int salary, accumSalary = 0, month = 0;

        do {
            System.out.println("Please input the salary of month " + (month + 1));
            salary = Integer.parseInt(input.nextLine());
            accumSalary += salary;
            month++;
        } while (month < MAX_NUMBERS && salary > 0);

        System.out.println("the accumulated salary is: " + accumSalary);

        input.close();
    }
}
