package com.gabriel;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // Time to test code
        Printer printer = new Printer(20,false);
        System.out.println("Initial page count = "+printer.getNumOfPagesPrinted());
        int pagesPrinted = printer.printPage(5);
        System.out.println("Printed "+pagesPrinted+" pages and the new print count for printer = "+printer.getNumOfPagesPrinted());

        pagesPrinted = printer.printPage(2);
        System.out.println("Printed "+pagesPrinted+" pages and the new print count for printer = "+printer.getNumOfPagesPrinted());

        printer.fillToner(50);
        printer.printPage(5);
    }
}
