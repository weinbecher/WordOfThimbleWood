package attributes;

import behaviours.ICast;
import behaviours.IEquip;
import behaviours.IHeal;
import players.Character;

public class CrystalBall extends Item implements ICast, IEquip, IHeal {

    private ItemType itemType;

    public CrystalBall() {
       this.itemType = ItemType.CRYSTALBALL;
    }

    public void healPlayer() {
//        return ItemType.getHealValue();
    }

    public void cast(Character target) {
        int value = this.itemType.getAttackValue();
        target.dealDamage(value);
    }
}

