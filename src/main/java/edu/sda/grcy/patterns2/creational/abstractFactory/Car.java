package edu.sda.grcy.patterns2.creational.abstractFactory;

public interface Car {
    Type getType();
    String getModelName();
    Integer getCylindersNum();
    String getProducer();
    Float getEngineVolume();
    Integer getTrunkSize();
}
