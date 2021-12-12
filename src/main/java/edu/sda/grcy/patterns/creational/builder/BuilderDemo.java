package edu.sda.grcy.patterns.creational.builder;

import java.util.List;

public class BuilderDemo {
    public static void main(String[] args) {

        House smalHouse = new House.HouseBuilder("bloczki", "Ytong","blacha")
                //przed wywolaniem metody build() mamy obiekt klasy HouseBuilder
                .build();

        House houseWithGarage = new House.HouseBuilder("wylewany", "Max", "Dachowka")
                .withGarage("w bryle budynku")
                .build();

        House houseWithGarden = new House.HouseBuilder("bloczki", "cegla", "papodachowka")
                .withGarden("ogrod z oczkiem wodnym")
                .build();

        House residence = new House.HouseBuilder("bloczki", "Max","Dachowka")
                .withGarage("Osobny, 2-stanowiskowy")
                .withGarden("Orod z basenem")
                .build();

        List<House> houses = List.of(smalHouse,houseWithGarage,houseWithGarden,residence);
        System.out.println("Podsumowanie");
        houses.forEach(x-> System.out.println(x.getHouseInfo()));
    }
}
