package com.gettingstarted.domain.modernaccount;

import com.gettingstarted.modernuser.ModernUser;
import lombok.*;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;

@Builder
@Data
@NoArgsConstructor
//@AllArgsConstructor
public class ModernAccount {
    @Id
    private String id;
    private String name;
    private BigDecimal balance;

    public ModernAccount(String id, String name, BigDecimal balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public ModernAccount(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public ModernAccount(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
    @Override
    public String toString(){
        return ("Account Holder ID: " + id + "\nAccount Holder Name is: " + name + "\nAccount Balance: " + balance);
    }

}
