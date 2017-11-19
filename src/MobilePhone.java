import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {

    private ArrayList<Contact> contacts = new ArrayList<Contact>();

    public void AddContact(Contact newContact) {
        if (!CheckExistingName(newContact.getContactName())) {
            contacts.add(newContact);
            System.out.println("New contact was added!");
        } else {
            System.out.println("Contact with this name already exists!");
        }
    }

    public void RemoveContact(String nameToRemove) {
        if (CheckExistingName(nameToRemove)) {
            if (GetContactIdx(nameToRemove) != -1) {
                contacts.remove(GetContactIdx(nameToRemove));
            }
        }
    }

    public void UpdateContact(String nameToUpdate, String telNum) {
        if (CheckExistingName(nameToUpdate)) {
            int idx = GetContactIdx(nameToUpdate);
            contacts.remove(idx);
            contacts.add(idx, new Contact(nameToUpdate, telNum));
        }
    }

    public void ShowContacts() {
        if (contacts.isEmpty()) {
            System.out.println("Address book is empty");
        } else {
            for (Contact conatct : contacts) {
                System.out.println("Contact Name: " + conatct.getContactName());
                System.out.println("Contact Number: " + conatct.getPhoneNumber());
                System.out.println("================================");
            }
        }
    }

    private boolean CheckExistingName(String nameToCheck) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getContactName().equals(nameToCheck)) {
                return true;
            }
        }
        return false;
    }

    private int GetContactIdx(String nameToFind) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getContactName().equals(nameToFind)) {
                return i;
            }
        }
        return -1;
    }


}
