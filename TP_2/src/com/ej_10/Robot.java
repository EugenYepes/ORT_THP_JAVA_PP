package com.ej_10;

public class Robot {
    private String name;

    public Robot() {
        name = "";
    }

    public Robot(String name) {
        this.name = name;
    }

    public void saludar() {
        System.out.println("Hola mi nombre es " + name + ". ¿En que puedo ayudarte?");
    }

    public void saludar(Person person) {
        System.out.println("Hola " + person.getName() + " mi nombre es " + name + ". ¿En que puedo ayudarte?");
    }
}
