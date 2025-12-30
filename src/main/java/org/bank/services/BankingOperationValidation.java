package org.bank.services;

import org.bank.data.BankingRequest;
import org.bank.interfaces.Validatable;

public interface BankingOperationValidation {
    void validateBalance(BankingRequest request, Validatable validator);
    //Todo
    // Add validate pin, validateCashReserve methods().
}
