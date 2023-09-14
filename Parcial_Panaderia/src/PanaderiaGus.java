
import java.util.Scanner;

public class PanaderiaGus {

    private static Scanner input = new Scanner(System.in);

    private static final int MEDIALUNA = 30;
    private static final int CHIPA = 50;
    private static final int ROSCA = 350;
    private static final int ALFAJOR = 70;

    public static void main(String[] args) {

        int dni = 0;
        String producto = "  ";
        int cantidad = 0;
        char opcionElegida = ' ';
        int total = 0;
        int subtotal = 0;
        int ventas = 0;
        int totalTotal = 0;
        int ventaMayor = -1;
        int dniVentaMayor = 1;
        double promedio = 0;

        System.out.println("Bienvenido");
        System.out.println("");

        do {

            do {

                System.out.print("Ingrese el DNI del cliente (0 para terminar): ");
                dni = Integer.parseInt(input.nextLine());
            } while (dni < 0);
            if (dni != 0) {
                System.out.println(" ");
                System.out.println("medialuna: 	$" + MEDIALUNA);
                System.out.println("chipa: 		$" + CHIPA);
                System.out.println("rosca: 		$" + ROSCA);
                System.out.println("alfajor: 	$" + ALFAJOR);
                System.out.println(" ");

                subtotal = 0;

                total = 0;

                do {

                    while (producto.isEmpty() || cantidad <= 0) {

                        cantidad = 0;

                        System.out.print("Ingrese el producto elegido: ");
                        producto = input.nextLine();

                        System.out.print("Ingrese la cantidad: ");
                        cantidad = Integer.parseInt(input.nextLine());

                        switch (producto) {
                            case "medialuna":

                                subtotal = cantidad * MEDIALUNA;

                                break;

                            case "chipa":

                                subtotal = cantidad * CHIPA;

                                break;

                            case "rosca":

                                subtotal = cantidad * ROSCA;

                                break;

                            case "alfajor":

                                subtotal = cantidad * ALFAJOR;

                                break;

                            default:
                                System.out.println("Artículo no encontrado!");

                        }

                    }

                    System.out.print("¿Desea cargar otro producto? (s/n): ");
                    opcionElegida = input.nextLine().charAt(0);

                    producto = "";
                    cantidad = 0;

                    total += subtotal;

                    if (total > ventaMayor) {

                        ventaMayor = total;

                        dniVentaMayor = dni;

                    }

                } while (opcionElegida == 's' && opcionElegida != 'n');

                ventas++;
                totalTotal += total;
                promedio = totalTotal / ventas;

                System.out.println("El total de tu compra es: $" + total);
                System.out.println(" ");
            } else {
                System.out.println("Ingreso finalizado: ");
                System.out.println(" ");
                System.out.println("Cantidad de ventas realizadas en el día: " + ventas);
                System.out.println("Recaudación total diaria: $" + totalTotal);
                System.out.println("Venta promedio: $" + promedio);
                System.out.println("Importe y DNI cliente mejor compra: $" + ventaMayor + " -  DNI:" + dniVentaMayor);
            }
        } while (opcionElegida == 'n');

        input.close();

    }

}