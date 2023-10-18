package com.ej_01;

import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        try {
            NumbersOperations nOperations = new NumbersOperations(input);
            System.out.println("Add " + nOperations.add());
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        input.close();
    }
}
