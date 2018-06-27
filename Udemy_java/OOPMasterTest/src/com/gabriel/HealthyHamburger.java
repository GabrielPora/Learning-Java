package com.gabriel;

public class HealthyHamburger extends Hamburger {
    private String healthyExtra1;
    private double priceHealthyExtra1;

    private String healthyExtra2;
    private double priceHealthyExtra2;

    public HealthyHamburger(String meat, double price) {
        super("Healthy", meat, price, "Brown Rye");
    }

    public void addHealthyExtra1(String name, double price) {
        this.healthyExtra1 = name;
        this.priceHealthyExtra1 = price;
    }

    public void addHealthyExtra2(String name, double price) {
        this.healthyExtra2 = name;
        this.priceHealthyExtra2 = price;
    }

    @Override
    public double basePrice() {
        return super.basePrice();
    }

    @Override
    public double additionPrice() {
        double currentPrice = super.additionPrice();
        if (this.healthyExtra1 != null) {
            currentPrice += this.priceHealthyExtra1;
            System.out.println("Added " + this.healthyExtra1 + " for an extra R" + this.priceHealthyExtra1);
        }
        if (this.healthyExtra2 != null) {
            currentPrice += this.priceHealthyExtra2;
            System.out.println("Added " + this.healthyExtra2 + " for an extra R" + this.priceHealthyExtra2);
        }
        return currentPrice;
    }

    @Override
    public double burgerPrice() {
        return super.burgerPrice();
    }
}
