public class Program {
    public static void main(String[] args) {
        Employee employee1 = new Employee(2360d);

        double netSalary90percent = Payroll.calculateNet(employee1, x -> x * 0.9);
        double netSalaryPlus50 = Payroll.calculateNet(employee1, x -> x + 50);
        double netSalaryPlus10percent = Payroll.calculateNet(employee1, x -> x * 1.1);

        System.out.printf(String.format("%.2f - %.2f\n", employee1.getSalary(), netSalary90percent).replace(".", ","));
        System.out.printf(String.format("%.2f - %.2f\n", employee1.getSalary(), netSalaryPlus50).replace(".", ","));
        System.out.printf(String.format("%.2f - %.2f\n", employee1.getSalary(), netSalaryPlus10percent).replace(".", ","));
    }
}