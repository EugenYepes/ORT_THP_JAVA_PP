package com.activity01.enums;


public enum EnumNumbers {
    FIRST (1, "first", "First"),
    SECOND (2, "second", "Second"),
    THIRD (3, "third", "Third"),
    FOURTH (4, "fourth", "Fourth"),
    FIFTH (5, "fifth", "Fifth"),
    SIXTH (6, "sixth", "Sixth"),
    SEVENTH (7, "seventh", "Seventh"),
    EIGHTH (8, "eighth", "Eighth"),
    NINTH (9, "ninth", "Ninth"),
    TENTH (10, "tenth", "Tenth");

    private int value;
    private String lowDescription;
    private String upperDescription;

    EnumNumbers(int value, String lowDescription, String upperDescrption) {
        this.value = value;
        this.lowDescription = lowDescription;
        this.upperDescription = upperDescrption;
    }

    public int getValue() {
        return value;
    }

    public String getLowDescription() {
        return lowDescription;
    }

    public String getUpperDescription() {
        return upperDescription;
    }

    static public String getByNumberUpperCase(int num) {
        for (EnumNumbers enumNumbers : EnumNumbers.values()) {
            if (enumNumbers.value == num) {
                return enumNumbers.upperDescription;
            }
        }
        // outside the scope of the enum
        return "Other";
    }

    static public String getByNumberLowCase(int num) {
        
        for (EnumNumbers enumNumbers : EnumNumbers.values()) {
            if (enumNumbers.value == num) {
                return enumNumbers.lowDescription;
            }
        }
        // outside the scope of the enum
        return "other";
    }
}
