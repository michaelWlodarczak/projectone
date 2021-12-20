package edu.sda.grcy.patterns2.structural.decorator;

public class BubbleLights extends TreeDecorator{

    public BubbleLights(ChristmasTree tree) {
        super(tree);
    }

    private String decorateWithBubbleLights(){
        return " with Bubble Lights";
    }

    @Override
    public String decorate() {
        return super.decorate() + decorateWithBubbleLights();
    }
}
