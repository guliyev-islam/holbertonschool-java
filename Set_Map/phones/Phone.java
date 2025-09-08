public class Phone {

    private String areaCode;
    private String number;

    public Phone(String areaCode, String number) {
        setAreaCode(areaCode);
        setNumber(number);
    }
    
    public String getAreaCode() {
        return areaCode;
    }

    public String getNumber() {
        return number;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        String string = String.format("(%s) %s", getAreaCode(), getNumber());
        return string;
    }
}
