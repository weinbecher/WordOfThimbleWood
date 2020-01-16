package rooms;

import behaviours.IGenerate;

import java.util.ArrayList;

public class BirdNest extends Room{
    private ArrayList<IGenerate> enemies;
    private ArrayList<IGenerate> treasureChest;
    private IGenerate egg1;
    private IGenerate egg2;
    private IGenerate egg3;

    public BirdNest(String name, IGenerate egg1, IGenerate egg2, IGenerate egg3) {
        super(name);
        this.treasureChest = new ArrayList<IGenerate>();
        this.enemies = new ArrayList<IGenerate>();
        this.egg1 = egg1;
        this.egg2 = egg2;
        this.egg3 = egg3;
    }

    public IGenerate getEgg1() {
        return egg1;
    }

    public IGenerate getEgg2() {
        return egg2;
    }

    public IGenerate getEgg3() {
        return egg3;
    }
}
