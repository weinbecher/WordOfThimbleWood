import attributes.CrystalBall;
import attributes.Item;
import behaviours.IEquip;
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

}

