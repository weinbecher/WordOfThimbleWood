package players;

import attributes.Pet;
import behaviours.IEquip;

import java.util.ArrayList;

public abstract class Character {
    private String name;
    private int healthPoints;
    private int wallet;
    private ClassType characterClass;
    private AnimalType animal;
    private IEquip equipped;
    private ArrayList<Pet> pets;

    public Character(String name, int healthPoints, int wallet, ClassType characterClass, AnimalType animal,
                     IEquip equipped) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.wallet = wallet;
        this.characterClass = characterClass;
        this.animal = animal;
        this.equipped = equipped;
        this.pets = new ArrayList<Pet>();
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getWallet() {
        return wallet;
    }

    public ClassType getCharacterClass() {
        return characterClass;
    }

    public AnimalType getAnimalType() {
        return animal;
    }

    public IEquip getEquipped() {
        return equipped;
    }

    public ArrayList<Pet> getPets(){
        return new ArrayList<Pet>(pets);
    }
}
