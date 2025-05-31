public class Main {
    public static void main(String[] args) {
        Character mage = new CharacterBuilder("Urias")
                .race("Elfa")
                .characterClass("Maga")
                .weapon("Cajado Mágico")
                .addSkill("Bola de Fogo")
                .addSkill("Escudo Arcano")
                .addSkill("Teleporte")
                .build();

        Character warrior = new CharacterBuilder("Helder")
                .race("Humano")
                .characterClass("Guerreiro")
                .weapon("Espada Longa")
                .addSkill("Ataque Poderoso")
                .addSkill("Defesa de Ferro")
                .build();

    }
}
