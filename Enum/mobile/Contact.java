public class Contact {

    private String name;
    private String phoneNumber;
    private NumberType type;

    public Contact(String name, String phoneNumber, NumberType type) {
        setName(name);
        setPhoneNumber(phoneNumber);
        setType(type);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public NumberType getType() {
        return type;
    }

    public void setType(NumberType type) {
        this.type = type;
    }

}