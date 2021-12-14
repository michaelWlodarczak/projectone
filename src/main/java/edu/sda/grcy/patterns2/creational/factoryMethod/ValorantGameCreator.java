package edu.sda.grcy.patterns2.creational.factoryMethod;

public class ValorantGameCreator implements GameFactory{

    @Override
    public Game create() {
        return new PCGame("Valoriant", "FPS",4,10,true);
    }
}
