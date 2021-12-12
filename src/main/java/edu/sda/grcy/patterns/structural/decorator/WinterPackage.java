package edu.sda.grcy.patterns.structural.decorator;

public class WinterPackage extends CarExtras{
    private boolean electricFrontWindow;
    private boolean heatedSeats;

    public WinterPackage(Car carToModify, boolean electricFrontWindow, boolean heatedSeats) {
        super(carToModify);
        this.electricFrontWindow = electricFrontWindow;
        this.heatedSeats = heatedSeats;
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print("Adding some features");
        System.out.print(electricFrontWindow ? " electric front window " : "");
        System.out.print(electricFrontWindow && heatedSeats? ", " : "");
        System.out.print(heatedSeats ? " heated seats " : "");
        System.out.println("\n");

        /*
        tu jest jakiś warunek zwracający boolean
        ?
        to wykona się jeśli true
        :
        to wykona się jeśli false
         */
    }
}
