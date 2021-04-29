package hu.nive.ujratervezes.kepesitovizsga.army;

public class Archer extends MilitaryUnit{

    private int hitPoints = 50;
    private int damage = 20;
    private boolean armor = false;

    @Override
    public int doDamage() {
        return damage;
    }

    @Override
    public void sufferDamage(int damage) {
        this.hitPoints -= damage;
    }

    public int getHitPoints() {
        return hitPoints;
    }

}
