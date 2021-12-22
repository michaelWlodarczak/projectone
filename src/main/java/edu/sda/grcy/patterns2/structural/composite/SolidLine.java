package edu.sda.grcy.patterns2.structural.composite;

public class SolidLine implements Line{

    private Point point = new Point(0,0);

    @Override
    public void draw(double lengthInPixels) {
        System.out.println("Drawing solid line starting in (" + point.getX()
                + ", " + point.getY() + ") with length " + lengthInPixels);
    }

    @Override
    public void setStartingPosition(final Point position) {
        this.point = position;
    }

    @Override
    public Point getStartingPoint() {
        return point;
    }
}
