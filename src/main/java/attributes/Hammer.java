package attributes;

import behaviours.ICast;
import behaviours.IEquip;
import behaviours.IHeal;
import behaviours.IWield;

public class Hammer extends Item implements IEquip, IWield {


    public Hammer() {
        super(ItemType.HAMMER);
    }


    public void wield() {

    }
}
