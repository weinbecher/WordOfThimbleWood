package attributes;

import behaviours.ICast;
import behaviours.IEquip;
import behaviours.IHeal;

public class CrystalBall extends Item implements ICast, IEquip, IHeal {


    public CrystalBall() {
        super(ItemType.CRYSTALBALL);
    }

    public void healPlayer() {
//        return ItemType.getHealValue();
    }
}
