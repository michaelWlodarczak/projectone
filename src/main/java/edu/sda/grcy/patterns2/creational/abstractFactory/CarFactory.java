package edu.sda.grcy.patterns2.creational.abstractFactory;

public interface CarFactory {
    Car createSedan();
    Car createCombi();
    Car createHatchback();
}
