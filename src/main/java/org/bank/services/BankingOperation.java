package org.bank.services;

import org.bank.data.BankingRequest;
import org.bank.interfaces.Validatable;

public interface BankingOperation {
    void deposit(double amount);
    void withdraw(BankingRequest request, Validatable validator);
    double getBalance();
}
