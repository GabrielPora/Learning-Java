package com.gabriel;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("FNB");

        bank.addBranch("JHB");
        bank.addCustomer("JHB", "Gabe", 250699.99);
        bank.addCustomer("JHB", "Max", 1256.23);
        bank.addCustomer("JHB", "Geff", 9465.56);

        bank.addBranch("PE");
        bank.addCustomer("PE", "Gabriel", 25068.99);

        bank.addCustomerTransaction("JHB", "Gabe", 250.01);
        bank.addCustomerTransaction("JHB", "Max", 1256.07);
        bank.addCustomerTransaction("JHB", "Geff", 9465.04);

        bank.listCustomers("JHB", true);
        bank.listCustomers("PE", true);

        bank.addBranch("CPT");
        if (!bank.addCustomer("CPT","Brain",9638.25)){
            System.out.println("Error CPT branch does not exist");
        }

        if (!bank.addBranch("CPT")){
            System.out.println("CPT branch already exist");
        }

        if (!bank.addCustomer("CPT", "Gabriel", 53.68)){
            System.out.println("Customer does not exist at branch");
        }

        if (!bank.addCustomer("JHB","Gabe", 52.52)){
            System.out.println("Customer Gabe already exists!");
        }

    }
}
