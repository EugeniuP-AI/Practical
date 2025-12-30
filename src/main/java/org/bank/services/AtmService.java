package org.bank.services;

import org.bank.data.BankingRequest;
import org.bank.interfaces.Validatable;

public class AtmService  implements BankingOperation {
    private final BankOperationValidationService validationService;

    public AtmService(BankOperationValidationService validationService) {
        this.validationService = validationService;
    }

    @Override
    public void deposit(double amount) {

    }

    @Override
    public void withdraw(BankingRequest request, Validatable validator) {
        validationService.validateBalance(request, validator);
    }

    @Override
    public double getBalance() {
        return 0;
    }
}

//Todo
// 1. Implement the deposit method to add the specified amount to the account balance.
// 2. Implement the getBalance method to return the current account balance.
//

