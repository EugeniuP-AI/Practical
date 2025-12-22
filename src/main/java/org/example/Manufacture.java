package org.example;

public class Manufacture {
    private String model;
    private String brand;
    private String manufacturer;

    public Manufacture(String model, String brand, String manufacturer) {
        this.model = model;
        this.brand = brand;
        this.manufacturer = manufacturer;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
