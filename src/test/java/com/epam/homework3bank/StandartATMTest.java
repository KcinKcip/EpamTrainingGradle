package com.epam.homework3bank;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class StandartATMTest {
    Account account = new Account(new BigDecimal(100));
    StandartATM standartATM = new StandartATM(1, account);

    @Test(expected = NumberFormatException.class)
    public void testWithdrawMoney(){
        standartATM.withdrawMoney(new BigDecimal(200), 1, TypeATM.STANDART, account);
    }
}
