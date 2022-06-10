package com.gettingstarted.domain.animal;

import lombok.Builder;
import lombok.Data;

import java.util.Comparator;

@Data

//Cat class has been modified for testing purposes to implement comparator
//A test class has been implemented in genericclassesfortesting package.
public class Cat implements Comparable<Cat> {
    private String name;
    private String owner;
    private int age;

    public Cat (String name, int age, String owner){
        this.name = name;
        this.age = age;
        this.owner = owner;

    }

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Cat(String name){
        this.name = name;

    }

    public Cat(){

    }
    public int compareTo(Cat secondCat) {

        return Integer.compare(getAge(), secondCat.getAge());
    }



}

