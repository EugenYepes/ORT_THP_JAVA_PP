package com.ej_08;

public class Card {
    private String pan;
    private String cardHolderName;
    private double maxAccumulatedLimit;
    private double currentAcumulated;

    public Card(String pan, String cardHolderName, double maxAccumulatedLimit) {
        setPan(pan);
        setCardHolderName(cardHolderName);
        this.maxAccumulatedLimit = maxAccumulatedLimit;
        currentAcumulated = 0;
    }

    public double amountAvailable() {
        double difference = maxAccumulatedLimit - currentAcumulated;
        if (difference < 0) {
            difference = 0;
        }
        return difference;
    }

    private boolean isSaleAvailable(double amount) {
        return amount < amountAvailable();
    }

    public void updateLimit(double newLimit) {
        setMaxAccumulatedLimit(newLimit);
    }

    public void accumulateCurrentAmount(double amount) {
        currentAcumulated += amount;
    }

    public boolean makeSale(double amount) {
        boolean isApproved = false;
        if (isSaleAvailable(amount)) {
            accumulateCurrentAmount(amount);
            isApproved = true;
        }
        return isApproved;
    }

    // getters & setters
    public String getPan() {
        return pan;
    }

    private void setPan(String pan) {
        this.pan = pan;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    private void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public double getMaxAccumulatedLimit() {
        return maxAccumulatedLimit;
    }

    private void setMaxAccumulatedLimit(double saleLimit) {
        this.maxAccumulatedLimit = saleLimit;
    }

    public double getCurrentAcumulated() {
        return currentAcumulated;
    }

    @Override
    public String toString() {
        return "pan: " + pan + "\ncard holder name: " + cardHolderName + "\nmaximun sale accumulated limit: "
                + maxAccumulatedLimit + "\ncurrent accumulated: " + currentAcumulated + "\navailable amount: "
                + amountAvailable();
    }
}