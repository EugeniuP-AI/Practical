package org.bank.data;

import org.bank.Account;

public class WithdrawRequest  implements BankingRequest{
    private Account account;
    private double amount;
    private int requestPin;
}
