package edu.sda.grcy.patterns.structural.flyweight;

import java.util.HashSet;
import java.util.Set;

public class MustangBaseFactory {
    //zestaw niepowtarzalnych kombinacji kolor - silnik
    private static Set<FordMustangBase> fordMustangBaseSet = new HashSet<>();

    //fabryka
    public static FordMustangBase getMustangBase(String color, String engine) {
        FordMustangBase fordMustangBase;
        System.out.println(FordMustangBase.class + " getMustangBase");
        if (fordMustangBaseSet.size() > 0) {
            System.out.println("Ilosc elementow w secie: " + fordMustangBaseSet.size());

            /**
             * Teraz:
             * -jesli w secie jest kombinacja kolor - silnik na jaka przyszlo zamowienie,to ja zwrocimy,
             * -jesli takiej kombinacji nie ma to tworzymy nowy obiekt
             */

            fordMustangBase = fordMustangBaseSet.stream()
                    .filter(f -> color.equals(f.getColor()) && engine.equals(f.getEngine()))
                    .peek(f -> System.out.println("Znalazlem wymagany Base : " + color + " " + engine))
                    .findAny()
                    .orElseGet(() -> new FordMustangBase(color,engine));

        } else {
            System.out.println(" W fordMustangBaseSet nic jeszcze nie ma! Dodajemy pierwszy element");
            fordMustangBase = new FordMustangBase(color, engine);
        }
        fordMustangBaseSet.add(fordMustangBase);
        return fordMustangBase;
    }

    public static Set<FordMustangBase> getFordMustangBaseSet() {
        return fordMustangBaseSet;
    }
}
