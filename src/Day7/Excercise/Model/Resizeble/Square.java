package Day7.Excercise.Model.Resizeble;

import Day7.Excercise.Interface.Colorable;
import Day7.Excercise.Interface.Resizeable;

public class Square extends  Rectangle implements Colorable {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }
    public double getSide() {
        return getWidth();
    }
    public void setSide(double side) {
        this.setWidth(side);
        this.setLength(side);
    }
    public Square(double width, double length, String color, boolean filled) {
        super(width, length, color, filled);
    }


    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public double getArea() {
        System.out.print("Area Square :");
        return Math.pow(getWidth(),2);
    }

    @Override
    public void howToColor() {
        System.out.println(" Color all four sides..");
    }
}