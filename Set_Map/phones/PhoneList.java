import java.util.*;

public class PhoneList {

    private HashMap<String, ArrayList<Phone>> phoneList;

    public PhoneList() {
        setPhoneList(new HashMap<String, ArrayList<Phone>>());
    }

    public HashMap<String, ArrayList<Phone>> getPhoneList() {
        return phoneList;
    }

    public void setPhoneList(HashMap<String, ArrayList<Phone>> phoneList) {
        this.phoneList = phoneList;
    }

    public void addPhone(String name, Phone phone) {
        if (!getPhoneList().containsKey(name)) {
            ArrayList<Phone> phones = new ArrayList<Phone>();
            phones.add(phone);
            getPhoneList().put(name, phones);
            return;
        }

        ArrayList<Phone> phones = getPhoneList().get(name);
        phones.add(phone);
    }

    public ArrayList<Phone> isFind(String name) {
        if (!getPhoneList().containsKey(name)) {
            return null;
        }

        ArrayList<Phone> phones = getPhoneList().get(name);
        return phones;
    }
}