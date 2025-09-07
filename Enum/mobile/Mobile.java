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
        
        int oldContactIndex = getContactPosition(oldContact.getName());
        int newContactIndex = getContactPosition(newContact.getName());
        
        if (oldContactIndex == -1) {
            throw new IllegalArgumentException("Could not modify contact. Contact does not exist");
        }
    
        if (!oldContact.getName().equals(newContact.getName())) {
            throw new IllegalArgumentException("Could not modify contact. Contact with this name already exists");
        }

        getContacts().set(oldContactIndex, newContact);
     }

     public void removeContact(Contact contact) throws IllegalArgumentException {
        
        int contactIndex = getContactPosition(contact.getName());
        
        if (contactIndex == -1) {
            throw new IllegalArgumentException("Could not remove contact. Contact does not exist");
        }
        
        getContacts().remove(getContacts().get(contactIndex));
    }

    public void listContacts() {
        for (Contact contact: getContacts()) {
            System.out.printf("%s -> %s (%s)\n", contact.getName(), contact.getPhoneNumber(), contact.getType());
        }
    }
}