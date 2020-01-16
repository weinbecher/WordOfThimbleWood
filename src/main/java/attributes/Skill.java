package attributes;

import behaviours.ICast;
import players.Character;

public class Skill implements ICast {

    private String name;
    private SkillType skillType;

    public Skill(String name, SkillType skillType) {
        this.name = name;
        this.skillType = skillType;
    }

    public void cast(Character target) {

    }
}
