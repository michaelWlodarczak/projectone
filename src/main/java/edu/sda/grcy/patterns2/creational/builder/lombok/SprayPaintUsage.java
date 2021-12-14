package edu.sda.grcy.patterns2.creational.builder.lombok;

import java.util.List;

public class SprayPaintUsage {
    public static void main(String[] args) {
        final SprayPaints flameOrange = SprayPaints.builder()
                .brand("Flame Orange")
                .color("Cream Blue")
                .capacity(400)
                .price(16)
                .build();
        final SprayPaints molotow = SprayPaints.builder()
                .brand("Molotow")
                .color("Chrom")
                .capacity(600)
                .price(25)
                .build();
        final SprayPaints montana = SprayPaints.builder()
                .brand("Montana Ultra Wide")
                .color("Royal Purple")
                .capacity(750)
                .price(36)
                .build();

        List<SprayPaints> paints = List.of(flameOrange,molotow,montana);
        System.out.println("Summary: ");
        paints.forEach(p-> System.out.println(p.getPaintInfo()));



    }
}
