package com.gettingstarted.domain.account;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class BankAccountTests {

    @Test
    public void testCreateBankAccount(){

        BankAccount firstAccount = new BankAccount();

        firstAccount.setName("John");
        firstAccount.setBalance(new BigDecimal(10));

        assertEquals( new BigDecimal(10), firstAccount.getBalance());
        assertEquals("John", firstAccount.getName());

    }

    @Test
    public void testCreateBankAccountWithName(){

        BankAccount firstAccount = new BankAccount("John");

        firstAccount.setBalance(new BigDecimal(25));

        assertEquals("John", firstAccount.getName());
        assertEquals(new BigDecimal(25), firstAccount.getBalance());

    }

    @Test
    public void testCreateBankAccountWithNameAndBalance(){

        BankAccount firstAccount = new BankAccount("David", new BigDecimal(45));

        assertEquals("David", firstAccount.getName());
        assertEquals(new BigDecimal(45), firstAccount.getBalance());

    }


}

