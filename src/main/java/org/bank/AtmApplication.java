package org.bank;

import org.bank.data.AtmState;

import java.util.Scanner;

public class AtmApplication {
    public static void main(String[] args) {

        int storedPin = 1234;
        double accountBalance = 2500.00;
        double atmCashReseved = 5000.00;

        Account account = new Account(storedPin, accountBalance);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your PIN: ");
        int inputPin = scanner.nextInt();

        System.out.println("Enter amount to withdraw: ");
        double requestedAmount = scanner.nextDouble();

        scanner.close();

        AtmState atmState = new AtmState(account, atmCashReseved, inputPin, requestedAmount);
        AtmGatekeeper atmGatekeeper = new AtmGatekeeper(atmState);
        atmGatekeeper.withdraw();
    }
}
