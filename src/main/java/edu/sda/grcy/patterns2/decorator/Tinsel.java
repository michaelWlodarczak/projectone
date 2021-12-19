package edu.sda.grcy.patterns2.decorator;

public class Tinsel extends TreeDecorator{

    public Tinsel(ChristmasTree tree) {
        super(tree);
    }

    private String decorateWithTinsel(){
        return " with Tinsel";
    }

    @Override
    public String decorate() {
        return super.decorate() + decorateWithTinsel();
    }
}
