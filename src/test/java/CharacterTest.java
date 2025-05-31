import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CharacterTest {

    @Test
    public void testCharacterBasicAttributes() {
        Character mage = new CharacterBuilder("Urias")
                .race("Elfa")
                .characterClass("Maga")
                .weapon("Cajado Mágico")
                .addSkill("Bola de Fogo")
                .addSkill("Escudo Arcano")
                .build();

        assertEquals("Urias", mage.getName());
        assertEquals("Elfa", mage.getRace());
        assertEquals("Maga", mage.getCharacterClass());
        assertEquals("Cajado Mágico", mage.getWeapon());

        List<String> skills = mage.getSkills();
        assertEquals(2, skills.size());
        assertTrue(skills.contains("Bola de Fogo"));
        assertTrue(skills.contains("Escudo Arcano"));
    }

    @Test
    public void testCharacterWithNoOptionalFields() {
        Character simple = new CharacterBuilder("Testinho")
                .build();

        assertEquals("Testinho", simple.getName());
        assertNull(simple.getRace());
        assertNull(simple.getCharacterClass());
        assertNull(simple.getWeapon());
        assertTrue(simple.getSkills().isEmpty());
    }

    @Test
    public void testSkillsListIsUnmodifiable() {
        Character warrior = new CharacterBuilder("Helder")
                .addSkill("Ataque Poderoso")
                .build();

        List<String> skills = warrior.getSkills();

        assertThrows(UnsupportedOperationException.class, () -> {
            skills.add("Tentativa de trapaça");
        });
    }

    @Test
    public void testMultipleCharactersIndependence() {
        Character mage = new CharacterBuilder("Urias")
                .race("Elfa")
                .characterClass("Maga")
                .addSkill("Bola de Fogo")
                .build();

        Character warrior = new CharacterBuilder("Helder")
                .race("Humano")
                .characterClass("Guerreiro")
                .addSkill("Ataque Poderoso")
                .build();

        assertNotEquals(mage.getName(), warrior.getName());
        assertNotEquals(mage.getCharacterClass(), warrior.getCharacterClass());
        assertFalse(warrior.getSkills().contains("Bola de Fogo"));
    }
}
