package com.gabriel;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("commodore")){
            this.model = model; // remember the key word "this" refers to the field
        }else {
            this.model = "Unknown";
        }

    }

    public String getModel(){
        return  this.model;
    }
}
