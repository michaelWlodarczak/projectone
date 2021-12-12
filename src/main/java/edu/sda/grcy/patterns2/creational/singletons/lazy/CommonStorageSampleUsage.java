package edu.sda.grcy.patterns2.creational.singletons.lazy;

public class CommonStorageSampleUsage {
    public static void main(String[] args) {
        CommonStorage commonStorageA = CommonStorage.getInstance();
        // instancja jest w tym momencie TWORZONA
        CommonStorage commonStorageB = CommonStorage.getInstance();
        // pobranie instancji drugi raz - już wcześniej stworzonej
        System.out.println(commonStorageA == commonStorageB); // true

        commonStorageA.addValue(1);
        commonStorageB.addValue(2);
        System.out.println(commonStorageA.getValues().size()); // rozmiar listy wynosi 2
    }
}
