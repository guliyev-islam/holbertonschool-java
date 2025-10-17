public class ThiefBuilder implements Builder {
    private String name;
    private CharacterType type;
    private int intelligence;
    private int strength;
    private int endurance;
    private int resilience;
    private int dexterity;


    public Thief build() throws Exception {
        return new Thief(name, intelligence, strength, endurance, resilience, dexterity);
    }

    public String getName() {
        return name;
    }

    public CharacterType getType() {
        return type;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getEndurance() {
        return endurance;
    }

    public int getResilience() {
        return resilience;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setType(CharacterType type) {
        this.type = type;
    }

    @Override
    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    @Override
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    @Override
    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    @Override
    public void setResilience(int resilience) {
        this.resilience = resilience;
    }
}