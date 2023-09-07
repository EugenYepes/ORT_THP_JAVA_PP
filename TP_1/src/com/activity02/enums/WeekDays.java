package com.activity02.enums;


public enum WeekDays {
    SUNDAY (1, "sunday", "sunday"),
    MONDAY (2, "monday", "Monday"),
    TUESDAY (3, "tuesday", "Tuesday"),
    WEDNESDAY (4, "wednesday", "Wednesday"),
    THURSDAY (5, "thursday", "Thursday"),
    FRIDAY (6, "friday", "Friday"),
    SATURDAY (7, "saturday", "Saturday");

    private int value;
    private String lowDescription;
    private String upperDescription;

    WeekDays(int value, String lowDescription, String upperDescrption) {
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

    static public String getByNumberUpperCase(int dayNumber) {
        for (WeekDays weekDays : WeekDays.values()) {
            if (weekDays.value == dayNumber) {
                return weekDays.upperDescription;
            }
        }
        // outside the scope of the enum
        return "Nonexistent day";
    }

    static public String getByNumberLowCase(int dayNumber) {
        
        for (WeekDays weekDays : WeekDays.values()) {
            if (weekDays.value == dayNumber) {
                return weekDays.lowDescription;
            }
        }
        // outside the scope of the enum
        return "nonexistent day";
    }
}
