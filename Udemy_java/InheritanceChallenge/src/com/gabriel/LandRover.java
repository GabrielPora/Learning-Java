package com.gabriel;

public class LandRover extends Car {
    private int roadServiceMonths;

    public LandRover(int roadServiceMonths) {
        super("4WD", "LandRover", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    @Override
    public void changingGears(int currentGear) {
        System.out.println("LandRover is driving down the street");
        super.changingGears(currentGear);
    }

    @Override
    public void accelerate(int rate) {
        super.accelerate(rate);
    }

    @Override
    public void move(int velocity, int direction) {
        velocity += 50;
        super.move(velocity, direction);
    }
}
