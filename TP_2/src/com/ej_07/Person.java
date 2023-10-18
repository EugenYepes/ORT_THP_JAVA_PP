package com.ej_07;

public class Person {
    private String name;
    private String lastName;
    private int dni;
    private boolean isWorking;
    private Computer computer;

    public Person() {
        name = "";
        lastName = "";
        dni = 0;
        isWorking = false;
        computer = new Computer();
    }

    public Person(String name, String lastName, int dni) {
        this.name = name;
        this.lastName = lastName;
        setDni(dni);
        isWorking = false;
        computer = new Computer();
    }

    public void work() {
        isWorking = true;
    }

    public void rest() {
        isWorking = false;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDni(int dni) {
        if (dni < 0) {
            dni = 0;
        }
        this.dni = dni;
    }

    public void buyComputer(Computer computer) {
        this.computer = computer;
    }

    public Computer getComputer() {
        return computer;
    }

    public String getCompleteName() {
        return name + " " + lastName;
    }

    public int getDni() {
        return dni;
    }

    public boolean isWorking() {
        return isWorking;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", lastName=" + lastName + ", dni=" + dni + ", isWorking=" + isWorking
                + ", computer=" + computer + "]";
    }
}
