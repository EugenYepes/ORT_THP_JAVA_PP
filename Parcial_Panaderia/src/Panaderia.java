import java.util.Scanner;

public class Panaderia {
	private static Scanner input = new Scanner(System.in);
	public static final double PRICE_MEDIALUNA = 30.00;
	public static final double PRICE_CHIPA = 50.00;
	public static final double PRICE_ROSCA = 350.00;
	public static final double PRICE_ALFAJOR = 70.00;

	public static final String NAME_MEDIALUNA = "medialuna";
	public static final String NAME_CHIPA = "chipa";
	public static final String NAME_ROSCA = "rosca";
	public static final String NAME_ALFAJOR = "alfajor";

	public static void main(String[] args) {
		int dni;
		double mostExpensive = Double.MIN_VALUE;
		double total = 0;
		boolean moreRequests = false;
		int winnerDni = 0;
		double winnerTotal = 0;
		double dayTotal = 0;
		int amountSales = 0;

		System.out.println("**********Bienvenidos a la panaderia**********");

		do {
			System.out.println("Ingrese el DNI del cliente, 0 para terminar");
			dni = Integer.parseInt(input.nextLine());
			if (dni != 0) {
				showPriceList();
				total = 0;
				System.out.println("Ingrese el nombre del producto que desea comprar");
				String productName = input.nextLine();
				System.out.println("Ingrese la cantidad de " + productName);
				int quatity = Integer.parseInt(input.nextLine());
				total = searchPrice(productName) * quatity;
				do {
					System.out.println("Desea comprar otro producto (S/N)");
					moreRequests = input.nextLine().toUpperCase().charAt(0) == 'S';
					if (moreRequests) {
						System.out.println("Ingrese el producto");
						productName = input.nextLine();
						System.out.println("Ingrese la cantidad de " + productName);
						quatity = Integer.parseInt(input.nextLine());
						total += (searchPrice(productName) * quatity);
					}
				} while (moreRequests);
				System.out.println("El importe total es: " + total);

				if (total > mostExpensive) {
					winnerDni = dni;
					winnerTotal = total;
				}
				amountSales++;
				dayTotal += total;
			}
		} while (dni != 0);

		System.out.println("Cantidad de ventas: " + amountSales);
		System.out.println("Recaudacion total diaria: " + dayTotal);
		System.out.println("Venta promedio: " + dayTotal / amountSales);
		System.out.println("El ganador es: " + winnerDni + " y gasto  " + winnerTotal);
	}

	public static void showPriceList() {
		System.out.printf("%s\t\t\t\t$%.2f\n", NAME_MEDIALUNA, PRICE_MEDIALUNA);
		System.out.printf("%s\t\t\t\t\t$%.2f\n", NAME_CHIPA, PRICE_CHIPA);
		System.out.printf("%s\t\t\t\t\t$%.2f\n", NAME_ROSCA, PRICE_ROSCA);
		System.out.printf("%s\t\t\t\t\t$%.2f\n", NAME_ALFAJOR, PRICE_ALFAJOR);
	}

	public static double searchPrice(String product) {
		if (product.equals(NAME_MEDIALUNA))
			return PRICE_MEDIALUNA;

		if (product.equals(NAME_CHIPA))
			return PRICE_CHIPA;

		if (product.equals(NAME_ROSCA))
			return PRICE_ROSCA;

		if (product.equals(NAME_ALFAJOR))
			return PRICE_ALFAJOR;

		System.out.println("Producto no encontrado");
		return 0.0;
	}
}