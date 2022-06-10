package com.gettingstarted.domain.modernpeople;

import lombok.*;

@Builder
@Data
public class ModernPerson {
    private String firstName, lastName;
    private int age;

}
