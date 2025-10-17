public class WesterosCharacterFactory extends CharacterFactory {
    @Override
    public Character createCharacter(CharacterType type, String name) throws Exception {
        return switch (type) {
            case CharacterType.MAGE -> new Mage(name, 8, 3, 3, 3, 4);
            case CharacterType.THIEF -> new Thief(name, 1, 8, 7, 7, 10);
            case CharacterType.WARRIOR -> new Warrior(name, 0, 9, 7, 10, 7);
            default -> null;
        };
    }
}