public class Employee {

    private double fixedSalary;

    Employee(double fixedSalary) {
        
        this.fixedSalary = fixedSalary;
    }

    double getFixedSalary() {
        
        return fixedSalary;
    }

    public double calculateBonus(Department department) {

        if (department.reachedTarget()) {
            return fixedSalary * 0.1d;
        }

        return 0d;
    }

    double calculateTotalSalary(Department department) {

        return fixedSalary + calculateBonus(department);
    }
}