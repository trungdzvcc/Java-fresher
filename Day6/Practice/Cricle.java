package Day6.Practice;

public class Cricle extends Shap {
    private double radius= 1.0;
    
    public Cricle(String color, boolean field, double radius) {
        super(color, field);
        this.radius = radius;
    }
    public Cricle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public Cricle() {
    }



    public double getArea() {
        return radius * radius * Math.PI;
    }
    public double getPerimeter(){
         return 2* radius * Math.PI;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return  "A Rectangle with width = "+getRadius()+" , which is a subclass of "+super.toString();
    }
    
}
