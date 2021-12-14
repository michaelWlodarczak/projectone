package edu.sda.grcy.patterns.creational.factory;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        Klasyczne powolywanie obiektow

        Problem jest taki, ze operator "new" nie powinien byc naduzywany
        i nie powinien byc uzywany przez wszystkich bo tak pasuje, bo trzeba nowy obiekt,
        powinnismy go schowac tak zeby nie uzywal go kazdy i zawsze,
        Normalny uzytkownik powinien raczej uzywac metod dedykowanych do tworzenia obiektu
         */

        MacBook air1 = new MacBookAir("8G", "128", 13);
        MacBook pro1 = new MacBookPro("16G", "256", 16);

        /*
        Fabryka
        Dostaje zamowienie na macBooka
        Z punktu widzenia zamawiajacego nie ma znaczenia czy dostanie nowy obiekt czy juz istniejacy
        wazne, ze ma go dostac
         */

        MacBook air2 = MacBookFactory.getMac("Air", "8G", "256", 13);
        MacBook pro2 = MacBookFactory.getMac("Pro", "8G", "256", 13);
        MacBook pro3 = MacBookFactory.getMac("Pro", "16G", "512", 13);
        MacBook pro4 = MacBookFactory.getMac("Pro", "32G", "512", 16);
        MacBook air3 = MacBookFactory.getMac("AIRS", "32G", "512", 16);

        List<MacBook> macBookList = List.of(air1, pro1, air2, pro2, pro3,pro4);

        System.out.println(macBookList);
    }
}
