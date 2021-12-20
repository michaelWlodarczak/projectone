package edu.sda.grcy.patterns2.structural.decorator;

public class TreeTopper extends TreeDecorator{

    public TreeTopper(ChristmasTree tree) {
        super(tree);
    }

    private String decorateWithTreeTopper(){
        return " with Tree Topper";
    }

    @Override
    public String decorate() {
        return super.decorate() + decorateWithTreeTopper();
    }
}
