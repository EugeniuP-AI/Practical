package org.bank.helper;

import org.bank.data.AtmState;
import org.bank.data.AtmValidation;
import org.bank.interfaces.Validatable;
import org.bank.interfaces.ValidationResult;

public class PinValidator implements Validatable {
    private AtmState atmState;

    public PinValidator(AtmState atmState) {
        this.atmState = atmState;
    }

    @Override
    public ValidationResult validate() {
        if (atmState.getInputPin() == atmState.getStoredPin()) {
            return new AtmValidation(true, "PIN is valid.");
        } else {
            return new AtmValidation(false, "Invalid PIN.");
        }
    }
}
