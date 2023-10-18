package com.ej_02to05;

public class HomeAddress {
    private String street;
    private int number;
    private String city;

    public HomeAddress() {
        street = "";
        number = 0;
        city = "";
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
        if (street.equals("") || city.equals(""))
            return "No Addres loaded";
        return street + ", " + number + ", " + city;
    }
}
