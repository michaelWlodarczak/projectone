package edu.sda.grcy.patterns2.decorator;

public class ChristmasTreeUsage {
    public static void main(String[] args) {

        ChristmasTree tree1 = new ChristmasTreeImpl();
        System.out.println(tree1.decorate());

        ChristmasTree tree2 = new Garland(new ChristmasTreeImpl());
        System.out.println(tree2.decorate());

        ChristmasTree tree3 = new BubbleLights(new Garland(new Tinsel(new TreeTopper(new
                ChristmasTreeImpl()))));
        System.out.println(tree3.decorate());

    }
}
