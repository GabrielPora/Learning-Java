package com.gabriel;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        int remainder = 0;
        int oneMB = 1024;
        int megaBytes = 0;
        megaBytes = kiloBytes / oneMB;
        remainder = kiloBytes % oneMB;


        System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainder + " KB");
    }
}
