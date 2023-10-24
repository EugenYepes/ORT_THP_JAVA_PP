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

    private int numberBetweenRounding(int num, int lowLimit, int highLimit) {
        if (num > highLimit) {
            num = highLimit;
        } else if (num < lowLimit) {
            num = lowLimit;
        }
        return num;
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
        this.strength = numberBetweenRounding(strength, 0, 100);
    }

    public int getResistance() {
        return resistance;
    }

    public void setResistance(int resistance) {
        this.resistance = numberBetweenRounding(resistance, 0, 100);
    }

    public int getSuperPowers() {
        return superPowers;
    }

    public void setSuperPowers(int superPowers) {
        this.superPowers = numberBetweenRounding(superPowers, 0, 100);
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
