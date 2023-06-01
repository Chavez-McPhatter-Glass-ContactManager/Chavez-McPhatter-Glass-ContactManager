import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class ContactManagerApp {

    public static void main(String[] args) {

        boolean exitRequested = false;
        while(!exitRequested) {
            listMenu(); // need to incorporate scanner then add functionality through switch statements
            int options = Integer.parseInt(sc.nextLine());
            switch (options) {
                case 1:
                    displayContacts(); // reads data from contacts.txt
                    break;
                case 2:
                    addContact(); // takes input from scanner and adds to contacts.txt
                    break;
                case 3:
                    searchContact(); // searches contact from contacts.txt
                    break;
                case 4:
                    deleteContact(); // deletes contact from contacts.txt
                    break;
                case 5:
                    exitApplication(); = true; // boolean prompt to exit program?
                    break;
            }
        }
    }

        Input userInput = new Input();
        userInput.getString();
//
//        info.add("two");
//        info.add("three");
//        contactList(info);
//        Path myFile = Paths.get("src", "contacts.txt");
//        System.out.println(Files.exists(myFile));
//        List<String> contact = Arrays.asList("Joe", "John", "Joseph");
//        try {
//            Files.write(myFile, contact);
//        }

    //    ------- FUNCTIONS -------
    public static void listMenu() {
        System.out.println("1. View Contacts.");
        System.out.println("2. Add a New Contact.");
        System.out.println("3. Search a Contact by Name.");
        System.out.println("4. Delete an existing contact.");
        System.out.println("5. Exit. \n");
        System.out.println("Enter an option (1, 2, 3, 4, or 5)");
    }

    private static void displayContacts() {
        List<String> groceryList = Arrays.asList("coffee", "milk", "sugar");
        Path filepath = Paths.get("src", "contacts.txt");
        Files.write(filepath, groceryList);



    }

    public static void addContact() {
        Hashtable<String, Contact> information = new Hashtable<>();
        try {
            Path test = Paths.get("contacts.txt");
            ArrayList<String> info = new ArrayList<>();
            info.add("one");
            Files.write(test, info);
        }catch (Exception ie){
            ie.printStackTrace();
        }
    }
    private static void searchContact() {
    }

    private static void deleteContact() {
    }

    private static void exitApplication() {
    }


}
