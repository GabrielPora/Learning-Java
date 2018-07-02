package com.gabriel;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Gabe", 526.54);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.18);
        System.out.println("Balance for customer " + customer.getName() + " is R" + customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(1);
        intList.add(3);
        intList.add(4);

        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i+": "+intList.get(i));
        }

        intList.add(1,2);
        System.out.println("\n****************################*************\n");
        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i+": "+intList.get(i));
        }

    }
}
