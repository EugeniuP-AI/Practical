package org.bank.helper;

import org.bank.data.AtmState;
import org.bank.data.AtmValidation;
import org.bank.interfaces.Validatable;
import org.bank.interfaces.ValidationResult;

public class WithdrawAmountValidator implements Validatable {
    private final AtmState atmState;

    public WithdrawAmountValidator(AtmState atmState) {
        this.atmState = atmState;
    }

    @Override
    public ValidationResult validate() {
        if (atmState.getRequestedAmount() % 10 == 0) {
            return new AtmValidation(true, "Amount is valid for withdrawal");
        } else {
            return new AtmValidation(false, "Error: Invalid Amount - Must be multiple of 10");
        }
    }
}