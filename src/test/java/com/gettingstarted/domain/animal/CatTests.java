package com.gettingstarted.domain.animal;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CatTests {

    @Test
    public void testCreateCat() {
        Cat firstCat = new Cat();

        firstCat.setName("CatA");
        firstCat.setAge(6);
        firstCat.setOwner("OwnerA");

        assertEquals("CatA", firstCat.getName());
        assertEquals(6, firstCat.getAge());
        assertEquals("OwnerA", firstCat.getOwner());
    }

    @Test
    public void testCreateCatWithName() {
        Cat secondCat = new Cat("CatB");

        secondCat.setAge(11);
        secondCat.setOwner("OwnerB");

        assertEquals("CatB", secondCat.getName());
        assertEquals(11, secondCat.getAge());
        assertEquals("OwnerB", secondCat.getOwner());
    }

    @Test
    public void testCreateCatWithNameAndAge() {
        Cat thirdCat = new Cat("CatC", 15);

        thirdCat.setOwner("OwnerC");

        assertEquals("CatC", thirdCat.getName());
        assertEquals(15, thirdCat.getAge());
        assertEquals("OwnerC", thirdCat.getOwner());
    }

    @Test
    public void testCreateCatWithNameAgeAndOwner() {
        Cat fourthCat = new Cat("CatD", 7, "OwnerD");

        assertEquals("CatD", fourthCat.getName());
        assertEquals(7, fourthCat.getAge());
        assertEquals("OwnerD", fourthCat.getOwner());
    }

}
