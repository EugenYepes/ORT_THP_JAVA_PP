package com.ej_06;

public class Dice {
    private int value;

    public Dice() {
        value = 0;
    }
    
    public int roll() {
        value = (int)(Math.random() * 6) + 1;
        return getValue();
    }

    public int getValue() {
        return value;
    }
}
