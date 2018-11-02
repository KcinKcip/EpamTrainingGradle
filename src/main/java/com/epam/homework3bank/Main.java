package com.epam.homework3bank;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Account account = new Account(BigDecimal.valueOf(1000));
        Thread atm1 = new Thread(new StandartATM(1, account));
        Thread atm2 = new Thread(new OnlyShowBalanceATM(2, account));
        Thread atm3 = new Thread(new StandartATM(3, account));
        Thread atm4 = new Thread(new FabulousATM(4, account));

        atm1.start();
        atm2.start();
        atm3.start();
        atm4.start();
    }
}
