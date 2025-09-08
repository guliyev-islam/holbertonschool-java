import java.util.*;

public class PhoneList {

    private HashMap<String, HashSet<Phone>> phoneList;

    public PhoneList() {
        setPhoneList(new HashMap<String, HashSet<Phone>>());
    }

    public HashMap<String, HashSet<Phone>> getPhoneList() {
        return phoneList;
    }

    public void setPhoneList(HashMap<String, HashSet<Phone>> phoneList) {
        this.phoneList = phoneList;
    }

    public HashSet<Phone> addPhone(String name, Phone phone) throws Exception {

        if (!getPhoneList().containsKey(name)) {
            getPhoneList().put(name, new HashSet<Phone>());
        }
        
        HashSet<Phone> phones = getPhoneList().get(name); 

        for (HashSet<Phone> phonesList: getPhoneList().values()) {
            if (phonesList.contains(phone)) {
                if (phonesList.equals(phones)) {
                    throw new Exception("Phone already exists for this person");
                }
                throw new Exception("Phone already belongs to another person");
            }
        }


        phones.add(phone);

        getPhoneList().put(name, phones);

        return phones;
    }

    public HashSet<Phone> isFind(String name) {
        if (!getPhoneList().containsKey(name)) {
            return null;
        }

        HashSet<Phone> phones = getPhoneList().get(name);
        return phones;
    }
}