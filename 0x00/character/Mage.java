import java.lang.reflect.Field;

public class Mage extends Character {
    public Mage(String name, int intelligence, int strength, int endurance, int resilience, int dexterity) throws Exception {
        if (intelligence <= strength || intelligence <= dexterity) {
            throw new Exception("Invalid attributes for MAGE");
        }
        super(name, CharacterType.MAGE ,intelligence, strength, endurance, resilience, dexterity);
    }

    public double getAttackDamage() {
        return (getIntelligence() * 0.8) + (getStrength() * 0.05) + (getDexterity() * 0.05) + (getEndurance() * 0.1);
    }

}