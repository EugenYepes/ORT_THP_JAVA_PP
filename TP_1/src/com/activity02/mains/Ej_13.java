package com.activity02.mains;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.activity01.enums.*;

class Ej_13 {

	private static Scanner input = new Scanner(System.in);
    private static final int MAX_NUM = 3;
	public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();
        for (int i = 0; i < MAX_NUM; i++) {
            System.out.println("Enter the " + EnumNumbers.getByNumberLowCase(i + 1) + "number");
            int num = input.nextInt();
            numList.add(num);
        }

        System.out.println("The max number is: " + maxNumber(numList));
        input.close();
	}

    public static int maxNumber(List<Integer> numList) {
        int maxNum = 0x80000000;
        for (int i = 0; i < numList.size(); i++) {
            if (numList.get(i) > maxNum) {
                maxNum = numList.get(i);
            }
        }
        return maxNum;
    }
}