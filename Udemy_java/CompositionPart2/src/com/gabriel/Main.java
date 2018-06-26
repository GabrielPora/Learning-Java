package com.gabriel;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor monitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard motherboard = new Motherboard("BJ-200", "Asus", "v2.44", 4, 6);

        PC thePC = new PC(theCase, monitor, motherboard);

        thePC.powerUp();

        Wall wall1 = new Wall(250, 250, "North");
        Wall wall2 = new Wall(250, 250, "East");
        Wall wall3 = new Wall(250, 250, "South");
        Wall wall4 = new Wall(250, 250, "West");

        Ceiling ceiling = new Ceiling(250, 5);
        Bed bed = new Bed("King", 5, 60, 2, 2);
        Lamp lamp = new Lamp("Vintage", false, 75);
        Door door = new Door(210, 100);
        RoomWindow roomWindow = new RoomWindow(180, 120);

        Bedroom bedRoom = new Bedroom("Gabriel", wall1, wall2, wall3, wall4, ceiling, bed, door, lamp, roomWindow);
        bedRoom.makeBed();
        bedRoom.getLamp().turnOn();

    }
}
