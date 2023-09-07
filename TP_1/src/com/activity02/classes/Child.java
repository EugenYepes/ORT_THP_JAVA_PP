package com.activity02.classes;

public class Child {
    String name;
    String lastName;
    int age;
    double height;

    public Child(String name, String lastName, int age, double height) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Name " + name + "\n" + 
            "Last name " + lastName + "\n" +
            "Age " + age + "\n" +
            "Height: " + height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
}
