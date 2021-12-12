package edu.sda.grcy.patterns.creational.singletons;

public class LazySingleton {
    /**
     * Mamy znowu prywatne pola statyczne, tym razem
     * nie jest inicjowane od razu
     */
    private static LazySingleton INSTANCE;

    /**
     * Mamay znowu prywatny konstruktor,z zewnatrz nie ma do niego dostepu
     */

    private LazySingleton(){
        System.out.println("Lazy Singleton init");
    }

    /**
     *
     *
     */
    public static LazySingleton getInstance(){
        System.out.println("Lazy Singleton getInstance");
        if (INSTANCE==null){
            INSTANCE = new LazySingleton();
        }
        return INSTANCE;
    }
}
