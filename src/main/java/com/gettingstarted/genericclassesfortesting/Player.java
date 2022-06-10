package com.gettingstarted.genericclassesfortesting;

import lombok.*;

import java.util.Comparator;

@Data
public class Player implements Comparable<Player> {

    private int ranking;
    private String name;
    private int age;

    public Player(int ranking, String name, int age) {
        this.ranking = ranking;
        this.name = name;
        this.age = age;
    }

    public Player() {
    }

    public int compareTo(Player otherPlayer) {

        return Integer.compare(getRanking(), otherPlayer.getRanking());
    }

    }