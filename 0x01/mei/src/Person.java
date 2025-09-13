import java.time.*;

public class Person {
    private String name;
    private String surname;
    private LocalDate birthDate;
    private boolean anotherCompanyOwner;
    private boolean pensioner;
    private boolean publicServer;
    private float salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setAnotherCompanyOwner(boolean anotherCompanyOwner) {
        this.anotherCompanyOwner = anotherCompanyOwner;
    }

    public void setPensioner(boolean pensioner) {
        this.pensioner = pensioner;
    }

    public void setPublicServer(boolean publicServer) {
        this.publicServer = publicServer;
    }

    public Person(
        String name,
        String surname,
        LocalDate birthDate,
        boolean anotherCompanyOwner,
        boolean pensioner,
        boolean publicServer
        ) {
            this.name = name;
            this.surname = surname;
            this.birthDate = birthDate;
            this.anotherCompanyOwner = anotherCompanyOwner;
            this.pensioner = pensioner;
            this.publicServer = publicServer;
        }

    public String fullName() {
        return String.format("%s %s", name, surname);
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float calculateYearlySalary() {
        return getSalary() * 12;
    }

    public boolean isMEI() {
        if (calculateYearlySalary() > 130000) {
            return false;
        }

        LocalDate now = LocalDate.now();
        int age = Period.between(birthDate, now).getYears();

        if (age < 18) {
            return false;
        }

        if (anotherCompanyOwner) {
            return false;
        }

        if (pensioner) {
            return false;
        }

        if (publicServer) {
            return false;
        }

        return true;
    }
}
