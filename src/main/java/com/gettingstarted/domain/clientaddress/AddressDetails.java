package com.gettingstarted.domain.clientaddress;

import lombok.*;
import java.math.BigDecimal;

@Builder
@Data
public class AddressDetails {
    private String streetName, buildingName, postCode;
    private BigDecimal houseNumber;

}
