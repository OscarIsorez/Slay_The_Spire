package main;


public class BossFightRoom extends Room {
        
        Hero hero;
        String background;
        GroupofMonsters monsters; 
        Monster boss;

        BossFightRoom(
            String bg,
            GroupofMonsters monsters,
            Hero hero
        ) {

            super(bg, monsters, hero);
            this.boss = monsters.monsters.get(0);

        } 
    
}
