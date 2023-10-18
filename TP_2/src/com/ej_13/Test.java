package com.ej_13;

public class Test {
    public static void main(String[] args) {
        SuperHero superHero1 = new SuperHero("Batman", 90, 70, 0);
        SuperHero superHero2 = new SuperHero("Superman", 95, 60, 70);
        System.out.println(superHero1.toString());
        System.out.println(superHero2.toString());
        System.out.println(superHero1.compete(superHero2).getDesc());

    }
}
