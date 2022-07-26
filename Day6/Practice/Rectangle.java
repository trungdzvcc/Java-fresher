package Day6.Practice;

public class Rectangle extends Shap{
    private double width =1.0;
    private double length =1.0;
    public Rectangle(String color, boolean field, double width, double length) {
        super(color, field);
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public Rectangle() {
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getArea() {
        return width * length; 
    }
    public double getPerimeter(){
         return width + length;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return  "A Rectangle with width = " +getWidth()+" and length = "+getLength()+", which is a subclass of "+super.toString();
    }
    


    
    
}
