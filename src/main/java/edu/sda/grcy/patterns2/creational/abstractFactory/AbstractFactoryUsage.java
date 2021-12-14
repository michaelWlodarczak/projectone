package edu.sda.grcy.patterns2.creational.abstractFactory;

/*
Jak widać, główną zaletą wzorca projektowego Abstract Factory jest możliwość pracy na abstrakcjach,
brak łamania zasad SOLID i schowanie szczegółów implementacyjnych.
Problemem z kolei, może być spora ilość klas i interfejsów,
jaką musimy zaimplementować, aby z niego skorzystać.
 */

public class AbstractFactoryUsage {
    public static void main(String[] args) {

        CarType audiA4Combi = CarType.AUDI_A4; // np. AUDI_A4
        CarType toyotaCorollaSedan = CarType.TOYOTA_COROLLA;
        CarType toyotaCorollaHatchback = CarType.TOYOTA_COROLLA;
        System.out.println("User1 wants to produce a " + audiA4Combi);
        System.out.println("User2 wants to produce a " + toyotaCorollaSedan);
        System.out.println("User3 wants to produce a " + toyotaCorollaHatchback);

        CarFactory factory1 = new FactoryProvider().createFactory(audiA4Combi);
        CarFactory factory2 = new FactoryProvider().createFactory(toyotaCorollaSedan);
        CarFactory factory3 = new FactoryProvider().createFactory(toyotaCorollaHatchback);

        Car combi = factory1.createCombi();
        Car sedan = factory2.createCombi();
        Car hatchback = factory3.createCombi();

        System.out.println("There is your combi " + combi);
        System.out.println("There is your sedan " + sedan);
        System.out.println("There is your hatchback " + hatchback);

    }
}
