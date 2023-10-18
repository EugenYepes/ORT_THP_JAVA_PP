package com.ej_08;

public class Test {

	public static void main(String[] args) {
		Card card = new Card("4145-4141-2222-1111", "Juan Perez", 10000.0);
		System.out.println(card.toString());
		if (card.makeSale(4000)) {
			System.out.println("Sale performed succefully");
		}
		System.out.println(card.toString());

		card.updateLimit(3000.0);
		if (card.makeSale(4000)) {
			System.out.println("Sale performed succefully");
		}
		System.out.println(card.toString());
	}

}
