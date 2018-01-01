package com.Madpoints;

/*Composition vs. Inheritance*/
// PC class does does not extend any classes
// Instead it calls them in making its own objects
public class PC {
    private Case theCase;
    private Monitor theMonitor;
    private Motherboard theMotherboard;
    private boolean isOn;

    public PC(Case theCase, Monitor theMonitor, Motherboard theMotherboard) {
        this.theCase = theCase;
        this.theMonitor = theMonitor;
        this.theMotherboard = theMotherboard;

    }

    public void powerUp() {
        theCase.pressPowerButton();

        if (theCase.isOn()) {
            drawLogo();
        }
    }

    private void drawLogo() {
        theMonitor.drawPixelAt(1200, 50, "yellow");
    }
}
