package com.gettingstarted.domain.animal;

import java.util.Comparator;

public class CatComparator implements Comparator<Cat> {

    @Override
    public int compare(Cat catOne, Cat catTwo) {

        return Integer.compare(catOne.getAge(), catTwo.getAge());
    }


}


