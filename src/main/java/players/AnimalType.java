package players;

public enum AnimalType {
    OTTER(8,3,8),
    HAMSTER(5, 5, 5),
    BADGER(10, 3, 10),
    RABBIT(3, 3, 3),
    SHREW(2, 2, 6),
    MOUSE(3, 3 ,5),
    OWL(8, 2, 8),
    SQUIRREL(4, 8, 5),
    BORROWER(1, 2, 10);

    private final int attackValue;
    private final int defendValue;
    private final int healthPoints;

    AnimalType(int attackValue, int defendValue, int healthPoints){
        this.attackValue = attackValue;
        this.defendValue = defendValue;
        this.healthPoints = healthPoints;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public int getDefendValue() {
        return defendValue;
    }

    public int getHealthPoints() {
        return healthPoints;
    }
}
