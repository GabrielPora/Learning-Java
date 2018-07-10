package com.gabriel;

public class Main {

    public static void main(String[] args) {
        Account gabeAccount = new Account("Gabe");
        gabeAccount.deposit(1000);
        gabeAccount.withdraw(500);
        gabeAccount.withdraw(-200);
        gabeAccount.deposit(-20);
        gabeAccount.calculateBalance();
//        gabeAccount.balance = 5000;

        System.out.println("Balance on account" + gabeAccount.getAccountName() + " is " + gabeAccount.getBalance());
//        gabeAccount.transactions.add(4500);
        gabeAccount.calculateBalance();
    }
}
