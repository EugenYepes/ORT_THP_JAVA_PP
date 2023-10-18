package com.ej_07;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("Juan", "Jose", 1234);
        person.buyComputer(new Computer(ComputerTypes.DESKTOP, new DVDReader("JDC", true), new CPU("Intel", "I5")));
        person.getComputer().getCpu().setCriticTemperature(75.0);
        System.out.println(person);
    }
}
