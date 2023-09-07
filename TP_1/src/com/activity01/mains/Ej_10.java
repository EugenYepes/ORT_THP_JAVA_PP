package com.activity01.mains;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

import com.activity01.enums.*;

public class Ej_10 {
	private static Scanner input = new Scanner(System.in);
    private final static int MAX_CONTRIBUTORS = 3;
	public static void main(String[] args) {
        Map<String, Double> map = new HashMap<String, Double>();
        for (int i = 0; i < MAX_CONTRIBUTORS; i++) {
            System.out.println("Input the " + EnumNumbers.getByNumberLowCase(i + 1) + " name:");
            String name = input.nextLine();
            System.out.println("Input the contribution of " + name + ":");
            Double contribution = Double.parseDouble(input.nextLine());
            map.put(name, contribution);
        }
        Double allContribution = 0.0;
        for (Map.Entry<String, Double> set: map.entrySet()) {
            allContribution += set.getValue();
        }
        for (Map.Entry<String, Double> set: map.entrySet()) {
            System.out.println(set.getKey() + " contributions is: " + (set.getValue() / allContribution) * 100 + "%");
        }
        input.close();
	}
}