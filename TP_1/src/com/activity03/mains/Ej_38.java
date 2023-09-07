package com.activity03.mains;

import java.util.Scanner;

public class Ej_38 {
    private static Scanner input = new Scanner(System.in);
    private static final String USER = "Admin";
    private static final String PASS = "123456";
    private static final int MAX_ATTEMPTS = 3;
    public static void main(String[] args) {
        int attempts = 0;
        do {
            System.out.println("Please enter the user");
            String user = input.nextLine();
            System.out.println("Please enter the pass");
            String pass = input.nextLine();
            
            attempts++;

            if (USER.equals(user) && PASS.equals(pass)) {
                System.out.println("Login success");
                break;
            } else {
                System.out.println("Fail, wrong user o password, attempts left " + (MAX_ATTEMPTS - attempts));
            }

        } while (attempts < MAX_ATTEMPTS);
    }
}
