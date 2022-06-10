package com.gettingstarted.domain.modernanimal;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class ModernCatTest {

    @Test
    public void testCreateModernCat() {
        ModernCat firstModernCat = ModernCat.builder()
                .name("ModernCatA")
                .age(9)
                .owner("ModernCatOwnerA")
                .build();

        assertEquals("ModernCatA", firstModernCat.getName());
        assertEquals(9, firstModernCat.getAge());
        assertEquals("ModernCatOwnerA", firstModernCat.getOwner());

    }

}
