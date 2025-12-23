package org.transport.main;

import org.transport.enums.Engine;
import org.transport.interfaces.Driveable;
import org.transport.interfaces.EngineStartable;
import org.transport.interfaces.Refuelable;


public class Train extends AbstractVehicle implements EngineStartable,Driveable,Refuelable {
    private String model;
    private String color;
    private int wheels;
    private Manufacture manufacture;
    private Engine engine;

    public Train(String model, String color, int wheels, Manufacture manufacture, Engine engine) {
        this.model = model;
        this.color = color;
        this.wheels = wheels;
        this.manufacture = manufacture;
        this.engine = engine;
    }

    @Override
    public void startEngine() {
        System.out.println("Train engine started");
    }

    @Override
    public void drive() {
        System.out.println("Train is driving");
    }

    @Override
    public void stopEngine() {
        System.out.println("Train engine stopped");
    }

    @Override
    public void openTrunk() {
        System.out.println("Train trunk opened");
    }

    @Override
    public void refuel() {
        System.out.println("Train refueled");
    }

    @Override
    public void closeTrunk() {
        System.out.println("Train trunk closed");
    }

    @Override
    public String toString() {
        return "Train{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", wheels=" + wheels +
                ", manufacture=" + manufacture +
                ", engine=" + engine +
                '}';
    }
}
