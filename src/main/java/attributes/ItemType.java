package attributes;

import com.sun.corba.se.impl.ior.JIDLObjectKeyTemplate;

public enum ItemType {
    CRYSTALBALL(3, 15),
    SWORD(15, 0),
    HAMMER(12, 0),
    AXE(20, 0),
    WAND(10, 10),
    MAGICCARPET(0, 0),
    TREEBRANCH(5, 0),
    MAGICCHOPSTICKS(7, 17);

    private final int attackValue;
    private final int healValue;

    ItemType(int attackValue, int healValue) {
        this.attackValue = attackValue;
        this.healValue = healValue;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public int getHealValue() {
        return healValue;
    }
}
