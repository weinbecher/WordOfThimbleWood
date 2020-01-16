package players;

import behaviours.ICast;
import behaviours.IEquip;
import behaviours.IHeal;
import behaviours.IWield;

import java.util.ArrayList;

public class HumanPlayer extends Character {

    private ArrayList<IWield> attackItems;
    private ArrayList<ICast> spells;
    private ArrayList<IHeal> healingItems;


    public HumanPlayer(String name, int healthPoints, int wallet, ClassType characterClass, AnimalType animal, IEquip equipped) {
        super(name, healthPoints, wallet, characterClass, animal, equipped);
        this.attackItems = new ArrayList<IWield>();
        this.healingItems = new ArrayList<IHeal>();
        this.spells = new ArrayList<ICast>();
    }


    public ArrayList<IWield> getAttackItems() {
        return new ArrayList<IWield>(attackItems);
    }

    public ArrayList<ICast> getSpells() {
        return new ArrayList<ICast>(spells);
    }

    public ArrayList<IHeal> getHealingItems() {
        return new ArrayList<IHeal>(healingItems);
    }
}
