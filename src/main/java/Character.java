import java.util.Collections;
import java.util.List;

public class Character {
    private final String name;
    private final String race;
    private final String characterClass;
    private final List<String> skills;
    private final String weapon;

    public Character(CharacterBuilder builder) {
        this.name = builder.getName();
        this.race = builder.getRace();
        this.characterClass = builder.getCharacterClass();
        this.skills = Collections.unmodifiableList(builder.getSkills());
        this.weapon = builder.getWeapon();
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
