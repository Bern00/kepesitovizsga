package hu.nive.ujratervezes.kepesitovizsga.army;

public class HeavyCavalry extends MilitaryUnit{

    private int hitPoints = 150;
    private int damage = 20;
    private boolean armor = true;
    private int damageNumber = 0;
    @Override
    public int doDamage() {
        int result = damage;
        damageNumber++;
        if(damageNumber == 1){
            result = damage * 3;
        }
        return result;

    }

    @Override
    public void sufferDamage(int damage) {
        this.hitPoints -= damage / 2;
    }

    public int getHitPoints() {
        return hitPoints;
    }


}
