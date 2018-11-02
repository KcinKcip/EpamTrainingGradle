package com.epam.homework3bank;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static com.epam.homework3bank.TypeATM.STANDART;

public class StandartATM extends ATM {

    StandartATM(int identificationNumber, Account bankAccount) {
        this.id = identificationNumber;
        this.account = bankAccount;
        this.type = STANDART;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++){
                showBalance(id, type, account);
                depositMoney(new BigDecimal(Math.random() * 1000).setScale(2, RoundingMode.HALF_UP), id, type, account);
                withdrawMoney(new BigDecimal(Math.random() * 1000).setScale(2, RoundingMode.HALF_UP),  id, type, account);
            }
        } catch (NumberFormatException e) {
            System.err.println(e);
        }
    }

    synchronized public void withdrawMoney(BigDecimal moneyToWithdraw, int atmId, TypeATM typeATM, Account account) {
        if (account.getAccountMoney().compareTo(moneyToWithdraw) != -1) {
            account.setAccountMoney(account.getAccountMoney().subtract(moneyToWithdraw));
            System.out.println("ATM id: " + atmId + "; ATM type: " + typeATM + "; You want to withdraw " + moneyToWithdraw + "; Withdrow operation finished!" + "; Now your balance is: " + account.getAccountMoney());
        } else {
            throw new NumberFormatException("ATM id: " + atmId + "; ATM type: " + typeATM + " Withdraw operation denied! You dont have enough money!");
        }
    }

    synchronized public void depositMoney(BigDecimal moneyToDeposit, int atmId, TypeATM typeATM, Account account) {
        account.setAccountMoney(account.getAccountMoney().add(moneyToDeposit));
        System.out.println("ATM id: " + atmId + "; ATM type: " + typeATM + "; You want to deposit " + moneyToDeposit +"; Deposit operation finished; Now your balance is: " + account.getAccountMoney());
    }
}
