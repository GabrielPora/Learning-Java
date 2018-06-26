package com.gabriel;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor monitor = new Monitor("27inch Beast","Acer", 27, new Resolution(2540,1440));

        Motherboard motherboard = new Motherboard("BJ-200","Asus", "v2.44",4,6);

        PC thePC = new PC(theCase,monitor,motherboard);

        thePC.getMonitor().drawPixelAt(1500,1200,"Blue");
        thePC.getMotherboard().loadProgram("Linux Ubuntu 18.04");
        thePC.getTheCase().pressPowerButton();

    }
}
