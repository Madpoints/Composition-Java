package com.Madpoints;

/*Composition vs. Inheritance*/
// PC class does does not extend any classes
// Instead it calls them in making its own objects
public class PC {
    private Case aCase;
    private Monitor monitors;
    private Motherboard aMotherboard;

    public PC(Case aCase, Monitor monitors, Motherboard aMotherboard) {
        this.aCase = aCase;
        this.monitors = monitors;
        this.aMotherboard = aMotherboard;
    }

    public Case getaCase() {
        return aCase;
    }

    public Monitor getMonitors() {
        return monitors;
    }

    public Motherboard getaMotherboard() {
        return aMotherboard;
    }
}
