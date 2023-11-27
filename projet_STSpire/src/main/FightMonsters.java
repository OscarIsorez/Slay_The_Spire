package main;

public class FightMonsters extends Room {
    
    GroupofMonsters monsters;
    Hero hero;
    int nbMonsters = monsters.size();
    String background;

    FightMonsters(
        String bg,
        GroupofMonsters monsters,
        Hero hero
    ) {
        super(bg, monsters ,hero);
    }
    
}
