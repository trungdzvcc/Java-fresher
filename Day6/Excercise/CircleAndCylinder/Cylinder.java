package Day6.Excercise.CircleAndCylinder;

public class Cylinder extends Circle{
    private double height = 1.0;

    public Cylinder() {
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getCylindricalVolumeidth() {
        return Math.PI*Math.pow(getRadius(), 2)*height;
    }

    @Override
    public String toString() {
        return "Cylinder [height=" + height + "]"+ " [radius=" + getRadius() + "]"+ " [color=" + getColor() +"]"+ " [cylindrical volume=" + getCylindricalVolumeidth() +"]";
    } 
}
