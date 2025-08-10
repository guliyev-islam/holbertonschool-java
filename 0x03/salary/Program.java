public class Program {

    public static void main(String[] args) {
        Department engineeringDepartment = new Department(1000, 1100);
        Department documentationDepartment = new Department(1000, 800);

        Employee engineeringEmployee1 = new Employee(2300);
        Employee engineeringEmployee2 = new Employee(3650);
        Manager engineeringManager = new Manager(5800);

        Employee documentationEmployee1 = new Employee(2500);
        Employee documentationEmployee2 = new Employee(3000);
        Manager documentationManager = new Manager(4980);

        printBonuses(engineeringEmployee1, engineeringDepartment);
        printBonuses(engineeringEmployee2, engineeringDepartment);
        printBonuses(engineeringManager, engineeringDepartment);
        printBonuses(documentationEmployee1, documentationDepartment);
        printBonuses(documentationEmployee2, documentationDepartment);
        printBonuses(documentationManager, documentationDepartment);
    }

    private static void printBonuses(Employee employee, Department department) {
        String fixedSalary = Double.toString(employee.getFixedSalary());
        String totalSalary = Double.toString(
            employee.calculateTotalSalary(department)
        );
        String bonus = Double.toString(employee.calculateBonus(department));

        System.out.printf(
            "Fixed Salary: %s,%s - Total Salary: %s,%s - Bonus Amount: %s,%s\n",
            fixedSalary.split("[.]")[0], fixedSalary.split("[.]")[1].length() == 1 ? fixedSalary.split("[.]")[1] + "0" : fixedSalary.split("[.]")[1],
            totalSalary.split("[.]")[0], totalSalary.split("[.]")[1].length() == 1 ? totalSalary.split("[.]")[1] + "0" : totalSalary.split("[.]")[1],
            bonus.split("[.]")[0], bonus.split("[.]")[1].length() == 1 ? bonus.split("[.]")[1] + "0" : bonus.split("[.]")[1]
        );
    }
}
