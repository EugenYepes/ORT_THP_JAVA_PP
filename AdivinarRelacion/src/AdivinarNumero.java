
import java.util.Scanner;

class AdivinarNumero {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        String message = "";
        String option;
        int points = 0;
        boolean out = false;
        int number = (int) (Math.random() * 1000 + 1);
        int numberToGuess;
        while (!out) {
            System.out.println("Guess the next generated number is greater(MA), less(ME) or equals(IG) to " + number);
            do {
                option = input.nextLine().toUpperCase();
                out = !option.equals("MA") && !option.equals("ME") && !option.equals("IG");
                if (out) {
                    System.out.println("Wrong option, try again");
                }
            } while(out);

            numberToGuess = (int) (Math.random() * 1000 + 1);
            out = false;
            switch (option) {
                case "MA":
                    if (number < numberToGuess) {
                        points++;
                    } else {
                        out = true;
                        message = "great";
                    }
                    break;
                case "ME":
                    if (number > numberToGuess) {
                        points++;
                    } else {
                        out = true;
                        message = "less";
                    }
                    break;
                case "IG":
                    if (number == numberToGuess) {
                        points++;
                    } else {
                        out = true;
                        message = "equals";
                    }
                    break;
            }
            if (out)
                System.out.println("Wrong prediction, you loose. The number was " + numberToGuess + " isn't " + message +  " than " + number);
            number = numberToGuess;
        }
        System.out.println("You have " + points + " points!");

        input.close();
    }
}