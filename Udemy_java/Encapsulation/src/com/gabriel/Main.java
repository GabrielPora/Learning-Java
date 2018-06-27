package com.gabriel;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // Lecture 70

        // this code does not use Encapsulation
//        Player player = new Player();
//
//        player.name = "Gabriel";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Gabriel", 50, "Sword");
        System.out.println("Initial health is " + player.getHealth());

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.getHealth());
    }
}
