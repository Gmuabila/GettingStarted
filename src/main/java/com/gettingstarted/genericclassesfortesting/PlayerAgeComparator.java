package com.gettingstarted.genericclassesfortesting;

import java.util.Comparator;

public class PlayerAgeComparator implements Comparator<Player> {

    @Override
    public int compare(Player playerThree, Player playerFour){

        return Integer.compare(playerThree.getAge(), playerFour.getAge());
    }

}
