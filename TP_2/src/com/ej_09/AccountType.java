package com.ej_09;

public enum AccountType {
    CAJA_AHORRO("Caja de Ahorro"), CUENTA_CORRIENTE("Cuenta Corriente");

    private String desc;

    private AccountType(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
