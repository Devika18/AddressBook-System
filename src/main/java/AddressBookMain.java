import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
    static ArrayList<Contact> AddressBook=new ArrayList();
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to AddressBook System Program");

        AddressBookMain addressBook=new AddressBookMain();
        Contact contact=addressBook.createContact();
        addressBook.addContact(contact);
        System.out.println(contact);

        System.out.println("Enter Name to edit Contact");
        String name=scanner.next();
        addressBook.editContact(name);
        System.out.println(contact);
    }

    Contact createContact(){
        System.out.println("Enter first name");
        String firstName=scanner.next();
        System.out.println("Enter last name");
        String lastName=scanner.next();
        System.out.println("Enter address");
        String address=scanner.next();
        System.out.println("Enter city");
        String city=scanner.next();
        System.out.println("Enter state");
        String state=scanner.next();
        System.out.println("Enter ZipCode");
        int zipCode=scanner.nextInt();
        System.out.println("Enter phoneNumber");
        long phoneNumber=scanner.nextLong();
        System.out.println("Enter Email");
        String email=scanner.next();

        Contact contact=new Contact(firstName,lastName,address,city,state,zipCode,phoneNumber,email);
        System.out.println("Created New Contact Successfully");
        return contact;
    }

    void addContact(Contact contact){
        AddressBook.add(contact);
        System.out.println("Contact added to AddressBook");
    }
    void editContact(String name){
        for (Contact contact : AddressBook){
            if (contact.firstName.equalsIgnoreCase(name)) {
                System.out.println("Enter first name");
                contact.firstName=scanner.next();
                System.out.println("Enter last name");
                contact.lastName=scanner.next();
                System.out.println("Enter address");
                contact.address=scanner.next();
                System.out.println("Enter city");
                contact.city=scanner.next();
                System.out.println("Enter state");
                contact.state=scanner.next();
                System.out.println("Enter ZipCode");
                contact.zipCode=scanner.nextInt();
                System.out.println("Enter phoneNumber");
                contact.phoneNumber=scanner.nextLong();
                System.out.println("Enter Email");
                contact.email=scanner.next();
                System.out.println("Contact Updated successfully.");
                break;
            }
        }
    }
}
