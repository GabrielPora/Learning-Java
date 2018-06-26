package com.gabriel;

public class Nissan extends Car {
    private int roadServiceMonths;

    public Nissan(int roadServiceMonths) {
        super("4WD", "Nissan", 4, 5, 6, true);
        this.roadServiceMonths = roadServiceMonths;
    }

    @Override
    public void changingGears(int currentGear) {
        System.out.println("Nissan is ripping down the street");
        super.changingGears(currentGear);
        switch (currentGear) {
            case 1:
                move(20, 90);
                break;
            case 2:
                move(45,70 );
                break;
            case 3:
                move(80, 50);
                break;
            case 4:
                move(110, 10);
                break;
            case 5:
                move(160,5 );
                break;
            case 6:
                move(240, 1);
                break;
            default:
                move(0, 0);
        }
    }

    @Override
    public void move(int velocity, int direction) {
        velocity += 50;
        super.move(velocity, direction);
    }
}
