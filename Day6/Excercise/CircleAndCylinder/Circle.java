package Day6.Excercise.CircleAndCylinder;

public class Circle {
    private double radius= 1.0;
    private String color= "yellow";
    
    
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public Circle() {
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }
    public double getPerimeter(){
         return 2* radius * Math.PI;
    }
    @Override
    public String toString() {
        return "Circle [color = " + color + ", radius = " + radius + ", perimeter = " + getPerimeter() + ", Area = "+getArea() + "]";
    } 
}
