package com.gabriel;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(
                "Large",
                "Volvo");

        Car bmw = new Car(
                "RWD", "BMW", 4, 5, 5,
                true);


        Nissan gtr = new Nissan(520);
        LandRover landRover = new LandRover(520);

        landRover.accelerate(60);
        landRover.steer(20);
        landRover.accelerate(60);
        landRover.accelerate(-80);
        gtr.changingGears(4);
        bmw.changingGears(3);


    }
}
