package edu.sda.grcy.patterns2.creational.factoryMethod;

public class MonopolyGameCreator implements GameFactory{

    @Override
    public Game create() {
        return new BoardGame("Monopoly","Family game",4);
    }
}
