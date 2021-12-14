package edu.sda.grcy.patterns2.creational.abstractFactory;

public abstract class AbstractCar implements Car{

    @Override
    public String toString() {
        return "Car: " + getProducer() + " " + getModelName() + " " + getType() + " has " + getCylindersNum() + " cylinders" +
                " and engine: " + getEngineVolume() + " and trunk with size " + getTrunkSize() + " litres";
    }
}
