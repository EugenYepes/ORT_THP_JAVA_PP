package com.ej_09;

public class HomeAddress {
    private String street;
    private int number;
    private String city;

    public HomeAddress() {
        street = "";
        number = 0;
        city = "";
    }

    public HomeAddress(String street, int number, String city) {
        setStreet(street);
        setNumber(number);
        setCity(city);
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "HomeAddress [street=" + street + ", number=" + number + ", city=" + city + "]";
    }
}
