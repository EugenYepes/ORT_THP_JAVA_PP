package com.activity03.mains;

import java.util.Scanner;

public class probando {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // int num1 = 10;
        // int num2 = 9;
        // int num3 = 8;
        // System.out.println("avarage " + ((double)num1/3 + (double)num2/3 + (double)num3/3));
        // System.out.println("avarage " + ((double)(num1 + num2 + num3) / 3));
        // int date = 20230321;
        // System.out.println(date/10000);
        // System.out.println(date%100);
        // date /= 100;
        // System.out.println(date%100);
        // System.out.println(date/100);

        // int date = 0;
        // int prevDate = 0;
        // while (date != -1){
        //     do {
        //         date = Integer.parseInt(input.nextLine());
        //         if (date <= prevDate && date != -1) {
        //             System.out.println("Error fecha menor que la anterior, vuelva a intentarlo");
        //         }
        //     } while (date <= prevDate && date != -1);
        //     prevDate = date;
        //     System.out.println((date/100)%100 + "/" + date%100 + "/" +  date/10000);
        // }

        int mcd = foundMCD(15, 6);
        if (3 == mcd) {
            System.out.println("Success");
        } else {
            System.out.println("Error. Mcd value " + mcd);
        }

        mcd = foundMCD(20, 10);
        if (10 == mcd) {
            System.out.println("Success");
        } else {
            System.out.println("Error. Mcd value " + mcd);
        }

        mcd = foundMCD(5, 7);
        if (1 == mcd) {
            System.out.println("Success");
        } else {
            System.out.println("Error. Mcd value " + mcd);
        }

        // mcd = foudMCD(0, 0);
        // if (0 == mcd) {
        //     System.out.println("Success");
        // } else {
        //     System.out.println("Error. Mcd value " + mcd);
        // }

        mcd = foundMCD(18, 6);
        if (6 == mcd) {
            System.out.println("Success");
        } else {
            System.out.println("Error. Mcd value " + mcd);
        }
        mcd = foundMCD(6, 18);
        if (6 == mcd) {
            System.out.println("Success");
        } else {
            System.out.println("Error. Mcd value " + mcd);
        }
    }

    public static int foundMCD(int num1, int num2) {
        boolean mcdFound = false;
        int mcd;
        // System.out.println("Ingrese un numero entero y positivo");
        // do {
        //     num1 = Integer.parseInt(input.nextLine());
        //     if (num1 < 1) {
        //         System.out.println("ERROR");
        //     }
        // } while (num1 < 1);

        // System.out.println("Ingrese otro numero entero y positivo");
        // do {
        //     num2 = Integer.parseInt(input.nextLine());
        //     if (num2 < 1) {
        //         System.out.println("ERROR");
        //     }
        // } while (num2 < 1);

        if (num1 > num2) {
            int aux = num2;
            num2 = num1;
            num1 = aux;
        }

        for (mcd = num1; mcd >= 1 && !mcdFound; mcd--){
            if ((num1 % mcd) == 0 && (num2 % mcd) == 0) {
                mcdFound = true;
            }
        }
        mcd++;
        return mcd;
    }
}
