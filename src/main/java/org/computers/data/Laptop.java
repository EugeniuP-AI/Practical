package org.computers.data;

import org.computers.enums.OperationalSystem;
import org.computers.interfaces.Bootable;

public class Laptop implements Bootable {
    private String laptopModel;
    private int ramSize;
    private double processorSpeed;
    private Manufacture manufacturer;
    private OperationalSystem operatingSystem;

    public Laptop(Manufacture manufacturer,OperationalSystem operationalSystem,String laptopModel, int ramSize, double processorSpeed) {
        this.manufacturer = manufacturer;
        this.laptopModel = laptopModel;
        this.ramSize = ramSize;
        this.processorSpeed = processorSpeed;
        this.operatingSystem = operationalSystem;
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
                ", operatingSystem=" + operatingSystem +
                ", ramSize=" + ramSize +
                ", processorSpeed=" + processorSpeed +
                ", manufacturer=" + manufacturer +
                '}';
    }
}

