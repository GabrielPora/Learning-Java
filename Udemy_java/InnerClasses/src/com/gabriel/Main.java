package com.gabriel;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {
        GearBox mcLaren = new GearBox(6);
//        GearBox.Gear first = mcLaren.new Gear(1,12.3);
        // can't do the below
//        GearBox.Gear second = new GearBox(2,15.4);
//        GearBox.Gear third = new mcLaren.Gear(1,12.3);
        // the above does not work because you want to expose the GearBox class and not the actual Gear class.
//        System.out.println(first.driveSpeed(1000));


        // can uncomment this if you comment the for loop in the GearBox class.
//        mcLaren.addGear(1,5.3);
//        mcLaren.addGear(2,10.6);
//        mcLaren.addGear(3,15.9);
        mcLaren.operateClutch(true);
        mcLaren.changeGear(1);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(1000));
        mcLaren.changeGear(2);
        System.out.println(mcLaren.wheelSpeed(3000));
        mcLaren.operateClutch(true);
        mcLaren.changeGear(3);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(6000));

//        class ClickListener implements Button.OnClickListener {
//            public ClickListener() {
//                System.out.println("I've been attached");
//            }
//
//            @Override
//            public void onClick(String title) {
//                System.out.println(title + " was clicked");
//            }
//        }
//        btnPrint.setOnClickListener(new ClickListener());

        // or the below can do what the above does but this is an anonymous class.
        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        });
        listen();
    }

    private static void listen() {
        boolean quit = false;
        while (!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
            }
        }
    }
}
