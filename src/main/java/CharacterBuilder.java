import java.util.ArrayList;
import java.util.List;

public class CharacterBuilder {
    private final String name;
    private String race;
    private String characterClass;
    private List<String> skills = new ArrayList<>();
    private String weapon;

    public CharacterBuilder(String name) {
        this.name = name;
    }

    public CharacterBuilder race(String race) {
        this.race = race;
        return this;
    }

    public CharacterBuilder characterClass(String characterClass) {
        this.characterClass = characterClass;
        return this;
    }

    public CharacterBuilder addSkill(String skill) {
        this.skills.add(skill);
        return this;
    }

    public CharacterBuilder weapon(String weapon) {
        this.weapon = weapon;
        return this;
    }

    public Character build() {
        return new Character(this);
    }

    public String getName() {
        return name;
    }

    public String getRace() {
        return race;
    }

    public String getCharacterClass() {
        return characterClass;
    }

    public List<String> getSkills() {
        return skills;
    }

    public String getWeapon() {
        return weapon;
    }
}
