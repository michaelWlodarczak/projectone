package edu.sda.grcy.patterns.structural.decorator;

public class SportPackage extends CarExtras{
    private boolean sportWheel;
    private boolean sportSeats;

    public SportPackage(Car carToModify, boolean sportSeats) {
        super(carToModify);
        this.sportWheel = false;
        this.sportSeats = sportSeats;
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print("Adding sport features : ");
        System.out.print(sportSeats ? "Adding sport seats " : "");
        addSportWheel();
    }
    private void addSportWheel(){
        sportWheel = true;
        System.out.print("Adding sport wheel\n");
    }
}
