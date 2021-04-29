package hu.nive.ujratervezes.kepesitovizsga.army;

public class Swordsman extends MilitaryUnit{

    private int hitPoints = 100;
    private int damage = 10;
    private boolean armor;
    private boolean isShield = true;

    public Swordsman(boolean armor) {
        this.armor = armor;
    }

    @Override
    public int doDamage() {
        return damage;
    }

    @Override
    public void sufferDamage(int damage) {
        if(!isShield){
            int attack = damage;
            if(armor){
                attack = damage / 2;
            }
            hitPoints -= attack;
        }
        isShield = false;
    }

    public int getHitPoints() {
        return hitPoints;
    }

}
