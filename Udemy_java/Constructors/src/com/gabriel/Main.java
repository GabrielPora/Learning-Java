package com.gabriel;

public class Main {

    public static void main(String[] args) {
        // write your code here
        BankAccount defaultAccount = new BankAccount();
        BankAccount bobsAccount = new BankAccount(
                "12345",
                0.00,
                "Bob Brown",
                "myemail@bob.com",
                "(087) 123-456"); // this is the same as the bottom.
        BankAccount testing3Params = new BankAccount(
                "testing",
                "test@tsting.com",
                "123456");
//        bobsAccount.setAccountNumber("12345");
//        bobsAccount.setBalance(0.00);
//        bobsAccount.setCustomerName("Bob Brown");
//        bobsAccount.setEmail("myemail@bob.com");
//        bobsAccount.setPhoneNumber("(087) 123-456");
        bobsAccount.withdrawFunds(100.0);
        bobsAccount.depositFunds(50.0);
        bobsAccount.withdrawFunds(50.0);

        System.out.println(testing3Params.getAccountNumber() + " name " + testing3Params.getCustomerName());

        VipCustomer noParam = new VipCustomer();
        VipCustomer twoParam = new VipCustomer("Two Param", 15000);
        VipCustomer allParam = new VipCustomer("All Param", 25000, "all@param.com");

        System.out.println("name: " + noParam.getName() + " credit: " + noParam.getCreditLimit() + " email: " + noParam.getEmailAddress());
        System.out.println("name: " + twoParam.getName() + " credit: " + twoParam.getCreditLimit() + " email: " + twoParam.getEmailAddress());
        System.out.println("name: " + allParam.getName() + " credit: " + allParam.getCreditLimit() + " email: " + allParam.getEmailAddress());
    }
}
