package org.bank;

public class Account {
    private double accountBalance;
    private final int accountPin;

    public Account(int pin, double accountBalance) {
        this.accountBalance = accountBalance;
        this.accountPin = pin;
    }

    public double getAccountBalance(){
        return accountBalance;
    }

    public int getAccountPin(){
        return accountPin;
    }

    public double withdraw(double amount) {
        if (amount > accountBalance) {
            return -1;
        }
        accountBalance -= amount;
        return amount;
    }

    public boolean hasEnoughFunds(double amount) {
        return amount <= accountBalance;
    }

    public boolean validatePin(int inputPin) {
        return inputPin == accountPin;
    }

}

