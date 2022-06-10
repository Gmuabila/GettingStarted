package com.gettingstarted.domain.people;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PersonTests {

    @Test
    public void testCreatePerson() {

        Person firstMan = new Person();

        firstMan.setFirstName("JohnA");
        firstMan.setLastName("SmithA");
        firstMan.setAge(44);

        assertEquals("JohnA", firstMan.getFirstName());
        assertEquals("SmithA", firstMan.getLastName());
        assertEquals(44, firstMan.getAge());


    }

}
