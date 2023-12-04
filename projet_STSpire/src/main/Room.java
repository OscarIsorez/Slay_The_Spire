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
    protected int index;
    protected boolean isOver = false;
    protected boolean isWon = false;
    protected Pack draw;
    protected Pack discard;
    protected Pack exhaust;


    // ------------------------------ CONSTRUCTORS ------------------------------ //

    Room(
        String bg,
        GroupofMonsters monsters, // lenght = 3 : FightMonsters ; lenght = 1 : BossFightRoom ; lenght = 0 : RecoveryRoom
        Hero hero,
        Pack draw,
        Pack discard,
        Pack exhaust,
        int index
    ) {
        this.background = bg;
        this.monsters = monsters;
        this.hero = hero;
        this.draw = draw;
        this.discard = discard;
        this.exhaust = exhaust;
        this.index = index;
    }

    // ------------------------------ SETTERS ------------------------------ //

    public void setIndex(int index) {
        this.index = index;
    }

    public void setNbMonsters(int nbMonsters) {
        this.nbMonsters = nbMonsters;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public void setMonsters(GroupofMonsters monsters) {
        this.monsters = monsters;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }

    public void setDraw(Pack draw) {
        this.draw = draw;
    }

    public void setDiscard(Pack discard) {
        this.discard = discard;
    }

    public void setExhaust(Pack exhaust) {
        this.exhaust = exhaust;
    }

    // ------------------------------ GETTERS ------------------------------ // 


    public int getIndex() {
        return this.index;
    }

    public int getNbMonsters() {
        return this.nbMonsters;
    }

    public String getBackground() {
        return this.background;
    }

    public GroupofMonsters getMonsters() {
        return this.monsters;
    }

    public Hero getHero() {
        return this.hero;
    }

    // ------------------------------ METHODS ------------------------------ //

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
