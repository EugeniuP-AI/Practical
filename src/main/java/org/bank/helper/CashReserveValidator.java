package org.bank.helper;

import org.bank.data.AtmState;
import org.bank.data.AtmValidation;
import org.bank.interfaces.Validatable;
import org.bank.interfaces.ValidationResult;


public class CashReserveValidator implements Validatable {
    private AtmState atmState;

    public CashReserveValidator(AtmState atmState) {
        this.atmState = atmState;
    }

    @Override
    public ValidationResult validate() {
        if (atmState.getAtmCashReserve() >= atmState.getRequestedAmount()) {
            return new AtmValidation(true, "ATM has sufficient cash reserve.");
        } else {
            return new AtmValidation(false, "ATM does not have sufficient cash reserve.");
        }
    }
}
