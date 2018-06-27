package com.gabriel;

public class Player {

//    Below should always be private but this is to show why to use Encapsulation
//    This class does not use Encapsulation
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        this.health = this.health - damage;
        if (this.health <= 0){
            System.out.println("Player knocked out");
        }
    }

    public int healthRemaining(){
        return this.health;
    }

}
