package com.gabriel;

public class Vehicle {

    private String name;
    private String size;

    private int currentDirection;
    private int currentVelocity;

    public Vehicle(String size, String name) {
        this.size = size;
        this.name = name;

        this.currentDirection = 0;
        this.currentVelocity = 0;
    }

    public void stop(){
        this.currentVelocity=0;
    }

    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering at "+currentDirection+" degrees.");
    }

    public void move(int velocity, int direction) {
        this.currentVelocity = velocity;
        this.currentDirection = direction;
        System.out.println("Vehicle.move(): Moving at "+currentVelocity+" in direction " +currentDirection);
    }

    public String getName() {
        return name;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public void setCurrentVelocity(int currentVelocity) {
        this.currentVelocity = currentVelocity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
