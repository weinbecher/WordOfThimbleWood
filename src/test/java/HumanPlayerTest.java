import attributes.CrystalBall;
import attributes.Hammer;
import attributes.Item;
import attributes.ItemType;
import behaviours.IEquip;
import behaviours.IWield;
import org.junit.Before;
import org.junit.Test;
import players.AnimalType;
import players.ClassType;
import players.HumanPlayer;

import static org.junit.Assert.assertEquals;

public class HumanPlayerTest {

    HumanPlayer human1;
    IEquip crystalBall;

    @Before
    public void before(){
        crystalBall = new CrystalBall();
        human1 = new HumanPlayer("Sophia", 100, 50, ClassType.WITCH, AnimalType.BORROWER, crystalBall);
    }

    @Test
    public void hasName(){
        assertEquals("Sophia", human1.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(100, human1.getHealthPoints());
    }

    @Test
    public void hasWallet(){
        assertEquals(50, human1.getWallet());
    }

    @Test
    public void hasClassType(){
        assertEquals(ClassType.WITCH, human1.getCharacterClass());
    }

    @Test
    public void hasAnimalType(){
        assertEquals(AnimalType.BORROWER, human1.getAnimalType());
    }

    @Test
    public void hasEquippedItem(){
        assertEquals(crystalBall, human1.getEquipped());
    }

    @Test
    public void canAddItem(){
        Hammer hammer1 = new Hammer();
        Hammer hammer2 = new Hammer();
        human1.addItem(hammer1);
        human1.addItem(hammer2);
        assertEquals(2,human1.getItems().size());
    }
    @Test
    public void canChangeEquippedItem(){
        Hammer hammer1 = new Hammer();
        human1.addItem(hammer1);
        IEquip hammerToBeEquipped = (IEquip)human1.selectEquipped(hammer1);
        human1.equip(hammerToBeEquipped);
        assertEquals(hammer1, human1.getEquipped());

    }

}

