package com.gettingstarted.domain.modernpeople;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ModernPersonTests {

    @Test
    public void testCreateModernPerson() {

        ModernPerson firsModernPerson = ModernPerson.builder()
                .firstName("JohnP")
                .lastName("SmithP")
                .age(42)
                .build();

        assertEquals("JohnP", firsModernPerson.getFirstName());
        assertEquals("SmithP", firsModernPerson.getLastName());
        assertEquals(42, firsModernPerson.getAge());

    }
}
