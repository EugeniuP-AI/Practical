package org.example;

public class Desktop extends Manufacture implements Computer {
    Desktop(String model, String brand, String manufacturer) {
        super(model, brand, manufacturer);
    }

    public void boot() {
        System.out.println("Desktop boots...");
    }

    public void shutDown() {
        System.out.println("Desktop shutDown...");
    }
}