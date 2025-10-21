import java.util.List;

public class Person {
    private int code;
    private String name;
    private String position;
    private int age;
    private double salary;
    private List<String> hobbies;

    public Person(int code,
        String name,
        String position,
        int age,
        double salary,
        List<String> hobbies) {
            setCode(code);
            setName(name);
            setPosition(position);
            setAge(age);
            setSalary(salary);
            setHobbies(hobbies);
    }

    @Override
    public String toString() {
        return String.format("[%d] %s %s %d $ %.2f",
        this.code,
        this.name,
        this.position,
        this.age,
        this.salary).replace(".", ",");
    }

    public int getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public String getPosition() {
        return this.position;
    }

    public int getAge() {
        return this.age;
    }

    public double getSalary() {
        return this.salary;
    }

    public List<String> getHobbies() {
        return this.hobbies;
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

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }
}