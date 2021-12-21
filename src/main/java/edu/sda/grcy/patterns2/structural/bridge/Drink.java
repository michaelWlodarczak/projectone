package edu.sda.grcy.patterns2.structural.bridge;

public interface Drink {
    String getVolume();
    boolean isAddictive();
    int getNumberOfSugarLumps();
    Taste getTaste();
}
