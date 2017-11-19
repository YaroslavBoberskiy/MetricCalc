import java.util.Scanner;

public class Checker {

    private static MobilePhone phone = new MobilePhone();

    public static void main(String[] args) {
        while (true) {
            ManageContacts();
        }
    }

    public static void Menu () {
        System.out.println("==== PHONE ADDRESS BOOK ====");
        System.out.println("Enter 1 to add new contact");
        System.out.println("Enter 2 to list all contacts");
        System.out.println("Enter 3 to modify existing contact");
        System.out.println("Enter 4 to remove existing contact");
    }

    public static void ManageContacts () {
        Menu();
        Scanner menuInput = new Scanner(System.in);
        Scanner nameInput = new Scanner(System.in);
        Scanner telNumInput = new Scanner(System.in);

        String name;
        String telNum;

        switch (menuInput.nextInt()) {
            case 1:
                System.out.println("Enter new contact name");
                name = nameInput.nextLine();
                System.out.println("Enter new contact tel. num");
                telNum = telNumInput.nextLine();
                phone.AddContact(new Contact(name, telNum));
                break;

            case 2:
                phone.ShowContacts();
                break;

            case 3:
                System.out.println("Enter name to modify");
                name = nameInput.nextLine();
                System.out.println("Enter tel to modify");
                telNum = telNumInput.nextLine();
                phone.UpdateContact(name, telNum);
                break;

            case 4:
                System.out.println("Enter contacts name to remove");
                name = nameInput.nextLine();
                phone.RemoveContact(name);
        }
    }
}
