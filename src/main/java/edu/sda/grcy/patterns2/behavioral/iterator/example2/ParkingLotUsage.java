package edu.sda.grcy.patterns2.behavioral.iterator.example2;

import java.util.Iterator;

public class ParkingLotUsage {
    public static void main(String[] args) {
        final ParkingLot parkingLot = new ParkingLot();

        for (int i = 0; i < 12; i++) {
            parkingLot.add(new SimpleCar());
        }

        final Iterator<Car> iterator = parkingLot.iterator();
        while (iterator.hasNext()){
            final Car car = iterator.next();
            System.out.println(car);
        }
    }
}
