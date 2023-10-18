package com.ej_13;

public class SuperHero {
    private String name;
    private int strength;
    private int resistance;
    private int superPowers;

    public SuperHero(String name, int strength, int resistance, int superPowers) {
        setName(name);
        setStrength(strength);
        setResistance(resistance);
        setSuperPowers(superPowers);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        if (strength > 100) {
            this.strength = 100;
        } else if (strength < 0) {
            this.strength = 0;
        } else {
            this.strength = strength;
        }
    }

    public int getResistance() {
        return resistance;
    }

    public void setResistance(int resistance) {
        if (resistance > 100) {
            this.resistance = 100;
        } else if (resistance < 0) {
            this.resistance = 0;
        } else {
            this.resistance = resistance;
        }
    }

    public int getSuperPowers() {
        return superPowers;
    }

    public void setSuperPowers(int superPowers) {
        if (superPowers > 100) {
            this.superPowers = 100;
        } else if (superPowers < 0) {
            this.superPowers = 0;
        } else {
            this.superPowers = superPowers;
        }
    }

    public FightResults compete(SuperHero superHero) {
        int winCategoriesCount = 0;
        if (getStrength() > superHero.getStrength()) {
            winCategoriesCount++;
        } 
        if (getResistance() > superHero.getResistance()) {
            winCategoriesCount++;
        }
        if(getSuperPowers() > superHero.getSuperPowers()) {
            winCategoriesCount++;
        }

        if (winCategoriesCount >= 2) {
            return FightResults.TRIUMPH;
        } else if (winCategoriesCount <= 1) {
            return FightResults.DEFEAT;
        } else {
            return FightResults.DRAW;
        }
    }

    @Override
    public String toString() {
        return getName() + ": \n\tStrength: " + getStrength() + "\n\tResistance: " + getResistance() + "\n\tSuper Powers: " + getSuperPowers();
    }
}
