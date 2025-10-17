import java.lang.reflect.Field;

public abstract class Character {
    private String name;
    private CharacterType type;
    private int intelligence;
    private int strength;
    private int endurance;
    private int resilience;
    private int dexterity;

    public Character(String name,
        CharacterType type,
        int intelligence,
        int strength,
        int endurance,
        int resilience,
        int dexterity) {
            this.name = name;
            this.type = type;
            this.intelligence = intelligence;
            this.strength = strength;
            this.endurance = endurance;
            this.resilience = resilience;
            this.dexterity = dexterity;
    }

    public abstract double getAttackDamage();

//    @Override
//    public String toString() {
//        StringBuilder stringBuilder = new StringBuilder("Character { ");
//
//        for (Field field : getClass().getDeclaredFields()) {
//            try {
//                field.setAccessible(true);
//                stringBuilder.append(field.getName());
//            } catch (Exception e){
//                System.out.println(e.getMessage());
//            }
//        }
//
//        stringBuilder.append(" }");
//        return stringBuilder.toString();
//    }

    @Override
    public String toString() {
        return String.format("Character { name = %s, type = %s, intelligence = %d, strength = %d, endurance = %d, resilience = %d, dexterity = %d, attack damage = %.2f }",
                getName(),
                getType(),
                getIntelligence(),
                getStrength(),
                getEndurance(),
                getResilience(),
                getDexterity(),
                getAttackDamage());
    }

    public String getName() {
        return this.name;
    }

    public CharacterType getType() {
        return this.type;
    }

    public int getIntelligence() {
        return this.intelligence;
    }

    public int getStrength() {
        return this.strength;
    }

    public int getEndurance() {
        return this.endurance;
    }

    public int getResilience() {
        return this.resilience;
    }

    public int getDexterity() {
        return this.dexterity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(CharacterType type) {
        this.type = type;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public void setResilience(int resilience) {
        this.resilience = resilience;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }
}