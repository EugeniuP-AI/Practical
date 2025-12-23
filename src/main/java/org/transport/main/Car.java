package org.transport.main;

import org.transport.enums.Engine;
import org.transport.interfaces.EngineStartable;
import org.transport.interfaces.Driveable;
import org.transport.interfaces.Refuelable;

public class Car extends AbstractVehicle implements EngineStartable, Driveable, Refuelable {
    private String model;
    private int wheels;
    private int doors;
    private int horsePower;
    private Engine engine;
    private Manufacture manufacture;

    public Car(String model, int wheels, int doors, int horsePower, Engine engine, Manufacture manufacture) {
        this.model = model;
        this.wheels = wheels;
        this.doors = doors;
        this.horsePower = horsePower;
        this.engine = engine;
        this.manufacture = manufacture;
    }

    @Override
    public void startEngine() {
        System.out.println("Car has started the engine... is ready to go");
    }

    @Override
    public void drive(){
        System.out.println("Car started to move.... ");

    }

    @Override
    public void stopEngine() {
        System.out.println("Vehicule has stop the engine...");
    }

    @Override
    public void openTrunk(){
        System.out.println("Trunk was opened");
    }

    @Override
    public void refuel(){
        System.out.println("Gasoline start to arrived into trunk");
    }

    @Override
    public void closeTrunk(){
        System.out.println("Trunk is closed");
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", wheels=" + wheels +
                ", doors=" + doors +
                ", horsePower=" + horsePower +
                ", engine=" + engine +
                ", manufacture=" + manufacture +
                '}';
    }
}
