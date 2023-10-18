package com.ej_12;

public class Test {
    public static void main(String[] args) {
        testCalculator();
    }

    private static void testCalculator() {
        Calculator calculator = new Calculator();
        int a = 1;
        int b = 2;

        int result = calculator.add(a, b);
        System.out.println("add(" + a + ", " + b + ") = " + result + " (Expected: 3)");

        result = calculator.substract(a, b);
        System.out.println("substract(" + a + ", " + b + ") = " + result + " (Expected: -1)");

        result = calculator.substract(b, a);
        System.out.println("substract(" + b + ", " + a + ") = " + result + " (Expected: 1)");

        result = calculator.multiply(a, b);
        System.out.println("multiply(" + a + ", " + b + ") = " + result + " (Expected: 2)");

        result = calculator.division(a, b);
        System.out.println("division(" + a + ", " + b + ") = " + result + " (Expected: 0)");

        result = calculator.division(b, a);
        System.out.println("division(" + b + ", " + a + ") = " + result + " (Expected: 2)");

        result = calculator.division(a, 0);
        System.out.println("division(" + a + ", " + 0 + ") = " + result + " (Expected: 0)");

        result = calculator.division(b, 0);
        System.out.println("division(" + b + ", " + 0 + ") = " + result + " (Expected: 0)");

        result = calculator.division(0, a);
        System.out.println("division(" + 0 + ", " + a + ") = " + result + " (Expected: 0)");

        result = calculator.division(0, b);
        System.out.println("division(" + 0 + ", " + b + ") = " + result + " (Expected: 0)");
    }
}
