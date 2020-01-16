import attributes.*;
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
    HumanPlayer human2;
    IEquip crystalBall;
    IEquip hammer;
    Pet pet;


    @Before
    public void before(){
        crystalBall = new CrystalBall();
        pet = new Pet("Audrey",AnimalType.HAMSTER);
        hammer = new Hammer();
        human1 = new HumanPlayer("Sophia", 100, 50, ClassType.WITCH, AnimalType.BORROWER, crystalBall);
        human2 = new HumanPlayer("Hitchia", 3, 50, ClassType.CLERIC, AnimalType.BADGER, hammer);

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
    public void canDropItem(){
        Hammer hammer1 = new Hammer();
        Hammer hammer2 = new Hammer();
        human1.addItem(hammer1);
        human1.addItem(hammer2);
        human1.dropItem(hammer1);
        assertEquals(true,human1.getItems().contains(hammer2));
        assertEquals(1,human1.getItems().size());
    }

    @Test
    public void canChangeEquippedItem(){
        Hammer hammer1 = new Hammer();
        human1.addItem(hammer1);
        human1.equip(hammer1);
        assertEquals(hammer1, human1.getEquipped());
        assertEquals(true, human1.getItems().contains(crystalBall));
    }

    @Test
    public void canCast(){
        human1.cast(human2);
        assertEquals(3,human2.getHealthPoints());
    }

    @Test
    public void cannotCastWithHammer(){
        human1.addItem((Item)hammer);
        human1.equip(hammer);
        human1.cast(human2);
        assertEquals(3,human2.getHealthPoints());
        assertEquals(hammer, human1.getEquipped());

    }

    @Test
    public void canWield(){
        human2.wield(human1);
        assertEquals(90,human1.getHealthPoints());
    }

    @Test
    public void cannotWieldWithCrystalBall(){
        human2.addItem((Item)crystalBall);
        human2.equip(crystalBall);
        human2.wield(human1);
        assertEquals(100,human1.getHealthPoints());
        assertEquals(crystalBall, human2.getEquipped());

    }

    @Test
    public void canHavePet(){
        human1.addPet(pet);
        assertEquals(1,human1.getPets().size());
    }

    @Test
    public void petCanDefend(){
        human1.addPet(pet);
        human2.wield(human1);
        assertEquals(95,human1.getHealthPoints());
    }



}

