package com.Madpoints;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(10, 20, 20);
        Case theCase = new Case("220B", "Asus", "500w", dimensions);

        Resolution nativeResolution = new Resolution(1080, 720);
        Monitor theMonitor = new Monitor("27X700", "HP", 27, nativeResolution);

        Motherboard theMotherboard = new Motherboard("LSX80", "Asus", 4, 2, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.getTheCase().pressPowerButton();
        thePC.getTheMonitor().drawPixelAt(1500, 1200, "red");
        thePC.getTheMotherboard().loadProgram("The Witcher 3");
        //System.out.println(thePC.getaCase().isOn());
        thePC.getTheCase().pressPowerButton();
        //System.out.println(thePC.getaCase().isOn());
    }
}

