package main;


public class BossFightRoom extends Room {
        
        Hero hero;
        String background;
        GroupofMonsters monsters; 
        Monster boss;
        Pack draw;
        Pack discard;
        Pack exhaust;



        BossFightRoom(
            String bg,
            GroupofMonsters monsters,
            Hero hero,
            Pack draw,
            Pack discard,
            Pack exhaust,
            int index

        ) {

            super(bg, monsters, hero, draw, discard, exhaust, index);
            this.boss = monsters.monsters.get(0);

        } 
    
}
