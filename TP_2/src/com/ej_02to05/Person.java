package com.ej_02to05;

public class Person {
    private String name;
    private String lastName;
    private HomeAddress address;

    public Person () {
        name = "";
        lastName = "";
        address = new HomeAddress();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String street, int number, String city) {
        address.setStreet(street);
        address.setNumber(number);
        address.setCity(city);
    }

    public void setAddress(HomeAddress address) {
        this.address = address;
    }

    public HomeAddress getAddress() {
        return address;
    }

    public String getCompleteName() {
        return name + " " + lastName;
    }

    public String getAddressString() {
        return address.toString();
    }

    @Override
    public String toString() {
        return name + " " + lastName + ". Address: " + address.toString();
    }
}
