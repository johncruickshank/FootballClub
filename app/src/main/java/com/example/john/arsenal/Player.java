package com.example.john.arsenal;

/**
 * Created by John on 07/11/2017.
 */

public class Player {

    private String name;
    private int squadNumber;
    private int weeklyWage;

    public Player(String name, int squadNumber, int weeklyWage) {
        this.name = name;
        this.squadNumber = squadNumber;
        this.weeklyWage = weeklyWage;
    }

    public String getName() {
        return name;
    }

    public int getSquadNumber() {
        return squadNumber;
    }

    public int getWeeklyWage() {
        return weeklyWage;
    }
}
