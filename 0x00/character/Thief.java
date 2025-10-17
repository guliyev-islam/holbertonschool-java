import java.lang.reflect.Field;

public class Thief extends Character {
    public Thief(String name, int intelligence, int strength, int endurance, int resilience, int dexterity) throws Exception {
        if (dexterity <= strength || dexterity <= intelligence) {
            throw new Exception("Invalid attributes for THIEF");
        }
        super(name, CharacterType.THIEF, intelligence, strength, endurance, resilience, dexterity);
    }

    public double getAttackDamage() {
        return (getStrength() * 0.5) + (getDexterity() * 0.35) + (getEndurance() * 0.1) + (getIntelligence() * 0.05);
    }


}