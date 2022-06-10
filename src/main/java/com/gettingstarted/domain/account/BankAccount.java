package com.gettingstarted.domain.account;

import java.math.BigDecimal;

public class BankAccount {

    private String name;
    private BigDecimal balance;

    public BankAccount() {

    }

    public BankAccount(String name) {
        this.name = name;
    }

    public BankAccount(String name, BigDecimal balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

}
