import food.*;
import mood.*;

public class Character {

    public int happinessPoints;

    Character() {
        this.happinessPoints = 0;
    }

    public Mood getCurrentMood() {

        if (15 < happinessPoints) {
            return new VeryHappy();
        } else if (0 < happinessPoints) {
            return new Happy();
        } else if (-6 < happinessPoints) {
            return new Sad();
        } else {
            return new Angry();
        }
    }

    public void eat(Food[] foods) {
        for (Food food: foods) {
            happinessPoints += food.getHappinessPoints();
        }
    }

    @Override
    public String toString() {
        return String.format("%d - %s", happinessPoints, getCurrentMood().toString());
    }
}