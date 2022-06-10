package com.gettingstarted.modernuser;

import com.gettingstarted.domain.modernaccount.ModernAccount;
import com.gettingstarted.useraddress.ClientAddress;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ModernUser {
    @Id
    private String id;
    private String firstName, lastName;
    private ModernAccount modernAccountIn;
    private ClientAddress clientAddressIn;

}
