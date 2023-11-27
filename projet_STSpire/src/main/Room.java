package main;




/* must be converted to abastract later on 
 * bc after we will have to implement the differents methods in the subclasses,
 * which will be named the same, but will have different implementations
 * 
*/
public class Room {

    protected String background;
    protected GroupofMonsters monsters;
    protected Hero hero;
    protected int nbMonsters = monsters.size();



    Room(
        String bg,
        GroupofMonsters monsters, // lenght = 3 : FightMonsters ; lenght = 1 : BossFightRoom ; lenght = 0 : RecoveryRoom
        Hero hero
    ) {
        this.background = bg;
        this.monsters = monsters;
        this.hero = hero;
    }

    public void fight() {
        /* logic of the fight */
    }

    public void display() {
        /* display all the components of the room */
    }

    public void update() {
        /* update the room */
    }

    public void isOver() {
        /* check if the fight is over */
    }

    public void isWon() {
        /* check if the fight is won */
    }

    public void isLost() {
        /* check if the fight is lost */
    }

    public void nextRoom() {
        /* go to the next room */
    }



}
