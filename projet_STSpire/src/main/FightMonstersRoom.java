package main;

public class FightMonstersRoom extends Room {
    
    GroupofMonsters monsters;
    Hero hero;
    int nbMonsters = monsters.size();
    String background;
    Pack draw;
    Pack discard;
    Pack exhaust;

    FightMonstersRoom(
        String bg,
        GroupofMonsters monsters,
        Hero hero,
        Pack draw,
        Pack discard,
        Pack exhaust,
        int index

    ) {
        super(bg, monsters ,hero, draw, discard, exhaust, index);
    }
    
}
