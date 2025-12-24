package org.bank.helper;

import org.bank.data.AtmState;
import org.bank.data.AtmValidation;
import org.bank.interfaces.Validatable;
import org.bank.interfaces.ValidationResult;

public class BalanceValidator implements Validatable {
    private final AtmState atmState;

    public BalanceValidator(AtmState atmState) {
        this.atmState = atmState;
    }

    @Override
    public ValidationResult validate() {
     if(atmState.getRequestedAmount() <= atmState.getAccountBalance()){
         return new AtmValidation(true, "Sufficient balance for the requested amount.");
        } else {
            return new AtmValidation(false, "Insufficient balance for the requested amount.");
     }
    }
}
