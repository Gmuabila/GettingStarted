package com.gettingstarted.useraddress;

import lombok.*;
import org.springframework.data.annotation.Id;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor

public class ClientAddress {
    @Id
    private String id;
    private String doorNumber;
    private String streetName;
    private String postCode;
    private String city;

}
