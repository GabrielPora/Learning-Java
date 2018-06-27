package com.gabriel;

public class Main {

    public static void main(String[] args) {
        // write your code here
        for (int i = 1; i <= 6; i++) {
            Car car = randomCar();
            System.out.println("Car #" + i +
                    " : " + car.getName() + "\n" +
                    "Number of cylinders: " + car.getCylinders() + "\n" +
                    "Start Engine: " + car.startEngine() + "\n" +
                    "accelerate: " + car.accelerate() + "\n" +
                    "brake: " + car.brake() + "\n");

        }
    }

    public static Car randomCar() {
        int randomNumber = (int) (Math.random() * 3) + 1;
        System.out.println("Random number generated was " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Ferrari("Intelia 458", 8);
            case 2:
                return new Nissan("GTR-35", 8);
            case 3:
                return new Dodge("Viper", 10);
            default:
                return null;
        }
    }
}
