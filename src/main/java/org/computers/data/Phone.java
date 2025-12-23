package org.computers.data;

import org.computers.enums.OperationalSystem;
import org.computers.interfaces.Bootable;

public class Phone implements Bootable {
    private String model;
    private int ram;
    private int batteryCapacity;
    private Manufacture manufacture;
    private OperationalSystem operationalSystem;

    public Phone(Manufacture manufacture, OperationalSystem operationalSystem, String model, int ram, int batteryCapacity) {
        this.operationalSystem = operationalSystem;
        this.model = model;
        this.ram = ram;
        this.batteryCapacity = batteryCapacity;
        this.manufacture = manufacture;

    }
    public void boot() {
        System.out.println("Phone is booting...starts the applications");
    }

    public void shutDown() {
        System.out.println("Phone is shutting down...stops the applications");
    }

    @Override
    public String toString() {
        return "Phone{" +
                "operatingSystem='" + operationalSystem + '\'' +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                ", batteryCapacity=" + batteryCapacity +
                ", manufacture=" + manufacture +
                '}';
    }
}
