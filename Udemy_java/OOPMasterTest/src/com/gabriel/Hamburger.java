package com.gabriel;

public class Hamburger {
    private String name;
    private String rollType;
    private double price;
    private String meat;
    private String additionTopping1;
    private String additionTopping2;
    private String additionTopping3;
    private String additionTopping4;

    private double priceTopping1;
    private double priceTopping2;
    private double priceTopping3;
    private double priceTopping4;


    public Hamburger(String name, String meat, double price, String rollType) {
        this.name = name;
        this.rollType = rollType;
        this.price = price;
        this.meat = meat;
    }

    public void addTopping1(String name, double price) {
        this.additionTopping1 = name;
        this.priceTopping1 = price;
    }

    public void addTopping2(String name, double price) {
        this.additionTopping2 = name;
        this.priceTopping2 = price;
    }

    public void addTopping3(String name, double price) {
        this.additionTopping3 = name;
        this.priceTopping3 = price;
    }

    public void addTopping4(String name, double price) {
        this.additionTopping4 = name;
        this.priceTopping4 = price;
    }

    public double basePrice() {
        System.out.println(this.name + " hamburger\n" + "with " + this.meat + "\non a " + this.rollType + " roll\n" + "price is R" + this.price);
        return this.price;
    }

    public double additionPrice() {
        double currentPrice = 0;
        if (this.additionTopping1 != null) {
            currentPrice += this.priceTopping1;
            System.out.println("Added " + this.additionTopping1 + " for an extra R" + this.priceTopping1);
        }
        if (this.additionTopping2 != null) {
            currentPrice += this.priceTopping2;
            System.out.println("Added " + this.additionTopping2 + " for an extra R" + this.priceTopping2);
        }
        if (this.additionTopping3 != null) {
            currentPrice += this.priceTopping3;
            System.out.println("Added " + this.additionTopping3 + " for an extra R" + this.priceTopping3);
        }
        if (this.additionTopping4 != null) {
            currentPrice += this.priceTopping4;
            System.out.println("Added " + this.additionTopping4 + " for an extra R" + this.priceTopping4);
        }
        return currentPrice;
    }

    public double burgerPrice() {
        double total = basePrice() + additionPrice();
        System.out.println("Hamburger total Price is R"+ String.format("%.2f", total));
        return total;
    }


}
