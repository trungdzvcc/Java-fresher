package Day6.Excercise.Triangle;

public class Triangle extends Shape{
    private double side1 =1.0;
    private double side2 =1.0;
    private double side3 =1.0;
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public Triangle() {
    }
    public double getSide1() {
        return side1;
    }
    public void setSide1(double side1) {
        this.side1 = side1;
    }
    public double getSide2() {
        return side2;
    }
    public void setSide2(double side2) {
        this.side2 = side2;
    }
    public double getSide3() {
        return side3;
    }
    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double getArea() {
        double ah = getPerimeter()/2;
        return  Math.sqrt(ah* (ah - side1) * (ah - side2) * (ah - side3)); 
        // chua bat xong tat ca tam giac
        // double ch , c1 ,c2;
        // if(side1>side2&&side1>side3){
        //     ch = side1;
        //     c1=side2;
        //     c2=side3;
        // }else if(side2>side3&&side2>side1){
        //     ch=side2;
        //     c1=side1;
        //     c2=side3;
        // }else{
        //     ch = side3;
        //     c1=side1;
        //     c2=side2;
        // }

        // if(side1 == side2 || side1 == side3 || side2 ==side3) {
        //     double h = Math.sqrt(Math.pow(ch,2)-);
            
        // }else if(side1 == side2 && side1 == side3){
        //     return side1*(Math.sqrt(3)/2);
        // }else if(){
        //     double halfP = (side1+side2+side3) / 2;
        //         double Area = Math.sqrt(halfP  * (halfP - side1) * (halfP - side2) * (halfP - side3));
        //     return Area;
        // }else{
           
        //     return  2 * (Math.sqrt(p*(p-side1)*(p-side2)*(p-side3))/side1);
        // }
    
    }
    
    public double getPerimeter(){
        double p = side1 + side2 + side3;
         return p ;
    }
    @Override
    public String toString() {
        return "Triangle [side1 = " + side1 + ",  side2 = " + side2 + ", side3 = " + side3 + "]";
    }
    
}
    
    

