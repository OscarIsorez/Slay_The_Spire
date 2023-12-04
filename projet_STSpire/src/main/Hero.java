package main;

public class Hero extends Character{
    protected Pack hand;
    protected int maxEnergy;
    protected int currentEnergy;
    

    public Hero(
        int maxHP,
        int currentHP,
        Pack hand,
        int maxEnergy,
        int currentEnergy
    ) {
        super(maxHP, currentHP);
        this.hand = hand;
        this.maxEnergy = maxEnergy;
        this.currentEnergy = currentEnergy;


    }


    public Pack getHand() {
        return hand;
    }


    public void setHand(Pack hand) {
        this.hand = hand;
    }


    public int getMaxEnergy() {
        return maxEnergy;
    }


    public void setMaxEnergy(int maxEnergy) {
        this.maxEnergy = maxEnergy;
    }


    public int getCurrentEnergy() {
        return currentEnergy;
    }


    public void setCurrentEnergy(int currentEnergy) {
        this.currentEnergy = currentEnergy;
    }
    

}