package Day7.Excercise.Controller;

import Day7.Excercise.Model.Resizeble.Circle;
import Day7.Excercise.Model.Resizeble.Rectangle;
import Day7.Excercise.Model.Resizeble.Shape;
import Day7.Excercise.Model.Resizeble.Square;

public class MainColorable {
    public static  void  main (String [] args){
        Square square = new Square(9);
        Rectangle rectangle = new Rectangle(6,10);
        Circle circle = new Circle();

        Shape[] shapes = new Shape[3];
        shapes[0] = square;
        shapes[1] = rectangle;
        shapes[2] = circle;

        for (Shape i : shapes){
            System.out.println(i.getArea());
            if (i instanceof Square){
                Square t = (Square) i;
                t.howToColor();
            }
            System.out.println();
        }
    }
}
