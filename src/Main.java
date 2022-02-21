import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // all names and numbers list from the phoneBook
        PhoneBook phoneBook = new PhoneBook();

        fillContacts(phoneBook);

        System.out.println("\nPhone Book:");
        System.out.println(phoneBook);

        // missed calls list
        MissedCalls missedPhones = new MissedCalls();

        while (true) {
            System.out.println("Enter phone number ([end] for exit)");
            try {
                String input = scanner.nextLine();

                if (input.equals("end")) {
                    System.out.println("Missed calls:");
                    System.out.println(missedPhones.toString(phoneBook));
                    break;
                } else {
                    missedPhones.addMissedNumber(input);
                }
            }
            catch (Exception e) {
                System.out.println("Wrong format");
            }
        }
    }

    private static void fillContacts(PhoneBook phoneBook) {
        phoneBook.addContact(new Contact("Anara", "+46 765 456 78 90"));
        phoneBook.addContact(new Contact("Alex", "+46 750 123 45 67"));
        phoneBook.addContact(new Contact("Sophia", "+7 932 123 45 98"));
        phoneBook.addContact(new Contact("Josef", "+46 700 78 90 16"));
    }
}
