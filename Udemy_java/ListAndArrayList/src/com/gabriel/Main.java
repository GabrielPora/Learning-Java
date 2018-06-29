package com.gabriel;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }
    }

    public static void processArrayList() {
        ArrayList<String> newArray = new ArrayList<String>();
        // Below will add all the items into the new array.
        newArray.addAll(groceryList.getGroceryList());
        System.out.println(Arrays.toString(new ArrayList[]{newArray}));

        // copying the entire array into the new array.
        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());

        // Converting your code back to a normal Array from ArrayList
        String[] normalArray = new String[groceryList.getGroceryList().size()];
        normalArray = groceryList.getGroceryList().toArray(normalArray);
        System.out.println("Normal Array: "+ Arrays.toString(normalArray));

    }

    public static void searchItem() {
        System.out.println("Enter item to search:");
        String searchItem = scanner.nextLine();
        if (groceryList.inList(searchItem)) {
            System.out.println("Found " + searchItem + " item in our grocery list");
        } else {
            System.out.println(searchItem + " item was not found in grocery list");
        }

    }

    public static void removeItem() {
        System.out.println("Enter item name:");
        String itemName = scanner.nextLine();
        groceryList.removeGroceryItem(itemName);
    }

    public static void modifyItem() {
        System.out.println("Enter current item name:");
        String itemName = scanner.nextLine();
        System.out.println("Enter replacement item name:");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemName, newItem);
    }

    public static void addItem() {
        System.out.println("Please enter grocery item:");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To copy everything into new arrays.");
        System.out.println("\t 7 - To quit the application.");
    }


}
