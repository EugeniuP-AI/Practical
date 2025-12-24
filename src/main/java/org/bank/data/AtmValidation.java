package org.bank.data;

import org.bank.interfaces.ValidationResult;

public class AtmValidation implements ValidationResult {
    private boolean valid;
    private String message;

    public AtmValidation(boolean valid, String message) {
        this.valid = valid;
        this.message = message;
    }

    @Override
    public boolean isValid() {
        return valid;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "AtmValidation{" +
                "valid=" + valid +
                ", message='" + message + '\'' +
                '}';
    }
}
