package edu.sda.grcy.patterns2.decorator;

public class Garland extends TreeDecorator{

    public Garland(ChristmasTree tree) {
        super(tree);
    }

    private String decorateWithGarland(){
        return " with Garland";
    }

    @Override
    public String decorate() {
        return super.decorate() + decorateWithGarland();
    }
}
