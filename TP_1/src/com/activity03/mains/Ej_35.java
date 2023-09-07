package com.activity03.mains;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.activity03.classes.*;

public class Ej_35 {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        while (true) {
            System.out.println("Please enter the name and the age of a person, finish with *");
            String name = input.nextLine();
            if (name.charAt(0) == '*') {
                break;
            }
            int age = Integer.parseInt(input.nextLine());
            if (age < 0 || age > 120) {
                System.err.println("Wrong age range, try again");
            } else {
                Person p = new Person(name, age);
                persons.add(p);
            }
        }

        if (persons.size() > 0) {
            Person lowestAgePerson = new Person(null, 0x7FFFFFFF);
            for (Person p: persons) {
                System.err.println(p.getName() + " " + p.getAge());
                if (p.getAge() < lowestAgePerson.getAge()) {
                    lowestAgePerson.setAge(p.getAge());
                    lowestAgePerson.setName(p.getName());
                }
            }
            System.out.println("The youngest person is " + lowestAgePerson.getName() + " with an age of " + lowestAgePerson.getAge());
        } else {
            System.out.println("No persons entered");
        }
        input.close();
    }
}