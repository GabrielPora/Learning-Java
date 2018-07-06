package com.gabriel;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();

//        Bird bird = new Bird("Parrot");
//        bird.breathe();
//        bird.eat();
//        Above does not work so you change bird to parrot

        Parrot parrot = new Parrot("Ringneck");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        Penguin penguin = new Penguin("Emper");
        penguin.breathe();
        penguin.eat();
        penguin.fly();

    }
}
