package com.epam.homework3bank;

import java.math.BigDecimal;

public class Account {
    private volatile BigDecimal accountMoney;

    Account(BigDecimal accountMoney){
        this.accountMoney = accountMoney;
    }

    synchronized public void setAccountMoney(BigDecimal accountMoney) {
        this.accountMoney = accountMoney;
    }

    synchronized public BigDecimal getAccountMoney() {
        return accountMoney;
    }
}

