package com.gabriel;

public class DeluxeHamburger extends Hamburger {
    public DeluxeHamburger() {
        super("Deluxe", "Beef & Bacon",24.99, "white");
        super.addTopping1("Chips", 9.99);
        super.addTopping2("Drink",13.99);
    }

    @Override
    public void addTopping1(String name, double price) {
        System.out.println("Overriding the class");
    }

    @Override
    public void addTopping2(String name, double price) {
        System.out.println("Overriding the class");
    }

    @Override
    public void addTopping3(String name, double price) {
        System.out.println("Overriding the class");
    }

    @Override
    public void addTopping4(String name, double price) {
        System.out.println("Overriding the class");
    }
}
