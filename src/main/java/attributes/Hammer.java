package attributes;

import behaviours.ICast;
import behaviours.IEquip;
import behaviours.IHeal;
import behaviours.IWield;
import players.Character;

public class Hammer extends Item implements IEquip, IWield {
    private ItemType itemType;

    public Hammer(){
        this.itemType = ItemType.HAMMER;
    }


    public void wield(Character target) {
        int value = this.itemType.getAttackValue();
        target.dealDamage(value);
    }

}
