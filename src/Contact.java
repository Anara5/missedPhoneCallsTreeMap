import java.util.Objects;

public class Contact {

    private String name;
    private String number;

    Contact(String name, String number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact)) return false;
        Contact contact = (Contact) o;
        return name.equals(contact.name) &&
                number.equals(contact.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number);
    }

    @Override
    public String toString() {
        return name + " - " + number;
    }

    String getNumber() {
        return number;
    }

    String getName() {
        return name;
    }
}