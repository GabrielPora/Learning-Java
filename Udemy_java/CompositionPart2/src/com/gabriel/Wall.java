package com.gabriel;

public class Wall {
    private int height;
    private int width;
    private String direction;

    public Wall(int height, int width, String direction) {
        this.height = height;
        this.width = width;
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
