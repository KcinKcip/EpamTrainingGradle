package com.epam.homework3bank;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static com.epam.homework3bank.TypeATM.ONLY_SHOW_BALANCE;

public class OnlyShowBalanceATM extends ATM {
    OnlyShowBalanceATM(int identificationNumber, Account bankAccount) {
        this.id = identificationNumber;
        this.account = bankAccount;
        this.type = ONLY_SHOW_BALANCE;
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

    public void withdrawMoney(BigDecimal moneyToWithdraw, int atmId, TypeATM typeATM, Account account) {
        System.out.println("ATM id: " + atmId + "; ATM type: " + typeATM + "; Sorry, this ATM can only show your balance, withdraw is not available" + "; Now your balance is: " + account.getAccountMoney());
    }

    synchronized public void depositMoney(BigDecimal moneyToWithdraw, int atmId, TypeATM typeATM, Account account) {
        System.out.println("ATM id: " + atmId + "; ATM type: " + typeATM + "; Sorry, this ATM can only show your balance, deposit is not available " + "; Now your balance is: " + account.getAccountMoney());
    }
}
