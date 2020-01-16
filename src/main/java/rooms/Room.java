package rooms;

import behaviours.IGenerate;

import java.util.ArrayList;

public abstract class Room {
    private ArrayList<IGenerate> enemies;
    private ArrayList<IGenerate> treasureChest;
    private String name;

    public Room(String name) {
        this.name = name;
        this.enemies = new ArrayList<IGenerate>();
        this.treasureChest = new ArrayList<IGenerate>();
    }

    public ArrayList<IGenerate> getEnemies() {
        return new ArrayList<IGenerate>(enemies);
    }

    public ArrayList<IGenerate> getTreasureChest() {
        return new ArrayList<IGenerate>(treasureChest);
    }

    public String getName() {
        return name;
    }
}
