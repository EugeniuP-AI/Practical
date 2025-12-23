package org.example;

public class Desktop implements Computer {
    private String model;
    private int ramSize;
    private float processorSpeed;
    private Manufacture manufacturer;

    public Desktop(Manufacture manufacturer,String model, int ramSize, float processorSpeed) {
        this.model = model;
        this.ramSize = ramSize;
        this.processorSpeed = processorSpeed;
        this.manufacturer = manufacturer;
    }

    public void boot() {
        System.out.println("Desktop boots...");
    }

    public void shutDown() {
        System.out.println("Desktop shutDown...");
    }

    @Override
    public String toString() {
        return "Desktop{" +
                "model='" + model + '\'' +
                ", ramSize='" + ramSize + '\'' +
                ", processorSpeed=" + processorSpeed +
                ", manufacturer=" + manufacturer +
                '}';
    }
}