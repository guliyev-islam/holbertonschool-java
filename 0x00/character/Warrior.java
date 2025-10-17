import java.lang.reflect.Field;

public class Warrior extends Character {

    public Warrior(String name, int intelligence, int strength, int endurance, int resilience, int dexterity) throws Exception {
        if (strength <= intelligence || strength <= dexterity) {
            throw new Exception("Invalid attributes for WARRIOR");
        }
        super(name, CharacterType.WARRIOR ,intelligence, strength, endurance, resilience, dexterity);
    }

    public double getAttackDamage() {
        return (getStrength() * 0.8) + (getEndurance() * 0.05) + (getDexterity() * 0.1) + (getIntelligence() * 0.05);
    }


}