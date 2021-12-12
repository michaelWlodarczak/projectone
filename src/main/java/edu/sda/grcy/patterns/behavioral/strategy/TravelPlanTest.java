package edu.sda.grcy.patterns.behavioral.strategy;

//strategia == polityka

public class TravelPlanTest {
    public static void main(String[] args) {

        Travel travel = new Travel("Rzeszow","Bieszczady");

        travel.calculateTravelPlan(new WalkStrategy(true));
        travel.getTravelInfo();
        krecha();
        travel.calculateTravelPlan(new CarStrategy(false,true));
        travel.getTravelInfo();
        krecha();
        krecha();
        travel = new Travel("Rzeszow","Kolonia");
        travel.calculateTravelPlan(new CarStrategy(true,false));
        travel.getTravelInfo();
    }

    private static void krecha(){
        System.out.println("=================================");
    }
}
