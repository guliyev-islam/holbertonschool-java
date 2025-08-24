public class Employee {

    private String name;
    private int code; 
    private Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Employee(String name, int code, Address address) {
        setName(name);
        setCode(code);
        setAddress(address);
    }

    public void introduce() {
        System.out.printf("Code: %s\n", getCode());
        System.out.printf("Name: %s\n", getName());
        System.out.printf("District: %s\n", getAddress().getDistrict());
        System.out.printf("City: %s\n", getAddress().getCity());
        System.out.printf("Country: %s",getAddress().getCountry());
    }
}