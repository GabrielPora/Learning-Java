package com.gabriel;

public class Bedroom {
    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Door door;
    private Lamp lamp;
    private RoomWindow roomWindow;

    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Door door, Lamp lamp, RoomWindow roomWindow) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.door = door;
        this.lamp = lamp;
        this.roomWindow = roomWindow;
    }

    public Lamp getLamp() {
        return this.lamp;
    }

    public void makeBed(){
        System.out.println("Bedroom -> Making Bed!");
        bed.make();
    }


}
