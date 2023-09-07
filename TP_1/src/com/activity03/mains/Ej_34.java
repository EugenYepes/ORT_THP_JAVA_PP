package com.activity03.mains;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej_34 {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        List<Double> heigths = new ArrayList<>();
        while (true) {
            System.out.println("Please enter the heigth of bascket players, finish with 0)");
            Double heigth = Double.parseDouble(input.nextLine());
            if (heigth == 0) {
                break;
            }
            heigths.add(heigth);
        }

        Double avarage = 0.0;
        for (Double heigth : heigths) {
            avarage += heigth;
        }
        System.out.println("The avarage heigth " + avarage / heigths.size());
        input.close();
    }
}