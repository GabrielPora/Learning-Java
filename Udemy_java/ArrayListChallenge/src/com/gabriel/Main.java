package com.gabriel;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("0039 330 4404");

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();
        while (!quit) {
            System.out.println("Enter your action: ");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }
    }

    private static void queryContact() {
        System.out.println("Enter existing contact name");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if (existingContact==null){
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Name: "+existingContact.getName()+" phone number: "+existingContact.getPhoneNumber());
    }


    private static void removeContact() {
        System.out.println("Enter existing contact name to update");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if (existingContact==null){
            System.out.println("Contact not found");
            return;
        }

        if (mobilePhone.removeContact(existingContact)){
            System.out.println("Successfully removed record");
        }else{
            System.out.println("Error removed record.");
        }
    }

    private static void updateContact() {
        System.out.println("Enter existing contact name to update");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if (existingContact==null){
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Enter new Contact name:");
        String newName = scanner.nextLine();
        System.out.println("Enter new phone number:");
        String newPhone = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newPhone);
        if (mobilePhone.updateContact(existingContact, newContact)){
            System.out.println("Successfully updated record");
        }else{
            System.out.println("Error updating record.");
        }

    }

    private static void addContact() {
        System.out.println("Enter new contact name:");
        String name = scanner.nextLine();
        System.out.println("Enter phone number:");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name,phone);
        if (mobilePhone.addNewContact(newContact)){
            System.out.println("Added new Contact: "+name+", phone: "+phone);
        } else {
            System.out.println("Contact cannot be added");
            System.out.println("Contact "+name+" already exists");
        }
    }

    private static void startPhone() {
        System.out.println("Starting phone...");
    }

    private static void printActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0  - to shutdown\n" +
                "1  - to print contacts\n" +
                "2  - to add a new contact\n" +
                "3  - to update existing an existing contact\n" +
                "4  - to remove an existing contact\n" +
                "5  - query if an existing contact exists\n" +
                "6  - to print a list of available actions.");
        System.out.println("Choose your action: ");
    }
}
