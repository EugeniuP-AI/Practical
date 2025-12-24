package org.bank;

import org.bank.data.AtmState;
import org.bank.helper.BalanceValidator;
import org.bank.helper.CashReserveValidator;
import org.bank.helper.WithdrawAmountValidator;
import org.bank.helper.PinValidator;
import org.bank.interfaces.ValidationResult;

public class AtmGatekeeper {
    private AtmState atmState;

    public AtmGatekeeper(AtmState atmState) {
        this.atmState = atmState;
    }

    public boolean withdraw() {
        ValidationResult result;

        result = new PinValidator(atmState).validate();
        if (!result.isValid()) {
            System.out.println(result.getMessage());
            return false;
        }

        result = new WithdrawAmountValidator(atmState).validate();
        if (!result.isValid()) {
            System.out.println(result.getMessage());
            return false;
        }

        result = new BalanceValidator(atmState).validate();
        if (!result.isValid()) {
            System.out.println(result.getMessage());
            return false;
        }

        result = new CashReserveValidator(atmState).validate();
        if (!result.isValid()) {
            System.out.println(result.getMessage());
            return false;
        }
        atmState.getAccount().withdraw(atmState.getRequestedAmount());
        double newBalance = atmState.getAccountBalance();
        System.out.println("Withdrawal successful. New balance: " + newBalance);
        return true;
    }
}
