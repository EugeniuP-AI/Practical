package org.transport.main;

import org.transport.enums.Engine;
import org.transport.interfaces.Driveable;
import org.transport.interfaces.EngineStartable;

import java.util.List;
import java.util.logging.Logger;


public class Main {
    private static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Manufacture carManufacture = new Manufacture("Tayota", "Japan", 1956);
        Car car = new Car("Tayota", 4, 4, 400, Engine.HYBRID, carManufacture);
//        System.out.println(car);
//        System.out.println("---------------------");
        logger.info("Car created: " + car);

        Manufacture bikeManufacture = new Manufacture("Yamaha", "Japan", 1887);
        Bike bike = new Bike("Yamaha R1", "Blue", 2, bikeManufacture, Engine.GASOLINE);
//        System.out.println(bike);
//        System.out.println("---------------------");
        logger.info("Bike created: " + bike);

        Manufacture trainManufacture = new Manufacture("Siemens", "Germany", 1847);
        Train train = new Train("ICE 4", "Red", 20, trainManufacture, Engine.ELECTRIC);
//        System.out.println(train);
//        System.out.println("---------------------");
        logger.info("Train created: " + train);



        List<EngineStartable> vehicles = List.of(car, bike, train);

        for(EngineStartable vehicle : vehicles) {
            vehicle.startEngine();
        }
    }
}
