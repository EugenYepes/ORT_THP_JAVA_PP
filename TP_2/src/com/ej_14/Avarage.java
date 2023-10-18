package com.ej_14;

public class Avarage {
    private Counter counter;
    private Accumulator accumulator;

    public Avarage() {
        counter = new Counter();
        accumulator = new Accumulator();
    }
    
    public void increase(double number) {
        accumulator.increase(number);
        counter.increase();
    }

    public double getValue() {
        double retVal = 0;
        if (counter.getValue() != 0) {
            retVal = (double) accumulator.getValue() / counter.getValue();
        }
        return retVal;
    }
}
