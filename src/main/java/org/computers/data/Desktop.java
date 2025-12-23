package org.computers.data;

import org.computers.enums.OperationalSystem;
import org.computers.interfaces.Bootable;

public class Desktop implements Bootable {
    private String model;
    private int ramSize;
    private float processorSpeed;
    private Manufacture manufacturer;
    OperationalSystem operationalSystem;

    public Desktop(Manufacture manufacturer, OperationalSystem operationalSystem, String model, int ramSize, float processorSpeed) {
        this.model = model;
        this.ramSize = ramSize;
        this.processorSpeed = processorSpeed;
        this.manufacturer = manufacturer;
        this.operationalSystem = operationalSystem;
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
                "desktopModel='" + model + '\'' +
                ", operationalSystem=" + operationalSystem +
                ", ramSize='" + ramSize + '\'' +
                ", processorSpeed=" + processorSpeed +
                ", manufacturer=" + manufacturer +
                '}';
    }
}