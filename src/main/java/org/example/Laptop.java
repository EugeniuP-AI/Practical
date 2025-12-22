package org.example;

public class Laptop extends Manufacture implements Computer {
    Laptop(String model, String brand, String manufacturer) {
        super(model, brand, manufacturer);
    }

    public void boot() {
        System.out.println("Laptop is booting: powering hardware and loading OS...");
    }

    public void shutDown() {
        System.out.println("Laptop is shutting down: stopping services and powering off...");
    }
}

