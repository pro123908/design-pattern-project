// The Facade Design Pattern decouples or separates the client 
// from all of the sub components

// The Facades aim is to simplify interfaces so you don't have 
// to worry about what is going on under the hood
package com.company.Facade;

public class PaymentFacade {

    private int accountNumber;
    private int securityCode;

    AccountNumberCheck acctChecker;
    SecurityCodeCheck codeChecker;
    FundsCheck fundChecker;

    public PaymentFacade() {

        acctChecker = new AccountNumberCheck();
        codeChecker = new SecurityCodeCheck();
        fundChecker = new FundsCheck();

    }

    public void setCredentials(int newAcctNum, int newSecCode) {
        accountNumber = newAcctNum;
        securityCode = newSecCode;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public void withdrawCash(double cashToGet) {

        if (acctChecker.accountActive(getAccountNumber()) && codeChecker.isCodeCorrect(getSecurityCode())
                && fundChecker.haveEnoughMoney(cashToGet)) {

            System.out.println("Transaction Complete\n");

        } else {

            System.out.println("Transaction Failed\n");

        }

    }

    public void makePayment(double payment) {
        if (acctChecker.accountActive(getAccountNumber()) && codeChecker.isCodeCorrect(getSecurityCode())) {

            System.out.println("Total Payment : " + payment);
            fundChecker.makeDeposit(payment);

            System.out.println("Transaction Complete\n");

        } else {

            System.out.println("Transaction Failed\n");

        }
    }

    public void depositCash(double cashToDeposit) {

        if (acctChecker.accountActive(getAccountNumber()) && codeChecker.isCodeCorrect(getSecurityCode())) {

            fundChecker.makeDeposit(cashToDeposit);

            System.out.println("Transaction Complete\n");

        } else {

            System.out.println("Transaction Failed\n");

        }

    }

}