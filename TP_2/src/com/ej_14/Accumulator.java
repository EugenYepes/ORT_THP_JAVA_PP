package com.ej_14;

public class Accumulator {
    private double number;

    public Accumulator() {
        number = 0.0;
    }

    public void increase(double number) {
        this.number += number;
    }

    public double getValue() {
        return number;
    }
}
