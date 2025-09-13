public class Person {

    private int code;
    private String name;
    private String position;
    private int age;
    private double salary;

    public Person(int code,
            String name,
            String position,
            int age,
            double salary) {
        setCode(code);
        setName(name);
        setPosition(position);
        setAge(age);
        setSalary(salary);
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("[%d] %s %s %d $ %f", getCode(), getName(), getPosition(), getAge(), getSalary()).replace(".", ",");
    }
}