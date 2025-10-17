public class MiddleEarthCharacterFactory extends CharacterFactory {
    @Override
    public Character createCharacter(CharacterType type, String name) throws Exception {
        return switch (type) {
            case CharacterType.MAGE -> new Mage(name, 10, 2, 5, 3, 4);
            case CharacterType.THIEF -> new Thief(name, 2, 6, 8, 5, 10);
            case CharacterType.WARRIOR -> new Warrior(name, 1, 8, 5, 10, 6);
            default -> null;
        };
    }
}