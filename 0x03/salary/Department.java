public class Department {

    private double targetValue;
    private double achievedTargetValue;

    double getTargetValue() {

        return targetValue;
    }

    double getAchievedTargetValue() {

        return achievedTargetValue;
    }

    Department(double targetValue, double achievedTargetValue) {    

        this.targetValue = targetValue;
        this.achievedTargetValue = achievedTargetValue;
    }
    
    boolean reachedTarget() {

        return achievedTargetValue >= targetValue;
    }
}
