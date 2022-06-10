package com.gettingstarted.domain.clientaddress;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class AddressDetailsTests {

    @Test
    public void testAddressDetails() {

        AddressDetails personOneAddressDetails = AddressDetails.builder()
                .streetName("Sedan Street")
                .buildingName("Grand House")
                .postCode("N1 4MT")
                .houseNumber(new BigDecimal(15))
                .build();

        assertEquals("Sedan Street", personOneAddressDetails.getStreetName());
        assertEquals("Grand House", personOneAddressDetails.getBuildingName());
        assertEquals("N1 4MT", personOneAddressDetails.getPostCode());
        assertEquals(new BigDecimal(15), personOneAddressDetails.getHouseNumber());


    }

}
