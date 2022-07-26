package Day6.Excercise.CircleAndCylinder;

public class Main {
    public static void main(String[] args){
        // Circle
        System.out.println("\t\t\t\tCircle ");
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(5.0 , "Red");
        System.out.println(circle);

        // Cylinder
        System.out.println("\n\t\t\t\tCylinder ");
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(5.6);
        System.out.println(cylinder);

        cylinder = new Cylinder(5.6 , "Green" , 8.0);
        System.out.println(cylinder);
    }
    
}
