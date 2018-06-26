package com.gabriel;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(String accountNumber,
                       double balance,
                       String customerName,
                       String email,
                       String phoneNumber) {
        System.out.println("Account constructor with param called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("9877",0.00,customerName,  email,  phoneNumber);
    }

    public BankAccount(){
        this("12345",
                0.00,
                "Default name",
                "Default email",
                "Default phone");
        System.out.println(("Empty constructor called"));
    }

    public void depositFunds(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit Transaction is processed. Deposited amount of R" + depositAmount);
        System.out.println("Your new balance is R" + this.balance);
    }

    public void withdrawFunds(double withdrawalAmount) {
        if (this.balance >= withdrawalAmount) {
            this.balance -= withdrawalAmount;
            System.out.println("Withdraw Transaction is processed");
            System.out.println("Your remaining balance is R" + this.balance);
        } else {
            System.out.println("You do not have enough funds");
            System.out.println("Your current balance is R" + this.balance);
            System.out.println("Withdraw Transaction not processed");
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
