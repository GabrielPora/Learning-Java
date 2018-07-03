package com.gabriel;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        addInOrder(placesToVisit, "Sydney");
        addInOrder(placesToVisit, "Melbourne");
        addInOrder(placesToVisit, "Brisbane");
        addInOrder(placesToVisit, "Perth");
        addInOrder(placesToVisit, "Canberra");
        addInOrder(placesToVisit, "Adelaide");
        addInOrder(placesToVisit, "Darwin");

        System.out.println("Original List");
        System.out.println("#############################");
        printList(placesToVisit);

        placesToVisit.add(1, "JHB");
        placesToVisit.add(5, "CPT");
        System.out.println("added List");
        System.out.println("*****************************");
        printList(placesToVisit);
        placesToVisit.remove(6);
        System.out.println("removed List");
        System.out.println("//////////////////////////////");
        printList(placesToVisit);
        addInOrder(placesToVisit, "NewYork");
        addInOrder(placesToVisit, "JHB");
        System.out.println("added again List");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        printList(placesToVisit);

        visit(placesToVisit);

    }

    private static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean directionForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if (cities.isEmpty()) {
            System.out.println("No cities in the itinerary");
            return;
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }
        while (!quit) {
            int action = scanner.nextInt();
            switch (action) {
                case 0:
                    System.out.println("Holiday over");
                    quit = true;
                    break;
                case 1:
                    if (!directionForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        directionForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list");
                        directionForward = false;
                    }
                    break;
                case 2:
                    if (directionForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        directionForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the list");
                        directionForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions:\npress ");
        System.out.println("0 - to quit\n" +
                "1 - go to next city\n" +
                "2 - go to previous city\n" +
                "3 - print menu options");
    }

    private static boolean addInOrder(LinkedList<String> placesToVisit, String newCity) {
        ListIterator<String> stringListIterator = placesToVisit.listIterator(); // this does not automatically point to the first entry

        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0) {
                // equal, do not add.
                System.out.println(newCity + " is already included as a destination");
                return false;
            } else if (comparison > 0) {
                // new city should appear before this one
                // Brisbane -> Adelaide
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if (comparison < 0) {
                // move on next city
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void printList(LinkedList<String> placesToVisit) {
        Iterator<String> i = placesToVisit.iterator();
        while (i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("===================================");
    }
}
