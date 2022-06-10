package com.gettingstarted.domain.modernaccount;

import org.junit.Test;
import org.springframework.boot.Banner;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class ModernAccountTests {

    @Test
    public void testCreateBankAccount(){
//Below code removed as Lombok creating issue with toString Method not working
//        ModernAccount firstAccount = ModernAccount.builder()
//                .id("194674")
//                .name("John")
//                .balance(new BigDecimal(10))
//                .build();
        ModernAccount firstAccount = new ModernAccount("77599228881", "James Anton", new BigDecimal(5550000));

        assertEquals( new BigDecimal(5550000), firstAccount.getBalance());
        assertEquals("James Anton", firstAccount.getName());
        assertEquals("77599228881", firstAccount.getId());
    }


}
