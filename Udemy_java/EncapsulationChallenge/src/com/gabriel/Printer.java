package com.gabriel;

public class Printer {
    private int tonerLevel;
    private int numOfPagesPrinted;
    private boolean isDuplexPrinter;

    public Printer(int tonerLevel, boolean isDuplexPrinter) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.isDuplexPrinter = isDuplexPrinter;
    }

    public int fillToner(int fill) {
        if (getTonerLevel() + fill <= 100) {
            this.tonerLevel += fill;
            return this.tonerLevel;
        } else {
            System.out.println("That is too much ink!");
            System.out.println("The current toner level is at " + getTonerLevel());
            System.out.println("Need " + (100 - getTonerLevel()) + " to fill toner to 100%");
            return -1;
        }
    }

    public int printPage(int numOfPages) {
        int pagesToPrint = numOfPages;
        if (this.isDuplexPrinter) {
            System.out.println("Note this is a Duplex printer and will print on both sides");
            pagesToPrint = (numOfPages % 2) + (numOfPages / 2);
            this.numOfPagesPrinted += pagesToPrint;
            return pagesToPrint;
        } else {
            this.numOfPagesPrinted += pagesToPrint;
            return pagesToPrint;
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumOfPagesPrinted() {
        return numOfPagesPrinted;
    }

    public boolean isDuplexPrinter() {
        return isDuplexPrinter;
    }
}
