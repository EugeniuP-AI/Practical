package org.example;

public class Phone implements Computer {
    private String operatingSystem;
    private String model;
    private int ram;
    private int batteryCapacity;
    private Manufacture manufacture;

    public Phone(Manufacture manufacture, String operatingSystem, String model, int ram, int batteryCapacity) {
        this.operatingSystem = operatingSystem;
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
                "operatingSystem='" + operatingSystem + '\'' +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                ", batteryCapacity=" + batteryCapacity +
                ", manufacture=" + manufacture +
                '}';
    }
}
