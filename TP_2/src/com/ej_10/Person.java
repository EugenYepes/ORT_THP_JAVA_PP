package com.ej_10;

public class Person {
    private String name;
    private String lastName;
    private int dni;
    private HomeAddress address;

    public Person () {
        setName("");
        setLastName("");
        setDni(0);
        address = new HomeAddress();
    }

    public Person(String name, String lastName, int dni, HomeAddress address) {
        setName(name);
        setLastName(lastName);
        setDni(dni);
        setAddress(address);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public HomeAddress getAddress() {
        return address;
    }

    public void setAddress(HomeAddress address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", lastName=" + lastName + ", dni=" + dni + ", address=" + address + "]";
    }
}
