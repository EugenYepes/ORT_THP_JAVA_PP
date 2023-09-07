
import java.util.Scanner;

public class encuesta {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int piso;
		int departamento;
		int encuestados = 0;
		int total_deptos_mascotas = 0;
		int deptos_unica_mascota = 0;
		int gato_depto_alto = 0;
		int gato_piso_alto = 0;

		while (true) {
			do {
				System.out.println("Ingrese un piso entre el 1 y 30, cero para finalizar");
				piso = Integer.parseInt(input.nextLine());
				if (piso < 0 || piso > 30) {
					System.out.println("Número fuera de rango. Intente de nuevo");
				}
			} while (piso < 0 || piso > 30);
			if (piso == 0) {
				System.out.println("Total departamentos encuestados:  " + encuestados);
				double porcetanje = total_deptos_mascotas * 100 / encuestados;
				System.out.println("Porcentaje departamentos con mascotas:  " + porcetanje + "%");
				System.out.println("Total departamentos con unica mascota:  " + deptos_unica_mascota);
				if (gato_piso_alto > 0) {
					System.out.println(
							"El gato que vive mas arriba esta en el:  " + gato_piso_alto + " " + gato_depto_alto);
				}
				System.out.println("Programa finalizado ");
				break;
			}
			int max_departamento;
			do {

				if (piso >= 1 && piso <= 10) {
					System.out.println("Ingrese un departamento para el : " + piso);
					max_departamento = 4;

				} else if (piso > 10 && piso <= 20) {
					System.out.println("Ingrese un departamento entre 1 y 3 para el : " + piso);
					max_departamento = 3;

				} else {
					System.out.println("Ingrese un departamento entre 1 y 2 para el : " + piso);
					max_departamento = 2;
				}

				departamento = Integer.parseInt(input.nextLine());

				if (departamento < 1 || departamento > max_departamento) {
					System.out.println("Número fuera de rango. Intente de nuevo");
				}
			} while (departamento > max_departamento || departamento < 1);

			System.out.println("¿Tiene perro? (s/n): ");
			char perro = input.nextLine().charAt(0);
			boolean tienePerro = (perro == 's' || perro == 'S');
			System.out.println("¿Tiene gato? (s/n): ");
			char gato = input.nextLine().charAt(0);
			boolean tieneGato = (gato == 's' || gato == 'S');

			if (tienePerro && tieneGato) {
				total_deptos_mascotas += 1;
			} else if (tienePerro || tieneGato) {
				total_deptos_mascotas += 1;
				deptos_unica_mascota += 1;
			}
			if (tieneGato && piso > gato_depto_alto) {
				gato_piso_alto = piso;
				gato_depto_alto = departamento;
			}
			encuestados++;
		}

	}
}
