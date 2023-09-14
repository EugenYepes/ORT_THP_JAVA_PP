import java.util.Scanner;

public class Mesetas {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int num = 1, prevNumber = -1, amountMesetas = 0, largeOfMeseta = 0, mostLargeMeseta = -1, numMostLargeMeseta = 0;
		boolean inMeseta = false;

		System.out.println("\n*******************Calculadora de mesetas******************\n");
		System.out.println("Por favor ingrese un numeros del 1 al 100, 0 para finalizar");

		while (num != 0) {
			// enter data
			do {
				num = Integer.parseInt(input.nextLine());
				if (num < 0 || num > 100) {
					System.out.println("Error, el numero ingresado debe estar comprendido entre [0, 100], reintente");
				}
			} while (num < 0 || num > 100);
			// process data
			if (num == prevNumber && !inMeseta) {
				inMeseta =  true;
				amountMesetas++;
				largeOfMeseta = 2;
				if (mostLargeMeseta < largeOfMeseta) {
					numMostLargeMeseta = num;
					mostLargeMeseta = largeOfMeseta;
				}
			} else if (num == prevNumber && inMeseta) {
				largeOfMeseta++;
				if (mostLargeMeseta < largeOfMeseta) {
					numMostLargeMeseta = num;
					mostLargeMeseta = largeOfMeseta;
				}
			} else {
				inMeseta = false;
			}
			prevNumber = num;
		}
		// show data
		System.out.println("La cantidad de mesetas detectadas fue de " + amountMesetas);
		if (amountMesetas > 0)
			System.out.println("La meseta de mayor extension fue la del " + numMostLargeMeseta + " con una extension de " + mostLargeMeseta);

		input.close();
	}
}