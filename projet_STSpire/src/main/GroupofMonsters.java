package main;

import java.util.ArrayList;

public class GroupofMonsters {
    ArrayList<Monster> monsters;

    GroupofMonsters(ArrayList<Monster> monsters) {
        this.monsters = monsters;
    }

    public int size() {
        return this.monsters.size();
    }
}
