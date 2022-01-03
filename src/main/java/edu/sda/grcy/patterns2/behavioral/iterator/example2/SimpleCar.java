package edu.sda.grcy.patterns2.behavioral.iterator.example2;

import lombok.ToString;

@ToString
public class SimpleCar implements Car{

    private static int index = 0;
    private final String info;

    public SimpleCar() {
        info = "Toyota Avensis with id " + ++index;
    }

    @Override
    public String getVehicleInfo() {
        return info;
    }
}
