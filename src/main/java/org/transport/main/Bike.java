package org.transport.main;

import org.transport.enums.Engine;
import org.transport.interfaces.Driveable;
import org.transport.interfaces.EngineStartable;
import org.transport.interfaces.Refuelable;


public class Bike extends AbstractVehicle implements EngineStartable, Driveable, Refuelable {
    private String model;
    private String color;
    private int wheels;
    private Manufacture manufacture;
    private Engine engine;

    public Bike(String model, String color, int wheels, Manufacture manufacture, Engine engine) {
        this.model = model;
        this.color = color;
        this.wheels = wheels;
        this.manufacture = manufacture;
        this.engine = engine;
    }

    @Override
    public void startEngine() {
        System.out.println("Bike engine started");
    }

    @Override
    public void drive() {
        System.out.println("Bike is driving");
    }

    @Override
    public void stopEngine() {
        System.out.println("Bike engine stopped");
    }

    @Override
    public void openTrunk() {
        System.out.println("Bike trunk opened");
    }

    @Override
    public void refuel() {
        System.out.println("Bike refueled");
    }

    @Override
    public void closeTrunk() {
        System.out.println("Bike trunk closed");
    }

    @Override
    public String toString() {
        return "Bike{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", wheels=" + wheels +
                ", manufacture=" + manufacture +
                ", engine=" + engine +
                '}';
    }
}
