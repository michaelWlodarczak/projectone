package edu.sda.grcy.patterns2.creational.builder.currentClass;

import java.util.List;

public class ToyBuilderUsage {
    public static void main(String[] args) {

        final Toy hotWheels = new ToyBuilder()
                .withType("small car")
                .withName("Monster truck")
                .withMadeOf("plstic")
                .build();
        final Toy teddyBear = new ToyBuilder()
                .withType("mascot")
                .withName("Teddy Bear")
                .withMadeOf("fabric")
                .build();
        final Toy woodenBlocks = new ToyBuilder()
                .withType("wooden blocks")
                .withName("wooden train")
                .withMadeOf("wood")
                .build();

        List<Toy> toys = List.of(hotWheels, teddyBear, woodenBlocks);
        System.out.println("Summary: ");
        toys.forEach(t -> System.out.println(t.getToyInfo()));
    }
}
