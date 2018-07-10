package com.gabriel;

public class Main {

    public static void main(String[] args) {
	String varFour = "This is private to main";

        ScopeCheck scopeInstance = new ScopeCheck();
        scopeInstance.useInner();
        System.out.println("scopeInstance var1 is "+ scopeInstance.getVarOne());
        System.out.println("String varFour is "+varFour);

        scopeInstance.timesTwo();
        System.out.println("========================================");
        ScopeCheck.InnerClss innerClss = scopeInstance.new InnerClss();
        innerClss.timesTwo();
    }
}
