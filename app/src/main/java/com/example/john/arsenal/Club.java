package com.example.john.arsenal;

import java.util.ArrayList;

/**
 * Created by John on 07/11/2017.
 */

public class Club {

    private ArrayList<Player> arsenal;

    public Club() {
        arsenal = new ArrayList<>();
        arsenal.add(new Player("Petr Cech", 33, 100000));
        arsenal.add(new Player("Hector Bellerin", 24, 100000));
        arsenal.add(new Player("Laurent Koscielny", 6, 75000));
        arsenal.add(new Player("Shkodran Mustafi", 20, 90000));
        arsenal.add(new Player("Sead Kolasinac", 31, 120000));
        arsenal.add(new Player("Granit Xhaka", 29, 90000));
        arsenal.add(new Player("Jack Wilshere", 10, 90000));
        arsenal.add(new Player("Aaron Ramsey", 8, 110000));
        arsenal.add(new Player("Mesut Ozil", 11, 140000));
        arsenal.add(new Player("Alexis Sanchez", 7, 140000));
        arsenal.add(new Player("Alexandre Lacazette", 9, 100000));
    }

    public ArrayList<Player> getArsenal() {
        return arsenal;
    }
}
