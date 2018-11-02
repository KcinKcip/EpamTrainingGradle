package com.epam.homework3bank;

import java.math.BigDecimal;

public abstract class ATM implements Runnable{
    int id;
    Account account;
    TypeATM type;

    @Override
    public abstract void run();
    synchronized public void showBalance(int atmId, TypeATM typeATM, Account account) {
        System.out.println("ATM id: " + atmId + "; ATM type: " + typeATM + "; Your BALANCE is: " + account.getAccountMoney());
    }
}
