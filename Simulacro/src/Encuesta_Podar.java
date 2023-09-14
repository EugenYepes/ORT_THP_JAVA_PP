import java.util.Scanner;

public class Encuesta_Podar {
    private static Scanner input = new Scanner(System.in);
    private static final String AFFIRMATIVE = "S";
    private static final String NEGATIVE = "N";
    private static final String BLANK = "B";
    private static final String END = "F";

    public static void main(String[] args) {
        String vote;
        int age, amountVotes;
        int amountAffirmative = 0, amountNegative = 0, amountBlank = 0;
        boolean validVote = false;
        int addAges = 0;
        String message = "indeterminado";

        System.out.println("Encuesta para podar los arboles");
        do {
            do {
                System.out.println("Ingrese el voto. " + AFFIRMATIVE + " (Si), " + NEGATIVE + " (No), " + BLANK + " (Blanco), " + END + " (Fin)");
                vote = input.nextLine().toUpperCase();
                validVote = vote.equals(AFFIRMATIVE) 
                            || vote.equals(NEGATIVE) 
                            || vote.equals(BLANK) 
                            || vote.equals(END);
                age = 0;
                if (validVote && !vote.equals(END)) {
                    System.out.println("Ingrese la edad del votante, tiene que ser mayor de 18");
                    age = Integer.parseInt(input.nextLine());
                } else if (!vote.equals(END)){
                    System.out.println("Ingrese una de las opciones, intente de nuevo");
                }
            } while (age < 18 && !validVote);

            switch (vote) {
                case AFFIRMATIVE:
                    amountAffirmative++;
                    break;
                case NEGATIVE:
                    amountNegative++;
                    break;
                case BLANK:
                    amountBlank++;
                    break;
                default:
            }
            addAges += age;
        } while (!vote.equals(END));

        amountVotes = amountAffirmative + amountNegative + amountBlank;
        if (amountVotes > 0) {
            if (amountAffirmative > amountNegative && amountAffirmative > amountBlank) {
                message = "afirmativo";
            } else if (amountNegative > amountAffirmative && amountNegative > amountBlank) {
                message = "negativo";
            }
            System.out.println("El resultado de la votacion es " + message);
            System.out.println("El " + ((double)amountNegative/(double)amountVotes*100.0) + "% de los votantes no quieren que se poden los arboles");
            System.out.println("El promedio de edad de los votantes es " + addAges/amountVotes);
        } else {
            System.out.println("No se ingresaron datos");
        }

        input.close();
    }
}
