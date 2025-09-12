public class Payroll {

    static public Double calculateNet(Employee employee, SalaryCalculator salaryCalculator) {
        return salaryCalculator.calculate(employee.getSalary());
    }       
    
}