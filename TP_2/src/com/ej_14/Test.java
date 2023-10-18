package com.ej_14;

import java.util.Scanner;

public class Test {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        double note;
        Avarage av = new Avarage();
        do {
            do {
                System.out.println("Plese enter a note between 0 and 10. -1 to exit");
                note = Double.parseDouble(input.nextLine());
            } while ((note < 0.0 || note > 10.0) && !(note == -1.0));
            if (note != -1.0) {
                av.increase(note);
            }
        } while (note != -1.0);
        System.out.println("The varage note is: " + av.getValue());
    }
}
