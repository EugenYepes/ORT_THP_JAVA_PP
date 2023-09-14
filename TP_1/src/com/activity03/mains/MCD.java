package com.activity03.mains;

public class MCD {
    public static void main(String[] args) {
        // Define the numbers for testing
        int[] numbersA = { 35, 18, 0, 0, -20, 1013, 42, 123456, 37, 987654321 };
        int[] numbersB = { 48, 24, 42, 0, 30, 1019, 42, 654321, 144, 123456789 };

        // Repeat the test multiple times to get an average time
        int numTests = 1000;
        long totalElapsedTime = 0;

        testGCD();
        testMyMCD();


        for (int i = 0; i < numTests; i++) {
            for (int j = 0; j < numbersA.length; j++) {
                int a = numbersA[j];
                int b = numbersB[j];

                long startTime = System.nanoTime();
                int result = getMCD(a, b);
                long endTime = System.nanoTime();

                long elapsedTime = endTime - startTime;
                totalElapsedTime += elapsedTime;
            }
        }

        // Calculate and print the average time
        long averageTime = totalElapsedTime / (numTests * numbersA.length);
        System.out.println("Average Execution Time: " + averageTime + " nanoseconds");

        for (int i = 0; i < numTests; i++) {
            for (int j = 0; j < numbersA.length; j++) {
                int a = numbersA[j];
                int b = numbersB[j];

                long startTime = System.nanoTime();
                int result = getMyMCD(a, b);
                long endTime = System.nanoTime();

                long elapsedTime = endTime - startTime;
                totalElapsedTime += elapsedTime;
            }
        }

        // Calculate and print the average time
        averageTime = totalElapsedTime / (numTests * numbersA.length);
        System.out.println("Average Execution Time: " + averageTime + " nanoseconds");
    }

    public static int getMCD(int num1, int num2) {
        int a = num1;
        int b = num2;
        while (b != 0) {
            int residuo = a % b;

            a = b;
            b = residuo;
        }
        return a;
    }

    public static int getMyMCD(int num1, int num2) {
        int mcd;
        boolean mcdFound = false;

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

    public static void testGCD() {
        // Test case 1
        int result1 = getMCD(35, 48);
        System.out.println("getMCD(35, 48) = " + result1 + " (Expected: 1)");

        // Test case 2
        int result2 = getMCD(18, 24);
        System.out.println("getMCD(18, 24) = " + result2 + " (Expected: 6)");

        // Test case 3
        int result3 = getMCD(0, 42);
        System.out.println("getMCD(0, 42) = " + result3 + " (Expected: 42)");

        // Test case 4
        int result4 = getMCD(0, 0);
        System.out.println("getMCD(0, 0) = " + result4 + " (Expected: 0)");

        // Test case 5
        int result5 = getMCD(-20, 30);
        System.out.println("getMCD(-20, 30) = " + result5 + " (Expected: 10)");

        // Test case 6
        int result6 = getMCD(1013, 1019);
        System.out.println("getMCD(1013, 1019) = " + result6 + " (Expected: 1)");

        // Test case 7
        int result7 = getMCD(42, 42);
        System.out.println("getMCD(42, 42) = " + result7 + " (Expected: 42)");

        // Test case 8
        int result8 = getMCD(123456, 654321);
        System.out.println("getMCD(123456, 654321) = " + result8 + " (Expected: 3)");

        // Test case 9
        int result9 = getMCD(37, 144);
        System.out.println("getMCD(37, 144) = " + result9 + " (Expected: 1)");

        // Test case 10
        int result10 = getMCD(987654321, 123456789);
        System.out.println("getMCD(987654321, 123456789) = " + result10 + " (Expected: 9)");

        int result11 = getMCD(6, 18);
        System.out.println("getMCD(6, 18) = " + result11 + " (Expected: 6)");
    }

    public static void testMyMCD() {
        // Test case 1
        int result1 = getMyMCD(35, 48);
        System.out.println("getMyMCD(35, 48) = " + result1 + " (Expected: 1)");

        // Test case 2
        int result2 = getMyMCD(18, 24);
        System.out.println("getMyMCD(18, 24) = " + result2 + " (Expected: 6)");

        // Test case 3
        int result3 = getMyMCD(0, 42);
        System.out.println("getMyMCD(0, 42) = " + result3 + " (Expected: 42)");

        // Test case 4
        int result4 = getMyMCD(0, 0);
        System.out.println("getMyMCD(0, 0) = " + result4 + " (Expected: 0)");

        // Test case 5
        int result5 = getMyMCD(-20, 30);
        System.out.println("getMyMCD(-20, 30) = " + result5 + " (Expected: 10)");

        // Test case 6
        int result6 = getMyMCD(1013, 1019);
        System.out.println("getMyMCD(1013, 1019) = " + result6 + " (Expected: 1)");

        // Test case 7
        int result7 = getMyMCD(42, 42);
        System.out.println("getMyMCD(42, 42) = " + result7 + " (Expected: 42)");

        // Test case 8
        int result8 = getMyMCD(123456, 654321);
        System.out.println("getMyMCD(123456, 654321) = " + result8 + " (Expected: 3)");

        // Test case 9
        int result9 = getMyMCD(37, 144);
        System.out.println("getMyMCD(37, 144) = " + result9 + " (Expected: 1)");

        // Test case 10
        int result10 = getMyMCD(987654321, 123456789);
        System.out.println("getMyMCD(987654321, 123456789) = " + result10 + " (Expected: 9)");

        int result11 = getMyMCD(6, 18);
        System.out.println("getMCD(6, 18) = " + result11 + " (Expected: 6)");
    }
}