package edu.sda.grcy.patterns.structural.decorator;

public class BasicCar implements Car{
    @Override
    public void assemble() {
        System.out.println("Assembling basic car.");
    }
}
