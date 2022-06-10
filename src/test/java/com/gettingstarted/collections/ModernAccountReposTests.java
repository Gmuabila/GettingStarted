package com.gettingstarted.collections;
import com.gettingstarted.domain.modernaccount.ModernAccount;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class ModernAccountReposTests {

    @Test
    public void testCreateModernAccountRepos() {

        ModernAccountRepos repotest = new ModernAccountRepos();

//        ModernAccount firstAccount = ModernAccount.builder()
//                .name("bestname")
//                .balance(new BigDecimal(10))
//                .build();
        ModernAccount firstAccount = new ModernAccount("600299512", "Kennedy", new BigDecimal(780000));

        int accountNumber = repotest.storeAccount(firstAccount);

        ModernAccount returnedAccount = repotest.getAccount(accountNumber);

        assertEquals(0, accountNumber);
        assertEquals(firstAccount.getName(), returnedAccount.getName());
        assertEquals(firstAccount.getBalance(), returnedAccount.getBalance());

    }

}
