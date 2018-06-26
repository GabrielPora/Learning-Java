package com.gabriel;

public class Car extends Vehicle {
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;

    public Car(String size, String name, int wheels, int doors, int gears, boolean isManual) {
        super(size, name);
        this.gears = gears;
        this.wheels = wheels;
        this.doors = doors;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changingGears(int currentGear) {
        if (this.currentGear <= currentGear) {
            System.out.println("Gearing Up!");
        } else {
            System.out.println("Gearing Down!");
        }
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): Changed to " + this.currentGear + " gear.");
    }

    public void changeVelocity(int velocity, int direction) {
        System.out.println("Car.changeVelocity(): Velocity " + velocity + " direction " + direction);
        super.move(velocity, direction);
    }

    public void accelerate(int rate){
        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity <= 0){
            stop();
            changingGears(1);
        } else if (newVelocity>0&&newVelocity<=30){
            changingGears(1);
        }else if (newVelocity>30&&newVelocity<=60){
            changingGears(2);
        }else if (newVelocity>60&&newVelocity<=90){
            changingGears(3);
        }else if (newVelocity>90&&newVelocity<=130){
            changingGears(4);
        }else if (newVelocity>130&&newVelocity<=160){
            changingGears(5);
        }else {
            changingGears(6);
        }
        if (newVelocity>0){
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }

}
