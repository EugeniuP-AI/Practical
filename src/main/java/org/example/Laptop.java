package org.example;

public class Laptop implements Computer {
    private String laptopModel;
    private int ramSize;
    private double processorSpeed;
    private Manufacture manufacturer;

    public Laptop(Manufacture manufacturer,String laptopModel, int ramSize, double processorSpeed) {
        this.manufacturer = manufacturer;
        this.laptopModel = laptopModel;
        this.ramSize = ramSize;
        this.processorSpeed = processorSpeed;
    }

    public void boot() {
        System.out.println("Laptop is booting: powering hardware and loading OS...");
    }

    public void shutDown() {
        System.out.println("Laptop is shutting down: stopping services and powering off...");
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "laptopModel='" + laptopModel + '\'' +
                ", ramSize=" + ramSize +
                ", processorSpeed=" + processorSpeed +
                ", manufacturer=" + manufacturer +
                '}';
    }
}

