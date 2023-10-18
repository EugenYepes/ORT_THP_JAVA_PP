package com.ej_07;

public enum ComputerTypes {
    DESKTOP(1), LAPTOP(2), ALL_IN_ONE(3);

    private int identifier;

    private ComputerTypes(int identifier) {
        this.identifier = identifier;
    }

    public ComputerTypes getByIdentifier(int identifier) {
        for(ComputerTypes computerType : ComputerTypes.values()) {
            if (computerType.identifier == identifier) {
                return computerType;
            }
        }
        return null;
    }

    public int getIdentifier() {
        return identifier;
    }
}
