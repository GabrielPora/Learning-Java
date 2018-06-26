package com.gabriel;

public class Main {

    public static void main(String[] args) {
        // write your code here
        House blueHouse = new House("blue");
        House anotherHouse = blueHouse;

        System.out.println("blueHouse: " + blueHouse.getColour()); // blue
        System.out.println("anotherHouse: " + anotherHouse.getColour()); // blue

        anotherHouse.setColour("Yellow");
        System.out.println("blueHouse: " + blueHouse.getColour()); // Yellow
        System.out.println("anotherHouse: " + anotherHouse.getColour());// Yellow

        House greenHouse = new House("green");
        anotherHouse = greenHouse;

        System.out.println("blueHouse: " + blueHouse.getColour()); // Yellow
        System.out.println("greenHouse: " + greenHouse.getColour()); // green
        System.out.println("anotherHouse: " + anotherHouse.getColour());// green
    }
}
