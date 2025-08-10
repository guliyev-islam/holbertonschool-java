public class CharacterGame {

    private int currentHealth;
    private String name;
    private String status;

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
        
        if (this.currentHealth > 0) {
            this.status = "alive";
        } else {
            this.status = "dead";
        }
        
    }

    public String getName() {
        return name;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void takeDamage(int damageAmount) {
        setCurrentHealth(currentHealth - damageAmount);

        if (currentHealth < 0) {
            setCurrentHealth(0);;
        }
    }

    public void receiveHealing(int healingAmount) {
        setCurrentHealth(currentHealth + healingAmount);

        if (currentHealth > 100) {
            setCurrentHealth(100);
        }
    }
    
    
}
