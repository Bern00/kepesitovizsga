package hu.nive.ujratervezes.kepesitovizsga.army;

import java.util.ArrayList;
import java.util.List;

public class Army {

    private List<MilitaryUnit> militaryUnits = new ArrayList<>();


    public void addUnit(MilitaryUnit militaryUnit){
        militaryUnits.add(militaryUnit);
    } //amivel egy katonai egységet tudunk hozzáadni a sereghez,

    public void damageAll(int damage){
        for(MilitaryUnit militaryUnit: militaryUnits){
            militaryUnit.sufferDamage(damage);
        }
    } //ami a sereg minden egységének életerejéből levonja a paraméterül kapott értéket, valamint eltávolítja a seregből azokat az egységeket, melyeknek így 25 pont alá csökkent az életerejük (azaz harcképtelenek vagy halottak),

    public int getArmyDamage(){
        int result = 0;
        for(MilitaryUnit militaryUnit: militaryUnits){
            result += militaryUnit.doDamage();
        }
        return result;
    } //ami visszaadja, hogy az aktuális támadással mennyi sebzést okoz a sereg összesen,

    public int getArmySize(){
        return militaryUnits.size();
    } //ami visszaadja, hogy hány egységből áll a sereg.

}



