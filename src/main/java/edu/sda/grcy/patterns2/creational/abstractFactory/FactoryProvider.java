package edu.sda.grcy.patterns2.creational.abstractFactory;

/*
Dodatkowy poziom abstrakcji w opisywanym wzorcu - obiekty pozwalające na wybór konkretnej fabryki.
 */
public class FactoryProvider {
    public CarFactory createFactory(final CarType carType) {
        switch (carType) {
            case AUDI_A4:
                return new AudiA4Factory();
            case TOYOTA_COROLLA:
                return new ToyotaCorollaFactory();
        }
        throw new UnsupportedOperationException("Cannot produce factory for this car type");
    }

}
