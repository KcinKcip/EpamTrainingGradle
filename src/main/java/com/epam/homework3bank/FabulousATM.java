package com.epam.homework3bank;

//Gives money, but does not change the balance

import java.math.BigDecimal;
import java.math.RoundingMode;

import static com.epam.homework3bank.TypeATM.FABULOUS;


public class FabulousATM extends ATM {

    FabulousATM(int identificationNumber, Account bankAccount) {
        this.id = identificationNumber;
        this.account = bankAccount;
        this.type = FABULOUS;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++){
                showBalance(id, type, account);
                withdrawMoney(new BigDecimal(Math.random() * 1000).setScale(2, RoundingMode.HALF_UP), id, type, account);
                depositMoney(new BigDecimal(Math.random() * 1000).setScale(2, RoundingMode.HALF_UP), id, type, account);
            }
        } catch (NumberFormatException e) {
            System.err.println(e);
        }
    }

    synchronized public void withdrawMoney(BigDecimal moneyToWithdraw, int atmId, TypeATM typeATM, Account account) {
            System.out.println("ATM id: " + atmId + "; ATM type: " + typeATM + "; You want to withdraw " + moneyToWithdraw + "; Withdraw operation finished" + "; Now your balance is: " + account.getAccountMoney());
    }

    synchronized public void depositMoney(BigDecimal moneyToWithdraw, int atmId, TypeATM typeATM, Account account) {
        System.out.println("ATM id: " + atmId + "; ATM type: " + typeATM +"; Sorry, you cant deposit money in this ATM type" + "; Now your balance is: " + account.getAccountMoney());
    }
}
