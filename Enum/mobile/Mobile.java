import java.util.ArrayList;
public class Mobile {

    ArrayList<Contact> contacts;
    
    public Mobile() {
        setContacts(new ArrayList<Contact>());
    }
    
    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    public int getContactPosition(String name) {
        for (Contact contact: getContacts()) {
            if (contact.getName().equals(name)) {
                return getContacts().indexOf(contact);
            }
        }

        return -1;
     }

     public void addContact(Contact contact) throws IllegalArgumentException {
        if (getContactPosition(contact.getName()) != -1) {
            throw new IllegalArgumentException("Could not add contact. Contact with this name already exists");
        }

        getContacts().add(contact);
     }

     public void updateContact(Contact oldContact, Contact newContact) throws IllegalArgumentException {
        if (!getContacts().contains(oldContact)) {
            throw new IllegalArgumentException("Could not modify contact. Contact does not exist");
        }

        if (getContacts().contains(newContact)) {
            throw new IllegalArgumentException("Could not modify contact. Contact with this name already exists");
        }

        getContacts().set(getContacts().indexOf(oldContact), newContact);
     }

     public void removeContact(Contact contact) throws IllegalArgumentException {
        if (getContactPosition(contact.getName()) == -1) {
            throw new IllegalArgumentException("Could not remove contact. Contact does not exist");
        }
        
        getContacts().remove(contact);
    }

    public void listContacts() {
        for (Contact contact: getContacts()) {
            System.err.printf("%s -> %s (%s)\n", contact.getName(), contact.getPhoneNumber(), contact.getType());
        }
    }
}