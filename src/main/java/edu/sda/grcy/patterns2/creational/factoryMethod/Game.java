package edu.sda.grcy.patterns2.creational.factoryMethod;

public interface Game {
    String getName();
    String getType();
    int getMinNumberOfPlayers();
    int getMaxNumberOfPlayers();
    boolean canBePlayedRemotely();
}

