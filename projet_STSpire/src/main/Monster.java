package main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Monster extends Character {
    protected String name;
    protected PatternMonster pattern; 
    protected List<Function> moves;


    public Monster(String name, int maxHP, PatternMonster pattern, ArrayList<Function> moves) {
        super(maxHP, maxHP);
        this.name = name;
        this.pattern = pattern;
        this.moves = moves;
    
    }



}
