package com.ej_13;

public enum FightResults {
    TRIUMPH("TRIUNFO"), DEFEAT("DERROTA"), DRAW("EMPATE");

    private final String desc;
    
    private FightResults(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
