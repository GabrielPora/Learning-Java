package com.gabriel;

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Independence Day");
    }

    // same as above
    @Override
    public String plot() {
        return "Aliens attempt to take over planet earth.";
    }
}