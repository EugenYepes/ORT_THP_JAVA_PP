import java.util.Scanner;

public class Peaje {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        String patente;
        do {
            patente = input.nextLine().toUpperCase();
        } while (patente.equals("FIN"));
    }
}
