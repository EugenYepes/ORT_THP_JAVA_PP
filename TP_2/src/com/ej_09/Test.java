package com.ej_09;

public class Test {
    public static void main(String[] args) {
        HomeAddress address = new HomeAddress("Yatay", 240, "Almagro");
        Person person1 = new Person("Fulano", "Gomez", 12345678, address);
        BankAccount bankAccount1 = new BankAccount(AccountType.CAJA_AHORRO, person1);
        
        Person person2 = new Person("Mengana", "Torres", 9123456, address);
        BankAccount bankAccount2 = new BankAccount(AccountType.CUENTA_CORRIENTE, person2);

        System.out.println(bankAccount1);
        System.out.println(bankAccount2);
    }
}
