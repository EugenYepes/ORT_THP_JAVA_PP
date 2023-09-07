package com.activity02.mains;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.activity01.enums.*;
import com.activity02.classes.*;

class Ej_14_15 {

	private static Scanner input = new Scanner(System.in);
    private static final int MAX_ITEMS = 4;
	public static void main(String[] args) {
        List<Child> children = new ArrayList<>();
        for (int i = 0; i < MAX_ITEMS; i++) {
            System.out.println("Please enter the data of the " + EnumNumbers.getByNumberLowCase(i + 1) + " child:");
            System.out.print("Name: ");
            String name = input.nextLine();
            System.out.print("Last name: ");
            String lastName = input.nextLine();
            System.out.print("Age: ");
            int age = Integer.parseInt(input.nextLine());
            System.out.print("Height: ");
            double height = Double.parseDouble(input.nextLine());
            Child child = new Child(name, lastName, age, height);
            children.add(child);
        }

        for(Child child: children) {
            if (child.getAge() >= 7 && child.getHeight() > 1.50) {
                System.out.println("The child " + child.getName() + " can enter to \"Infierno en las alturas\"");
                System.out.println(child.toString());
            }
            // Ej 15 TP 1
            if (child.getAge() >= 6 && child.getHeight() > 1.50) {
                System.out.println("The child " + child.getName() + " can enter to \"Infierno en las alturas\"");
                System.out.println(child.toString());
            }
            System.out.println("********************************************************************************");
        }

        input.close();
    }
}