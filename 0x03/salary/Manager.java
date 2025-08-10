public class Manager extends Employee {
    
    Manager(double fixedSalary) {
        super(fixedSalary);
    }
    
    double calculateBonus(Department department) {
        
        if (department.reachedTarget()) {
            
            double bonus1 = this.getFixedSalary() * 0.2d;
            double bonus2 = (department.getAchievedTargetValue() - department.getTargetValue()) * 0.01d;
            
            return bonus1 + bonus2; 
        }
        
        return 0d;
    }
}