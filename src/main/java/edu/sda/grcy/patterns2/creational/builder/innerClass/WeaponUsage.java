package edu.sda.grcy.patterns2.creational.builder.innerClass;

import edu.sda.grcy.patterns.creational.builder.House;

import java.util.List;

public class WeaponUsage {
    public static void main(String[] args) {
        final Weapon laserGun = new Weapon.Builder()
                .withName("laser gun")
                .withType("pistol")
                .withDamage(123)
                .withPerks(List.of("Color:red"))
                .withDurability(60L)
                .build();

        final Weapon glokk = new Weapon.Builder()
                .withName("Glokk")
                .withType("pistol")
                .withDamage(15)
                .withPerks(List.of("Color:black"))
                .withDurability(10L)
                .build();

        final Weapon phalanx = new Weapon.Builder()
                .withName("Phalanx")
                .withDamage(100)
                .withPerks(List.of("Color:silver"))
                .build();

        List<Weapon> houses = List.of(laserGun,glokk,phalanx);
        System.out.println("Summary: ");
        houses.forEach(x-> System.out.println(x.getWeaponInfo()));
    }
}
