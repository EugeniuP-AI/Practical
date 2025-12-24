package org.bank.data;

import org.bank.Account;

public class AtmState {
    private final Account account;
    private final double atmCashReserve;
    private final int inputPin;
    private final double requestedAmount;

    public AtmState(Account account, double atmCashReserve, int inputPin, double requestedAmount) {
        this.account = account;
        this.atmCashReserve = atmCashReserve;
        this.inputPin = inputPin;
        this.requestedAmount = requestedAmount;
    }

    public Account getAccount() {
        return account;
    }

    public double getAccountBalance() {
        return account.getAccountBalance();
    }

    public int getStoredPin() {
        return account.getAccountPin();
    }

    public double getAtmCashReserve() {
        return atmCashReserve;
    }

    public int getInputPin() {
        return inputPin;
    }

    public double getRequestedAmount() {
        return requestedAmount;
    }
    

}
