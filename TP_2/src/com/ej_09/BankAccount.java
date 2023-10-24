package com.ej_09;

public class BankAccount {
    String cbu;
    AccountType accountType;
    double balance;
    Person holder;

    public BankAccount(AccountType accountType, Person holder){
        setAccountType(accountType);
        setHolder(holder);
        setBalance(0.0);
        setCbu(generateCbu());
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean extract(double amount) {
        boolean succefullOperation = false;
        if (amount >= 0 || amount < balance) {
            balance -= balance;
            succefullOperation = true;
        }
        return succefullOperation;
    }

    private String generateCbu() {
        String newCbu = "";
        String aux = "" + (accountType.ordinal() + 10);
        String stringDni = Integer.toString(holder.getDni()); 
        aux.substring(0, 2);
        newCbu = aux + "-";
        newCbu += String.format("%08d", holder.getDni());
        newCbu += "-";
        newCbu += stringDni.substring(stringDni.length() - 1, stringDni.length());
        return newCbu;
    }

    private void setCbu(String cbu) {
        this.cbu = cbu;
    }

    private void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    private void setBalance(double balance) {
        this.balance = balance;
    }

    private void setHolder(Person holder) {
        this.holder = holder;
    }

    @Override
    public String toString() {
        return "BankAccount [cbu=" + cbu + ", accountType=" + accountType.getDesc() + ", balance=" + balance + ", holder="
                + holder + "]";
    }
}
