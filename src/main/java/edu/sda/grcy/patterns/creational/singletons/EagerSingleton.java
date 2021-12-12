package edu.sda.grcy.patterns.creational.singletons;

/**
 * Eager czyli "od razu", w naszym przypadku oznacza to, ze obiekt INSTANE
 * jest tworzony od razu w momencie kompilacji / uruchamiania klasy przez JVM
 */

public class EagerSingleton {
    /**
     * 1.Mamy prywatne statyczne pole bedace obiektem naszej klasy
     * - prywatne wiec nie ma do niego dostepuz zewnatrz (a w kazdzym razie nie tak latwo)
     * -statyczne wiec 1 obiekt wspolny dla klasy
     */
    private static final EagerSingleton INSTANCE = new EagerSingleton();

    private String SomeSettings;

    /**
     * Prywatny konstruktor wiec tez nie wywolamy go z zewnatrz (a w kazdzym razie nie tak latwo)
     */
    private EagerSingleton(){
        System.out.println("Eager singleton init");
    }

    /**
     *publiczna statyczna metoda zwracajaca istniejacy obiekt
     */
    public static EagerSingleton getInstance(){
        System.out.println("Method getInstance");
        return INSTANCE;
    }

    public String getSomeSettings() {
        return SomeSettings;
    }

    public void setSomeSettings(String someSettings) {
        SomeSettings = someSettings;
    }
}
