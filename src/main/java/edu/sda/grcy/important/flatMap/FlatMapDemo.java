package edu.sda.grcy.important.flatMap;

import java.util.List;
import java.util.Set;

public class FlatMapDemo {
    public static void main(String[] args) {

        Pesel pesel1 = new Pesel("12345");
        Pesel pesel2 = new Pesel("67891");
        Pesel pesel3 = new Pesel("33233");
        Pesel pesel4 = new Pesel("23456");
        Pesel pesel5 = new Pesel("78912");
        Pesel pesel6 = new Pesel("44444");
        Pesel pesel7 = new Pesel("98765");
        Pesel pesel8 = new Pesel("33399");
        Pesel pesel9 = new Pesel("61612");

        List<Pesel> peselList = List.of(pesel1,pesel2,pesel3,pesel4,pesel5,pesel6,pesel7,pesel8,pesel9);

        Set<Pesel> peselSet = Set.of(pesel6,pesel7,pesel8,pesel9);

        /**
         * Drukujemy wszystkie pesele po kolei
         */
        peselList.stream()
                .map(Pesel::getPeselNumber)
                .forEach(System.out::println);
        System.out.println("==================");
        peselSet.stream()
                .map(Pesel::getPeselNumber)
                .forEach(System.out::println);

        System.out.println("===================");
        List.of(peselList,peselSet).stream()
                .flatMap(x -> x.stream())
                .map(Pesel::getPeselNumber)
                .forEach(System.out::println);
    }


}
