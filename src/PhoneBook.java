import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    // contacts list
    private HashMap<String, Contact> contacts = new HashMap<>();

    // to add contact to the phone book
    public void addContact(Contact contact) {
        contacts.put(contact.getNumber(), contact);
    }

    // to get contacts name if its phone number is in the phone book
    public Contact find(String value) {
        return contacts.get(value);
    }

    // to show the list of saved contacts from the phone book
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Contact> contactsInBook : contacts.entrySet()) {
            sb
                    .append("\t")
                    .append(contactsInBook.getValue()) // toString() from Contact: name + number
                    .append("\n");
        }
        return sb.toString();
    }
}