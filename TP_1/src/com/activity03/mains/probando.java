package com.activity03.mains;

public class probando {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 9;
        int num3 = 8;
        System.out.println("avarage " + ((double)num1/3 + (double)num2/3 + (double)num3/3));
        System.out.println("avarage " + ((double)(num1 + num2 + num3) / 3));
        int date = 20230321;
        System.out.println(date/10000);
        System.out.println(date%100);
        date /= 100;
        System.out.println(date%100);
        System.out.println(date/100);
    }
}
