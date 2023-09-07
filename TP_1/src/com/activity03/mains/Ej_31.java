package com.activity03.mains;

import java.util.Scanner;

class Ej_31 {
	private static Scanner input = new Scanner(System.in);
    public static final int MAJOR_AGE = 18;
	public static void main(String[] args) {
        goodWay();
        wrongWay();
        input.close();
    }

    public static void wrongWay() {
        boolean conti = true;
        char yesOrNo;
        System.out.println("Do you want to continue? [S/N]");
        yesOrNo = input.nextLine().toUpperCase().charAt(0);
        if (yesOrNo == 'S' || yesOrNo == 'N') {
            System.out.println("To the next page");
            conti = false;
        }
        while (conti) {
            System.out.println("Do you want to continue? [S/N]");
            yesOrNo = input.nextLine().toUpperCase().charAt(0);
            if (yesOrNo == 'S' || yesOrNo == 'N') {
                System.out.println("To the next page");
                conti = false;
            }
        }
    }

    public static void goodWay() {
        boolean conti = true;
        char yesOrNo;
        do {
            System.out.println("Do you want to continue? [S/N]");
            yesOrNo = input.nextLine().toUpperCase().charAt(0);
            if (yesOrNo == 'S' || yesOrNo == 'N') {
                System.out.println("To the next page");
                conti = false;
            }
        } while (conti);
    }
}