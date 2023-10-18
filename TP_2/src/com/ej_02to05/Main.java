package com.ej_02to05;

public class Main {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.setName("Eugenio");
		person1.setLastName("Yepes");
		person1.setAddress("Tucuman", 3454, "Buenos Aires");
		System.out.println(person1.toString());

		Person person2 = new Person();
		person2.setName("Camila");
		person2.setLastName("Laurenza");
		person2.setAddress("Condarco", 5866, "Villa Pueyrredon");
		System.out.println(person2.toString());

		HomeAddress address1 = new HomeAddress();
		address1.setCity("Puerto Madero");
		address1.setNumber(1601);
		address1.setStreet("Juan Manso");
		person1.setAddress(address1);
		person2.setAddress(person1.getAddress());
		System.out.println(person1.toString());
		System.out.println(person2.toString());
	}
}
