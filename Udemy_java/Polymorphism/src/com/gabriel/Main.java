package com.gabriel;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot(){
        return "No plot here";
    }
}

class Jaws extends Movie{
    public Jaws(String name) {
        super(name);
    }

    // same as below
    public String plot(){
        return "A shark eats lots of people";
    }
}

class IndependenceDay extends Movie{
    public IndependenceDay() {
        super("Independence Day");
    }

    // same as above
    @Override
    public String plot() {
        return "Aliens attempt to take over planet earth";
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
    }


}
