package com.gettingstarted.domain.modernanimal;

import lombok.*;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ModernCat {
    private String name, owner;
    private int age;

    @Override
    public String toString() {
        return "Cat Name: " + name + "\nCat Owner: " + owner + "\nCat Age= " + age;
    }
}
