package food;

abstract public class Food {

    protected int happinessPoints;

    public Food(int happinessPoints) {
        this.happinessPoints = happinessPoints;
    }

    public int getHappinessPoints() {
        return happinessPoints;
    }

    public void setHappinessPoints(int happinessPoints) {
        this.happinessPoints = happinessPoints;
    }
}