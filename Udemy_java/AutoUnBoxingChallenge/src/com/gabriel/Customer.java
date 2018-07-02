package com.gabriel;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double intitalAmount) {
        this.name = name;
        this.transactions= new ArrayList<Double>();
        addTransaction(intitalAmount);
    }

    public void addTransaction(double amount){
        // This is where we will put all our logic in
        this.transactions.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
