package com.gabriel;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public VipCustomer(String name, double creditLimit) {
        this(name,creditLimit,"Default email");
        System.out.println(("Two param constructor called"));
    }

    public VipCustomer() {
        this("Default name",
                3200.00,
                "Default email");
        System.out.println(("Empty constructor called"));
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
