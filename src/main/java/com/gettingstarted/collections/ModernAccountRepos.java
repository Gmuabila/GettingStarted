package com.gettingstarted.collections;


import com.gettingstarted.domain.modernaccount.ModernAccount;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ModernAccountRepos {

    private List<ModernAccount> modernAccountArrayList = new ArrayList<>();

    public ModernAccountRepos() {
    }

    public ModernAccountRepos(List<ModernAccount> modernAccountArrayList) {
        this.modernAccountArrayList = modernAccountArrayList;
    }

    public List<ModernAccount> getAllAccount() {

        return modernAccountArrayList;
    }

    public ModernAccount getAccount (int accountNumber) {

        return modernAccountArrayList.get(accountNumber);
    }

    public int storeAccount (ModernAccount account) {
        modernAccountArrayList.add(account);
        return modernAccountArrayList.size() - 1;
    }

}
