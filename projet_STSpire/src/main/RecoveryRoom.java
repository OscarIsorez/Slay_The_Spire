package main;

public class RecoveryRoom extends Room {

    Hero hero;
    String background;
    GroupofMonsters monsters; // will be empty

    RecoveryRoom(
            String bg,
            GroupofMonsters monsters,
            Hero hero) {
        super(bg, monsters, hero);

    }

}
