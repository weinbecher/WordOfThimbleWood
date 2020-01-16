package attributes;

import players.AnimalType;

public class Pet {
    private String name;
    private AnimalType animalType;

    public Pet(String name, AnimalType animalType) {
        this.name = name;
        this.animalType = animalType;
    }

    public String getName() {
        return name;
    }

    public AnimalType getAnimalType() {
        return animalType;
    }
}
