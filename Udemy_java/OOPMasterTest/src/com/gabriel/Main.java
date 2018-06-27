package com.gabriel;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Hamburger hamburger = new Hamburger("Basic", "Beef", 16.38, "white");
        double price = hamburger.burgerPrice();
        hamburger.addTopping1("Cheese", 5);
        hamburger.addTopping2("Letters", 5);
        hamburger.addTopping3("Cheese", 5);
        hamburger.addTopping4("Letters", 5);
        System.out.println("Hamburger total Price is R" + String.format("%.2f", hamburger.burgerPrice()));

        HealthyHamburger healthyHamburger = new HealthyHamburger("Chicken", 19.99);
        healthyHamburger.addHealthyExtra1("Cheese", 5.9);
        healthyHamburger.addHealthyExtra2("Letters", 5.9);
        healthyHamburger.burgerPrice();

        DeluxeHamburger deluxeHamburger = new DeluxeHamburger();
        deluxeHamburger.burgerPrice();

    }
}
