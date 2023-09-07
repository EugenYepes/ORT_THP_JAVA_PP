import java.util.Scanner;

public class PanaderiaRosa {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
	  		
	    double totalVentas = 0;
	    int cantidadVentas = 0;
	    double mayorCompra = 0;
	    int dniMayorCompra = 0;
	    int dni;
	    
	    System.out.println("Bienvenido ");
	  	
	    do {	    
			do {
				System.out.print("Indique su DNI: ");
				dni = Integer.parseInt(input.nextLine());
			} while (dni < 0);

			if (dni == 0) {
				System.out.println("Cantidad de ventas: " + cantidadVentas);
				System.out.println("Total vendido: " + totalVentas + "$");
				System.out.println("Monto de mayor compra: " + mayorCompra + "$");
				System.out.println("DNI de mayor compra: " + dniMayorCompra);
				break;
			}

			double totalCompra = 0;
			showTable();

			boolean cargarOtroProducto = true;
			while (cargarOtroProducto) {
				System.out.println("Ingrese el nombre del producto: ");
				String nombreProducto = input.nextLine();
				double precioUnitario = getProductValue(nombreProducto);

				if (precioUnitario != 0) {
					System.out.println("Ingrese la cantidad de unidades: ");
					int cantidadUnidades = Integer.parseInt(input.nextLine());
					double importeProducto = precioUnitario * cantidadUnidades;
					totalCompra += importeProducto;
				}

				System.out.println("¿Desea cargar otro producto? (s/n): ");
				char respuesta = input.nextLine().charAt(0);
				cargarOtroProducto = (respuesta == 's' || respuesta == 'S');
			}
			System.out.println("Total a pagar: "+ totalCompra + "$\n");

			if (totalCompra > mayorCompra) {
				mayorCompra = totalCompra;
				dniMayorCompra = dni;
			}
			totalVentas = totalVentas + totalCompra;
			cantidadVentas++;
	    } while (true);
	}

	public static void showTable() {
	    System.out.println();
	    System.out.printf("%-10s %s%n", "Producto", "Precio");
	    System.out.printf("%-10s %s%n", "medialuna", "$30");
	    System.out.printf("%-10s %s%n", "chipa", "$50");
	    System.out.printf("%-10s %s%n", "rosca", "$350");
	    System.out.printf("%-10s %s%n", "alfajor", "$70\n");
	}

	public static double getProductValue(String nombreProducto) {
		double precio;
		switch (nombreProducto) {
			case "medialuna":
				precio = 30.0;
				break;
			case "chipa":
				precio = 50.0;
				break;
			case "rosca":
				precio = 350.0;
				break;
			case "alfajor":
				precio = 70.0;
				break;
			default:
				precio = 0;
				System.out.println("Producto no disponible ");
				break;
		}
		return precio;
	}
}