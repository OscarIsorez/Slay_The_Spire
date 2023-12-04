package main;

public class RecoveryRoom extends Room {

   protected String background;
    protected GroupofMonsters monsters;
    protected Hero hero;
    protected Pack draw;
    protected Pack discard;
    protected Pack exhaust;
    


    RecoveryRoom(
            String bg,
            GroupofMonsters monsters,
            Hero hero,
            Pack draw,
            Pack discard,
            Pack exhaust,
            int index
    ) {
        super(bg, monsters, hero, draw, discard, exhaust, index);



    }

}
