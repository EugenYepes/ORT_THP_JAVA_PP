package com.ej_07;

public class CPU {
    private String brand;
    private String model;
    private double temperature;
    private double criticTemperature;

    public CPU() {
        brand = "";
        model = "";
    }

    public CPU(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setCriticTemperature(double criticTemperature) {
        this.criticTemperature = criticTemperature;
    }

    public double getCriticTemperature() {
        return criticTemperature;
    }

    @Override
    public String toString() {
        return "CPU [brand=" + brand + ", model=" + model + ", temperature=" + temperature + ", criticTemperature="
                + criticTemperature + "]";
    }
}
