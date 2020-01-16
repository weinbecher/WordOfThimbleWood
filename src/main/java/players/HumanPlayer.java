package players;

import attributes.Hammer;
import attributes.Item;
import behaviours.ICast;
import behaviours.IEquip;
import behaviours.IHeal;
import behaviours.IWield;

import java.util.ArrayList;

public class HumanPlayer extends Character {

    private ArrayList<Item> items;



    public HumanPlayer(String name, int healthPoints, int wallet, ClassType characterClass, AnimalType animal, IEquip equipped) {
        super(name, healthPoints, wallet, characterClass, animal, equipped);
        this.items = new ArrayList<Item>();
    }


    public ArrayList<Item> getItems() {
        return new ArrayList<Item>(items);
    }


    public void addItem(Item item){
        items.add(item);
    }

    public IEquip selectEquipped(Item item) {
        if (item instanceof IEquip && items.contains(item)){
            int index = items.indexOf(item);
            IEquip equippableItem = (IEquip)items.get(index);
            return equippableItem;
        } else {
            return getEquipped();
        }
    }

    public void equip(IEquip item) {
        setEquipped(item);
    }
}
