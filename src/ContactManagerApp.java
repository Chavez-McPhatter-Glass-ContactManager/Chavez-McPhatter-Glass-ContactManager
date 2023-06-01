import utils.Input;
import java.awt.*;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;

public class ContactManagerApp {

    public static void main(String[] args) {
//        menuList();
//        Input userInput = new Input();
//        userInput.getString();

        info.add("two");
        info.add("three");
        contactList(info);
        Path myFile = Paths.get("src", "contacts.txt");
//        System.out.println(Files.exists(myFile));
//        List<String> contact = Arrays.asList("Joe", "John", "Joseph");
//        try {
//            Files.write(myFile, contact);
//        }

    }

    public static void menuList() {
        System.out.println("1. View Contacts.");
        System.out.println("2. Add a New Contact.");
        System.out.println("3. Search a Contact by Name.");
        System.out.println("4. Delete an existing contact.");
        System.out.println("5. Exit. \n");
        System.out.println("Enter an option (1, 2, 3, 4, or 5)");
    }

    public static Hashtable contactList(ArrayList<String> info) {
        Hashtable<String, Contact> information = new Hashtable<>();
        try {
            Path test = Paths.get("contacts.txt");
            ArrayList<String> info = new ArrayList<>();
            info.add("one");
            Files.write(test, info);
        }catch (Exception ie){
            ie.printStackTrace();
        }
            return information;
    }
}
