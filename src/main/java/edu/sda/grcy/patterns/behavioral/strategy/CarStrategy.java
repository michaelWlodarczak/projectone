package edu.sda.grcy.patterns.behavioral.strategy;

public class CarStrategy implements TravelStrategy{
    private boolean inludePaidMotorways;
    private boolean includeFieldRoads;

    public CarStrategy(boolean inludePaidMotorways, boolean includeFieldRoads) {
        this.inludePaidMotorways = inludePaidMotorways;
        this.includeFieldRoads = includeFieldRoads;
    }

    @Override
    public String setTravelPlan(String from, String to) {
        return new StringBuilder("Travel by CAR from ")
                .append(from)
                .append(" to ")
                .append(to)
                .append(inludePaidMotorways ? " include paid motorways " : "")
                .append(includeFieldRoads ? " include field roads " : "")
                .toString();
    }
}
