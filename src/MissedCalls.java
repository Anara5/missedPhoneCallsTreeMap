import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.TreeMap;

public class MissedCalls {

    // get current date time
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    // TreeMap for adding missed calls
    private Map<LocalDateTime, String> contacts = new TreeMap<>();

    // add missed number to the list
    void addMissedNumber(String phone) {
        contacts.put(LocalDateTime.now(), phone);
    }

    // to print out the list of missed phone calls
    public String toString(PhoneBook phoneBook) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<LocalDateTime, String> missed : contacts.entrySet()) {
            Contact contact = phoneBook.find(missed.getValue());
            sb
                    .append(FORMATTER.format(missed.getKey()))
                    .append("\t")
                    // comparing the input with phone book data
                    .append(contact == null ? missed.getValue() : contact.getName())
                    .append("\n");
        }
        return sb.toString();
    }
}
