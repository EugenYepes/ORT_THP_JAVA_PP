package com.ej_10;

public class Test {
    public static void main(String[] args) {
        HomeAddress address = new HomeAddress("Yatay", 240, "Almagro");
        Person person1 = new Person("Fulano", "Gomez", 12345678, address);
        Robot robot = new Robot("Robotito");
        robot.saludar(person1);
        robot.saludar();
    }
}
