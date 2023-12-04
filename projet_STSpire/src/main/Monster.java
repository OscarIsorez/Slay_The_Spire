package main;


public class Monster extends Character {
    protected String name;
    protected int maxHP;
    protected PatternMonster pattern; 
    protected int currentHP;
    // protected moves = new ArrayList<Function>();


    public Monster(String name, int maxHP, PatternMonster pattern) {
        this.name = name;
        this.maxHP = maxHP;
        this.currentHP = maxHP;
    
    }



}
