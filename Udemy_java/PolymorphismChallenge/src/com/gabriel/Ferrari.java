package com.gabriel;

public class Ferrari extends Car {
    public Ferrari(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() +" -> Engine started!";
    }

    @Override
    public String accelerate() {
        return getName() +" -> Rockets to full speed";
    }

    @Override
    public String brake() {
        return getClass().getName() +" -> Comes to a complete stop in 50m";
    }
}
