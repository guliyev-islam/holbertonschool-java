public class Client {

    int code;
    String name;
    boolean premium;

    public Client(int code, String name, boolean premium) {
        setCode(code);
        setName(name);
        setPremium(premium);
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }
}