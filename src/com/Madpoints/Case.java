package com.Madpoints;

public class Case {
    private String model;
    private String manufacturer;
    private String powerSupply;
    private boolean isOn;
    // has a relationship, case has dimensions
    private Dimensions dimensions;


    public Case(String model, String manufacturer, String powerSupply, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.isOn = false;
        this.dimensions = dimensions;
    }

    public void pressPowerButton() {
        if (this.isOn) {
            System.out.println("Powering down...");
            this.isOn = false;
        } else {
            System.out.println("Powering up...");
            this.isOn = true;
        }
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public boolean isOn() {
        return isOn;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
